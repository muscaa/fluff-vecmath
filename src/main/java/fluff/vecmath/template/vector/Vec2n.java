package fluff.vecmath.template.vector;

/**
 * A 2D vector class that provides concrete implementation for 2D vector operations.
 */
public class Vec2n extends AbstractNumberVec2<Vec2n> {
    
    /**
     * The x-coordinate of the vector.
     */
    public /*number*/double x;
    
    /**
     * The y-coordinate of the vector.
     */
    public /*number*/double y;
    
    /**
     * Constructs a new 2D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Vec2n(/*number*/double x, /*number*/double y) {
        set(x, y);
    }
    
    /**
     * Constructs a new 2D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec2n(Vec2n vec) {
        this(vec.x, vec.y);
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
    protected Vec2n set(/*number*/double proj_1, /*number*/double proj_2) {
        this.x = proj_1;
        this.y = proj_2;
        return this;
    }
    
    @Override
    public Vec2n copy() {
        return new Vec2n(this);
    }
}
