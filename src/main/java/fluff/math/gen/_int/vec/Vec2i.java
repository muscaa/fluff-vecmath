package fluff.math.gen._int.vec;

public class Vec2i extends AbstractIntVec2<Vec2i> {
	
	public int x;
	public int y;
	
	public Vec2i(int x, int y) {
		set(x, y);
	}
	
	public Vec2i(Vec2i vec) {
		this(vec.x, vec.y);
	}
	
	@Override
	protected int getX() {
		return x;
	}
	
	@Override
	protected int getY() {
		return y;
	}
	
	@Override
	protected void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Vec2i copy() {
		return new Vec2i(this);
	}
}
