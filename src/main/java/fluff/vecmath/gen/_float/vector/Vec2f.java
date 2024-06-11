package fluff.vecmath.gen._float.vector;

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
	protected float proj_1() {
		return x;
	}
	
	@Override
	protected float proj_2() {
		return y;
	}
	
	@Override
	protected void set(float proj_1, float proj_2) {
		this.x = proj_1;
		this.y = proj_2;
	}
	
	@Override
	public Vec2f copy() {
		return new Vec2f(this);
	}
}
