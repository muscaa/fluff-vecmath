package fluff.vecmath.gen._int.vector;

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
