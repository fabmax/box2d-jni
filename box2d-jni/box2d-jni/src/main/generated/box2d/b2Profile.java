package box2d;


/**
 * Profiling data. Times are in milliseconds.
 */
public class b2Profile extends NativeObject {

    private static native int __sizeOf();
    public static final int SIZEOF = __sizeOf();
    public static final int ALIGNOF = 8;
    
    public static b2Profile wrapPointer(long address) {
        return address != 0L ? new b2Profile(address) : null;
    }
    
    public static b2Profile arrayGet(long baseAddress, int index) {
        if (baseAddress == 0L) throw new NullPointerException("baseAddress is 0");
        return wrapPointer(baseAddress + (long) SIZEOF * index);
    }
    
    protected b2Profile(long address) {
        super(address);
    }

    // Constructors

    public b2Profile() {
        address = Raw.b2Profile();
    }

    // Destructor

    public void destroy() {
        if (address == 0L) {
            throw new IllegalStateException(this + " is already deleted");
        }
        if (isExternallyAllocated) {
            throw new IllegalStateException(this + " is externally allocated and cannot be manually destroyed");
        }
        Raw.destroy(address);
        address = 0L;
    }

    // Attributes

    /**
     */
    public float getStep() {
        checkNotNull();
        return Raw.getStep(address);
    }

    /**
     */
    public void setStep(float value) {
        checkNotNull();
        Raw.setStep(address, value);
    }

    /**
     */
    public float getPairs() {
        checkNotNull();
        return Raw.getPairs(address);
    }

    /**
     */
    public void setPairs(float value) {
        checkNotNull();
        Raw.setPairs(address, value);
    }

    /**
     */
    public float getCollide() {
        checkNotNull();
        return Raw.getCollide(address);
    }

    /**
     */
    public void setCollide(float value) {
        checkNotNull();
        Raw.setCollide(address, value);
    }

    /**
     */
    public float getSolve() {
        checkNotNull();
        return Raw.getSolve(address);
    }

    /**
     */
    public void setSolve(float value) {
        checkNotNull();
        Raw.setSolve(address, value);
    }

    /**
     */
    public float getMergeIslands() {
        checkNotNull();
        return Raw.getMergeIslands(address);
    }

    /**
     */
    public void setMergeIslands(float value) {
        checkNotNull();
        Raw.setMergeIslands(address, value);
    }

    /**
     */
    public float getPrepareStages() {
        checkNotNull();
        return Raw.getPrepareStages(address);
    }

    /**
     */
    public void setPrepareStages(float value) {
        checkNotNull();
        Raw.setPrepareStages(address, value);
    }

    /**
     */
    public float getSolveConstraints() {
        checkNotNull();
        return Raw.getSolveConstraints(address);
    }

    /**
     */
    public void setSolveConstraints(float value) {
        checkNotNull();
        Raw.setSolveConstraints(address, value);
    }

    /**
     */
    public float getPrepareConstraints() {
        checkNotNull();
        return Raw.getPrepareConstraints(address);
    }

    /**
     */
    public void setPrepareConstraints(float value) {
        checkNotNull();
        Raw.setPrepareConstraints(address, value);
    }

    /**
     */
    public float getIntegrateVelocities() {
        checkNotNull();
        return Raw.getIntegrateVelocities(address);
    }

    /**
     */
    public void setIntegrateVelocities(float value) {
        checkNotNull();
        Raw.setIntegrateVelocities(address, value);
    }

    /**
     */
    public float getWarmStart() {
        checkNotNull();
        return Raw.getWarmStart(address);
    }

    /**
     */
    public void setWarmStart(float value) {
        checkNotNull();
        Raw.setWarmStart(address, value);
    }

    /**
     */
    public float getSolveImpulses() {
        checkNotNull();
        return Raw.getSolveImpulses(address);
    }

    /**
     */
    public void setSolveImpulses(float value) {
        checkNotNull();
        Raw.setSolveImpulses(address, value);
    }

    /**
     */
    public float getIntegratePositions() {
        checkNotNull();
        return Raw.getIntegratePositions(address);
    }

    /**
     */
    public void setIntegratePositions(float value) {
        checkNotNull();
        Raw.setIntegratePositions(address, value);
    }

    /**
     */
    public float getRelaxImpulses() {
        checkNotNull();
        return Raw.getRelaxImpulses(address);
    }

