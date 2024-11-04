package fluff.vecmath.gen._double.vector;

/**
 * A 3D vector class that provides concrete implementation for 3D vector operations.
 */
public class Vec3d extends AbstractDoubleVec3<Vec3d> {
    
    /**
     * The x-coordinate of the vector.
     */
    public double x;
    
    /**
     * The y-coordinate of the vector.
     */
    public double y;
    
    /**
     * The z-coordinate of the vector.
     */
    public double z;
    
    /**
     * Constructs a new 3D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param z the z-coordinate
     */
    public Vec3d(double x, double y, double z) {
        set(x, y, z);
    }
    
    /**
     * Constructs a new 3D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec3d(Vec3d vec) {
        this(vec.x, vec.y, vec.z);
    }
    
    @Override
    protected double proj_1() {
        return x;
    }
    
    @Override
    protected double proj_2() {
        return y;
    }
    
    @Override
    protected double proj_3() {
        return z;
    }
    
    @Override
    protected Vec3d set(double proj_1, double proj_2, double proj_3) {
        this.x = proj_1;
        this.y = proj_2;
        this.z = proj_3;
        return this;
    }
    
    @Override
    public Vec3d copy() {
        return new Vec3d(this);
    }
}
