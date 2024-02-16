package fluff.math.gen._float.vec;

public class Vec2f extends AbstractFloatVec2<Vec2f> {
	
	public float x;
	public float y;
	
	public Vec2f(float x, float y) {
		set(x, y);
	}
	
	public Vec2f(Vec2f vec) {
		this(vec.x, vec.y);
	}
	
	@Override
	protected float getX() {
		return x;
	}
	
	@Override
	protected float getY() {
		return y;
	}
	
	@Override
	protected void set(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Vec2f copy() {
		return new Vec2f(this);
	}
}
