package fluff.vecmath.gen._int.vector;

/**
 * A 2D vector class that provides concrete implementation for 2D vector operations.
 */
public class Vec2i extends AbstractIntVec2<Vec2i> {
    
    /**
     * The x-coordinate of the vector.
     */
    public int x;
    
    /**
     * The y-coordinate of the vector.
     */
    public int y;
    
    /**
     * Constructs a new 2D vector with the specified coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Vec2i(int x, int y) {
        set(x, y);
    }
    
    /**
     * Constructs a new 2D vector by copying the coordinates from the specified vector.
     *
     * @param vec the vector to copy
     */
    public Vec2i(Vec2i vec) {
        this(vec.x, vec.y);
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
    protected void set(int proj_1, int proj_2) {
        this.x = proj_1;
        this.y = proj_2;
    }
    
    @Override
    public Vec2i copy() {
        return new Vec2i(this);
    }
}
