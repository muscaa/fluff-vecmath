package fluff.vecmath.gen._long.vector;

/**
 * A 3D vector class that provides concrete implementation for 3D vector operations.
 */
public class Vec3l extends AbstractLongVec3<Vec3l> {
    
    /**
     * The x-coordinate of the vector.
     */
    public long x;
    
    /**
     * The y-coordinate of the vector.
     */
    public long y;
    
    /**
     * The z-coordinate of the vector.
     */
    public long z;
    
    /**
     * Constructs a new 3D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param z the z-coordinate
     */
    public Vec3l(long x, long y, long z) {
        set(x, y, z);
    }
    
    /**
     * Constructs a new 3D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec3l(Vec3l vec) {
        this(vec.x, vec.y, vec.z);
    }
    
    @Override
    protected long proj_1() {
        return x;
    }
    
    @Override
    protected long proj_2() {
        return y;
    }
    
    @Override
    protected long proj_3() {
        return z;
    }
    
    @Override
    protected Vec3l set(long proj_1, long proj_2, long proj_3) {
        this.x = proj_1;
        this.y = proj_2;
        this.z = proj_3;
        return this;
    }
    
    @Override
    public Vec3l copy() {
        return new Vec3l(this);
    }
}
