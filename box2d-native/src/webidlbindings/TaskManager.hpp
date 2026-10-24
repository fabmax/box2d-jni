#pragma once

static void* EnqueueTask(b2TaskCallbackFcn* box2dTask, void* box2dContext, void* context);
static void FinishTask(void* userTask, void* context);

class TaskManager {
public:
	virtual ~TaskManager() = default;

	void install(b2WorldDef& worldDef, int threadCount) {
	    this->threadCount = threadCount;
		worldDef.enqueueTask = EnqueueTask;
		worldDef.finishTask = FinishTask;
		worldDef.workerCount = threadCount;
		worldDef.userTaskContext = this;
	}

    /// Runs the given box2d task. Box2D expects each enqueued task to be executed exactly once.
    void executeTask(uint64_t box2dTask, uint64_t box2dContext) {
        ((b2TaskCallbackFcn*) box2dTask)((void*) box2dContext);
    }

    /// Enqueues a box2d task, which must be executed exactly once by calling executeTask(). Returns a
    /// user task handle, which is passed to finishTask() once box2d needs the task to be completed.
    /// Returning 0 indicates that the task was executed serially within this call and there is no need
    /// to call finishTask().
    virtual unsigned long long enqueueTask(unsigned long long box2dTask, unsigned long long box2dContext) = 0;
    virtual void finishTask(unsigned long long userTask) = 0;

    int threadCount;
};

static void* EnqueueTask(b2TaskCallbackFcn* box2dTask, void* box2dContext, void* context) {
    TaskManager* taskManager = (TaskManager*) context;
    return (void*) taskManager->enqueueTask((uint64_t) box2dTask, (uint64_t) box2dContext);
}

static void FinishTask(void* userTask, void* context) {
    TaskManager* taskManager = (TaskManager*) context;
    return taskManager->finishTask((uint64_t) userTask);
}
