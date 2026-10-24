package de.fabmax.box2djni;

import box2d.TaskManagerImpl;
import box2d.b2WorldDef;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

public class DefaultTaskManager extends TaskManagerImpl {
    private final Map<Long, Future<?>> activeTasks = new ConcurrentHashMap<>();
    private final AtomicLong nextTaskId = new AtomicLong(1);
    private final ExecutorService executor;

    public DefaultTaskManager(b2WorldDef worldDef, int threadCount) {
        executor = Executors.newFixedThreadPool(threadCount, TaskThread::new);
        install(worldDef, threadCount);
    }

    @Override
    public long enqueueTask(long box2dTask, long box2dContext) {
        var taskId = nextTaskId.getAndIncrement();
        activeTasks.put(taskId, executor.submit(() -> executeTask(box2dTask, box2dContext)));
        return taskId;
    }

    @Override
    public void finishTask(long userTask) {
        try {
            activeTasks.remove(userTask).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static class TaskThread extends Thread {
        TaskThread(Runnable r) {
            super(r);
            setDaemon(true);
        }
    }
}
