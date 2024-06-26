package fluff.vecmath.gen._int.vector;

/**
 * A 3D vector class that provides concrete implementation for 3D vector operations.
 */
public class Vec3i extends AbstractIntVec3<Vec3i> {
    
    /**
     * The x-coordinate of the vector.
     */
    public int x;
    
    /**
     * The y-coordinate of the vector.
     */
    public int y;
    
    /**
     * The z-coordinate of the vector.
     */
    public int z;
    
    /**
     * Constructs a new 3D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param z the z-coordinate
     */
    public Vec3i(int x, int y, int z) {
        set(x, y, z);
    }
    
    /**
     * Constructs a new 3D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec3i(Vec3i vec) {
        this(vec.x, vec.y, vec.z);
    }
    
    @Override
    protected int proj_1() {
        return x;
    }
    
    @Override
    protected int proj_2() {
        return y;
    }
    
    @Override
    protected int proj_3() {
        return z;
    }
    
    @Override
    protected void set(int proj_1, int proj_2, int proj_3) {
        this.x = proj_1;
        this.y = proj_2;
        this.z = proj_3;
    }
    
    @Override
    public Vec3i copy() {
        return new Vec3i(this);
    }
}
