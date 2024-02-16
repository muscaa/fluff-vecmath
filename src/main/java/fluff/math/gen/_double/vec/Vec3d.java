package fluff.math.gen._double.vec;

public class Vec3d extends AbstractDoubleVec3<Vec3d> {
	
	public double x;
	public double y;
	public double z;
	
	public Vec3d(double x, double y, double z) {
		set(x, y, z);
	}
	
	public Vec3d(Vec3d vec) {
		this(vec.x, vec.y, vec.z);
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
	protected void set(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public Vec3d copy() {
		return new Vec3d(this);
	}
}
