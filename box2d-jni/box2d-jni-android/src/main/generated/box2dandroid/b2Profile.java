package box2dandroid;


/**
 * Profiling data. Times are in milliseconds.
 * @ingroup world
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

    public float getStep() {
        checkNotNull();
        return Raw.getStep(address);
    }

    public void setStep(float value) {
        checkNotNull();
        Raw.setStep(address, value);
    }

    /**
     * &lt;
     */
    public float getPairs() {
        checkNotNull();
        return Raw.getPairs(address);
    }

    /**
     * &lt;
     */
    public void setPairs(float value) {
        checkNotNull();
        Raw.setPairs(address, value);
    }

    /**
     * &lt;
     */
    public float getCollide() {
        checkNotNull();
        return Raw.getCollide(address);
    }

    /**
     * &lt;
     */
    public void setCollide(float value) {
        checkNotNull();
        Raw.setCollide(address, value);
    }

    /**
     * &lt;
     */
    public float getSolve() {
        checkNotNull();
        return Raw.getSolve(address);
    }

    /**
     * &lt;
     */
    public void setSolve(float value) {
        checkNotNull();
        Raw.setSolve(address, value);
    }

    /**
     * &lt;
     */
    public float getSolverSetup() {
        checkNotNull();
        return Raw.getSolverSetup(address);
    }

    /**
     * &lt;
     */
    public void setSolverSetup(float value) {
        checkNotNull();
        Raw.setSolverSetup(address, value);
    }

    /**
     * &lt;
     */
    public float getConstraints() {
        checkNotNull();
        return Raw.getConstraints(address);
    }

    /**
     * &lt;
     */
    public void setConstraints(float value) {
        checkNotNull();
        Raw.setConstraints(address, value);
    }

    /**
     * &lt;
     */
    public float getPrepareConstraints() {
        checkNotNull();
        return Raw.getPrepareConstraints(address);
    }

    /**
     * &lt;
     */
    public void setPrepareConstraints(float value) {
        checkNotNull();
        Raw.setPrepareConstraints(address, value);
    }

    /**
     * &lt;
     */
    public float getIntegrateVelocities() {
        checkNotNull();
        return Raw.getIntegrateVelocities(address);
    }

    /**
     * &lt;
     */
    public void setIntegrateVelocities(float value) {
        checkNotNull();
        Raw.setIntegrateVelocities(address, value);
    }

    /**
     * &lt;
     */
    public float getWarmStart() {
        checkNotNull();
        return Raw.getWarmStart(address);
    }

    /**
     * &lt;
     */
    public void setWarmStart(float value) {
        checkNotNull();
        Raw.setWarmStart(address, value);
    }

    /**
     * &lt;
     */
    public float getSolveImpulses() {
        checkNotNull();
        return Raw.getSolveImpulses(address);
    }

    /**
     * &lt;
     */
    public void setSolveImpulses(float value) {
        checkNotNull();
        Raw.setSolveImpulses(address, value);
    }

    /**
     * &lt;
     */
    public float getIntegratePositions() {
        checkNotNull();
        return Raw.getIntegratePositions(address);
    }

    /**
     * &lt;
     */
    public void setIntegratePositions(float value) {
        checkNotNull();
        Raw.setIntegratePositions(address, value);
    }

    /**
     * &lt;
     */
    public float getRelaxImpulses() {
        checkNotNull();
        return Raw.getRelaxImpulses(address);
    }

    /**
     * &lt;
     */
    public void setRelaxImpulses(float value) {
        checkNotNull();
        Raw.setRelaxImpulses(address, value);
    }

    /**
     * &lt;
     */
    public float getRestitution() {
        checkNotNull();
        return Raw.getRestitution(address);
    }

    /**
     * &lt;
     */
    public void setRestitution(float value) {
        checkNotNull();
        Raw.setRestitution(address, value);
    }

    /**
     * &lt;
     */
    public float getStoreImpulses() {
        checkNotNull();
        return Raw.getStoreImpulses(address);
    }

    /**
     * &lt;
     */
    public void setStoreImpulses(float value) {
        checkNotNull();
        Raw.setStoreImpulses(address, value);
    }

    /**
     * &lt;
     */
    public float getSplitIslands() {
        checkNotNull();
        return Raw.getSplitIslands(address);
    }

    /**
     * &lt;
     */
    public void setSplitIslands(float value) {
        checkNotNull();
        Raw.setSplitIslands(address, value);
    }

    /**
     * &lt;
     */
    public float getTransforms() {
        checkNotNull();
        return Raw.getTransforms(address);
    }

    /**
     * &lt;
     */
    public void setTransforms(float value) {
        checkNotNull();
        Raw.setTransforms(address, value);
    }

    /**
     * &lt;
     */
    public float getSensorHits() {
        checkNotNull();
        return Raw.getSensorHits(address);
    }

    /**
     * &lt;
     */
    public void setSensorHits(float value) {
        checkNotNull();
        Raw.setSensorHits(address, value);
    }

    /**
     * &lt;
     */
    public float getJointEvents() {
        checkNotNull();
        return Raw.getJointEvents(address);
    }

    /**
     * &lt;
     */
    public void setJointEvents(float value) {
        checkNotNull();
        Raw.setJointEvents(address, value);
    }

    /**
     * &lt;
     */
    public float getHitEvents() {
        checkNotNull();
        return Raw.getHitEvents(address);
    }

    /**
     * &lt;
     */
    public void setHitEvents(float value) {
        checkNotNull();
        Raw.setHitEvents(address, value);
    }

    /**
     * &lt;
     */
    public float getRefit() {
        checkNotNull();
        return Raw.getRefit(address);
    }

    /**
     * &lt;
     */
    public void setRefit(float value) {
        checkNotNull();
        Raw.setRefit(address, value);
    }

    /**
     * &lt;
     */
    public float getBullets() {
        checkNotNull();
        return Raw.getBullets(address);
    }

    /**
     * &lt;
     */
    public void setBullets(float value) {
        checkNotNull();
        Raw.setBullets(address, value);
    }

    /**
     * &lt;
     */
    public float getSleepIslands() {
        checkNotNull();
        return Raw.getSleepIslands(address);
    }

    /**
     * &lt;
     */
    public void setSleepIslands(float value) {
        checkNotNull();
        Raw.setSleepIslands(address, value);
    }

    /**
     * &lt;
     */
    public float getSensors() {
        checkNotNull();
        return Raw.getSensors(address);
    }

    /**
     * &lt;
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
        public static native float getSolverSetup(long address);
        public static native void setSolverSetup(long address, float value);
        public static native float getConstraints(long address);
        public static native void setConstraints(long address, float value);
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
        public static native float getRestitution(long address);
        public static native void setRestitution(long address, float value);
        public static native float getStoreImpulses(long address);
        public static native void setStoreImpulses(long address, float value);
        public static native float getSplitIslands(long address);
        public static native void setSplitIslands(long address, float value);
        public static native float getTransforms(long address);
        public static native void setTransforms(long address, float value);
        public static native float getSensorHits(long address);
        public static native void setSensorHits(long address, float value);
        public static native float getJointEvents(long address);
        public static native void setJointEvents(long address, float value);
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
