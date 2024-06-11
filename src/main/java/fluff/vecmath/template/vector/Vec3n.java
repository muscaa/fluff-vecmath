package fluff.vecmath.template.vector;

public class Vec3n extends AbstractNumberVec3<Vec3n> {
	
	public /*number*/double x;
	public /*number*/double y;
	public /*number*/double z;
	
	public Vec3n(/*number*/double x, /*number*/double y, /*number*/double z) {
		set(x, y, z);
	}
	
	public Vec3n(Vec3n vec) {
		this(vec.x, vec.y, vec.z);
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
	protected /*number*/double proj_3() {
		return z;
	}
	
	@Override
	protected void set(/*number*/double proj_1, /*number*/double proj_2, /*number*/double proj_3) {
		this.x = proj_1;
		this.y = proj_2;
		this.z = proj_3;
	}
	
	@Override
	public Vec3n copy() {
		return new Vec3n(this);
	}
}
