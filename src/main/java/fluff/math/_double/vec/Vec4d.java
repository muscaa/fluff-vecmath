package fluff.math._double.vec;

public class Vec4d extends AbstractDoubleVec4<Vec4d> {
	
	public double x;
	public double y;
	public double z;
	public double w;
	
	public Vec4d(double x, double y, double z, double w) {
		set(x, y, z, w);
	}
	
	public Vec4d(Vec4d vec) {
		this(vec.x, vec.y, vec.z, vec.w);
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
	protected double getZ() {
		return z;
	}
	
	@Override
	protected double getW() {
		return w;
	}
	
	@Override
	protected void set(double x, double y, double z, double w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	@Override
	public Vec4d copy() {
		return new Vec4d(this);
	}
}
