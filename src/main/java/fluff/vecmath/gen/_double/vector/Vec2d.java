package fluff.vecmath.gen._double.vector;

public class Vec2d extends AbstractDoubleVec2<Vec2d> {
	
	public double x;
	public double y;
	
	public Vec2d(double x, double y) {
		set(x, y);
	}
	
	public Vec2d(Vec2d vec) {
		this(vec.x, vec.y);
	}
	
	@Override
	protected double proj_1() {
		return x;
	}
	
	@Override
	protected double proj_2() {
		return y;
	}
	
	@Override
	protected void set(double proj_1, double proj_2) {
		this.x = proj_1;
		this.y = proj_2;
	}
	
	@Override
	public Vec2d copy() {
		return new Vec2d(this);
	}
}
