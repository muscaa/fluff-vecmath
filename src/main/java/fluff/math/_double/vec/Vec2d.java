package fluff.math._double.vec;

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
	protected double getX() {
		return x;
	}
	
	@Override
	protected double getY() {
		return y;
	}
	
	@Override
	protected void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Vec2d copy() {
		return new Vec2d(this);
	}
}
