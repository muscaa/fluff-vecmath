package fluff.vecmath.gen._float.vector;

/**
 * A 3D vector class that provides concrete implementation for 3D vector operations.
 */
public class Vec3f extends AbstractFloatVec3<Vec3f> {
    
    /**
     * The x-coordinate of the vector.
     */
    public float x;
    
    /**
     * The y-coordinate of the vector.
     */
    public float y;
    
    /**
     * The z-coordinate of the vector.
     */
    public float z;
    
    /**
     * Constructs a new 3D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param z the z-coordinate
     */
    public Vec3f(float x, float y, float z) {
        set(x, y, z);
    }
    
    /**
     * Constructs a new 3D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec3f(Vec3f vec) {
        this(vec.x, vec.y, vec.z);
    }
    
    @Override
    protected float proj_1() {
        return x;
    }
    
    @Override
    protected float proj_2() {
        return y;
    }
    
    @Override
    protected float proj_3() {
        return z;
    }
    
    @Override
    protected Vec3f set(float proj_1, float proj_2, float proj_3) {
        this.x = proj_1;
        this.y = proj_2;
        this.z = proj_3;
        return this;
    }
    
    @Override
    public Vec3f copy() {
        return new Vec3f(this);
    }
}
