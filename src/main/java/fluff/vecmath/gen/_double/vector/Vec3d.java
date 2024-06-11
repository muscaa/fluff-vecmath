package fluff.vecmath.gen._double.vector;

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
	protected double proj_1() {
		return x;
	}
	
	@Override
	protected double proj_2() {
		return y;
	}
	
	@Override
	protected double proj_3() {
		return z;
	}
	
	@Override
	protected void set(double proj_1, double proj_2, double proj_3) {
		this.x = proj_1;
		this.y = proj_2;
		this.z = proj_3;
	}
	
	@Override
	public Vec3d copy() {
		return new Vec3d(this);
	}
}
