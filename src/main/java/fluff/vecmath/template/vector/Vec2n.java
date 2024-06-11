package fluff.vecmath.template.vector;

public class Vec2n extends AbstractNumberVec2<Vec2n> {
	
	public /*number*/double x;
	public /*number*/double y;
	
	public Vec2n(/*number*/double x, /*number*/double y) {
		set(x, y);
	}
	
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
	protected void set(/*number*/double proj_1, /*number*/double proj_2) {
		this.x = proj_1;
		this.y = proj_2;
	}
	
	@Override
	public Vec2n copy() {
		return new Vec2n(this);
	}
}
