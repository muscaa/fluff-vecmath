package fluff.vecmath.gen._float.vector;

/**
 * A 2D vector class that provides concrete implementation for 2D vector operations.
 */
public class Vec2f extends AbstractFloatVec2<Vec2f> {
    
    /**
     * The x-coordinate of the vector.
     */
    public float x;
    
    /**
     * The y-coordinate of the vector.
     */
    public float y;
    
    /**
     * Constructs a new 2D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Vec2f(float x, float y) {
        set(x, y);
    }
    
    /**
     * Constructs a new 2D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec2f(Vec2f vec) {
        this(vec.x, vec.y);
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
    protected Vec2f set(float proj_1, float proj_2) {
        this.x = proj_1;
        this.y = proj_2;
        return this;
    }
    
    @Override
    public Vec2f copy() {
        return new Vec2f(this);
    }
}
