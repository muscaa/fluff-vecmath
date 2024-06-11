package fluff.vecmath.gen._long.vector;

public class Vec2l extends AbstractLongVec2<Vec2l> {
	
	public long x;
	public long y;
	
	public Vec2l(long x, long y) {
		set(x, y);
	}
	
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
	protected void set(long proj_1, long proj_2) {
		this.x = proj_1;
		this.y = proj_2;
	}
	
	@Override
	public Vec2l copy() {
		return new Vec2l(this);
	}
}
