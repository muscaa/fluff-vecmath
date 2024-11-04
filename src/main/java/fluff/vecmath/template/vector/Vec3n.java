package fluff.vecmath.template.vector;

/**
 * A 3D vector class that provides concrete implementation for 3D vector operations.
 */
public class Vec3n extends AbstractNumberVec3<Vec3n> {
    
    /**
     * The x-coordinate of the vector.
     */
    public /*number*/double x;
    
    /**
     * The y-coordinate of the vector.
     */
    public /*number*/double y;
    
    /**
     * The z-coordinate of the vector.
     */
    public /*number*/double z;
    
    /**
     * Constructs a new 3D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param z the z-coordinate
     */
    public Vec3n(/*number*/double x, /*number*/double y, /*number*/double z) {
        set(x, y, z);
    }
    
    /**
     * Constructs a new 3D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec3n(Vec3n vec) {
        this(vec.x, vec.y, vec.z);
    }
    
    @Override
    protected /*number*/double proj_1() {
        return x;
    }
    
    @Override
    protected /*number*/double proj_2() {
        return y;
    }
    
    @Override
    protected /*number*/double proj_3() {
        return z;
    }
    
    @Override
    protected Vec3n set(/*number*/double proj_1, /*number*/double proj_2, /*number*/double proj_3) {
        this.x = proj_1;
        this.y = proj_2;
        this.z = proj_3;
        return this;
    }
    
    @Override
    public Vec3n copy() {
        return new Vec3n(this);
    }
}