    /**
     */
    public void setRelaxImpulses(float value) {
        checkNotNull();
        Raw.setRelaxImpulses(address, value);
    }

    /**
     */
    public float getApplyRestitution() {
        checkNotNull();
        return Raw.getApplyRestitution(address);
    }

    /**
     */
    public void setApplyRestitution(float value) {
        checkNotNull();
        Raw.setApplyRestitution(address, value);
    }

    /**
     */
    public float getStoreImpulses() {
        checkNotNull();
        return Raw.getStoreImpulses(address);
    }

    /**
     */
    public void setStoreImpulses(float value) {
        checkNotNull();
        Raw.setStoreImpulses(address, value);
    }

    /**
     */
    public float getSplitIslands() {
        checkNotNull();
        return Raw.getSplitIslands(address);
    }

    /**
     */
    public void setSplitIslands(float value) {
        checkNotNull();
        Raw.setSplitIslands(address, value);
    }

    /**
     */
    public float getTransforms() {
        checkNotNull();
        return Raw.getTransforms(address);
    }

    /**
     */
    public void setTransforms(float value) {
        checkNotNull();
        Raw.setTransforms(address, value);
    }

    /**
     */
    public float getHitEvents() {
        checkNotNull();
        return Raw.getHitEvents(address);
    }

    /**
     */
    public void setHitEvents(float value) {
        checkNotNull();
        Raw.setHitEvents(address, value);
    }

    /**
     */
    public float getRefit() {
        checkNotNull();
        return Raw.getRefit(address);
    }

    /**
     */
    public void setRefit(float value) {
        checkNotNull();
        Raw.setRefit(address, value);
    }

    /**
     */
    public float getBullets() {
        checkNotNull();
        return Raw.getBullets(address);
    }

    /**
     */
    public void setBullets(float value) {
        checkNotNull();
        Raw.setBullets(address, value);
    }

    /**
     */
    public float getSleepIslands() {
        checkNotNull();
        return Raw.getSleepIslands(address);
    }

    /**
     */
    public void setSleepIslands(float value) {
        checkNotNull();
        Raw.setSleepIslands(address, value);
    }

    /**
     */
    public float getSensors() {
        checkNotNull();
        return Raw.getSensors(address);
    }

    /**
     */
    public void setSensors(float value) {
        checkNotNull();
        Raw.setSensors(address, value);
    }

    public static class Raw {
        public static native long b2Profile();
        public static native void destroy(long address);
        public static native float getStep(long address);
        public static native void setStep(long address, float value);
        public static native float getPairs(long address);
        public static native void setPairs(long address, float value);
        public static native float getCollide(long address);
        public static native void setCollide(long address, float value);
        public static native float getSolve(long address);
        public static native void setSolve(long address, float value);
        public static native float getMergeIslands(long address);
        public static native void setMergeIslands(long address, float value);
        public static native float getPrepareStages(long address);
        public static native void setPrepareStages(long address, float value);
        public static native float getSolveConstraints(long address);
        public static native void setSolveConstraints(long address, float value);
        public static native float getPrepareConstraints(long address);
        public static native void setPrepareConstraints(long address, float value);
        public static native float getIntegrateVelocities(long address);
        public static native void setIntegrateVelocities(long address, float value);
        public static native float getWarmStart(long address);
        public static native void setWarmStart(long address, float value);
        public static native float getSolveImpulses(long address);
        public static native void setSolveImpulses(long address, float value);
        public static native float getIntegratePositions(long address);
        public static native void setIntegratePositions(long address, float value);
        public static native float getRelaxImpulses(long address);
        public static native void setRelaxImpulses(long address, float value);
        public static native float getApplyRestitution(long address);
        public static native void setApplyRestitution(long address, float value);
        public static native float getStoreImpulses(long address);
        public static native void setStoreImpulses(long address, float value);
        public static native float getSplitIslands(long address);
        public static native void setSplitIslands(long address, float value);
        public static native float getTransforms(long address);
        public static native void setTransforms(long address, float value);
        public static native float getHitEvents(long address);
        public static native void setHitEvents(long address, float value);
        public static native float getRefit(long address);
        public static native void setRefit(long address, float value);
        public static native float getBullets(long address);
        public static native void setBullets(long address, float value);
        public static native float getSleepIslands(long address);
        public static native void setSleepIslands(long address, float value);
        public static native float getSensors(long address);
        public static native void setSensors(long address, float value);
    }
}
