package fluff.vecmath.gen._double.vector;

/**
 * A 2D vector class that provides concrete implementation for 2D vector operations.
 */
public class Vec2d extends AbstractDoubleVec2<Vec2d> {
    
    /**
     * The x-coordinate of the vector.
     */
    public double x;
    
    /**
     * The y-coordinate of the vector.
     */
    public double y;
    
    /**
     * Constructs a new 2D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Vec2d(double x, double y) {
        set(x, y);
    }
    
    /**
     * Constructs a new 2D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec2d(Vec2d vec) {
        this(vec.x, vec.y);
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
    protected Vec2d set(double proj_1, double proj_2) {
        this.x = proj_1;
        this.y = proj_2;
        return this;
    }
    
    @Override
    public Vec2d copy() {
        return new Vec2d(this);
    }
}
