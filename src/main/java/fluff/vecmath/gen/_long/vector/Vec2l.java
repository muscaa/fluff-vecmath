package fluff.vecmath.gen._long.vector;

/**
 * A 2D vector class that provides concrete implementation for 2D vector operations.
 */
public class Vec2l extends AbstractLongVec2<Vec2l> {
    
    /**
     * The x-coordinate of the vector.
     */
    public long x;
    
    /**
     * The y-coordinate of the vector.
     */
    public long y;
    
    /**
     * Constructs a new 2D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Vec2l(long x, long y) {
        set(x, y);
    }
    
    /**
     * Constructs a new 2D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec2l(Vec2l vec) {
        this(vec.x, vec.y);
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
    protected Vec2l set(long proj_1, long proj_2) {
        this.x = proj_1;
        this.y = proj_2;
        return this;
    }
    
    @Override
    public Vec2l copy() {
        return new Vec2l(this);
    }
}
