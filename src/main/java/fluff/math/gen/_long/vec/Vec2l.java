package fluff.math.gen._long.vec;

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
	protected long getX() {
		return x;
	}
	
	@Override
	protected long getY() {
		return y;
	}
	
	@Override
	protected void set(long x, long y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Vec2l copy() {
		return new Vec2l(this);
	}
}
