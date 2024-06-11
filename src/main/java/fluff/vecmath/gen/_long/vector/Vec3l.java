package fluff.vecmath.gen._long.vector;

public class Vec3l extends AbstractLongVec3<Vec3l> {
	
	public long x;
	public long y;
	public long z;
	
	public Vec3l(long x, long y, long z) {
		set(x, y, z);
	}
	
	public Vec3l(Vec3l vec) {
		this(vec.x, vec.y, vec.z);
	}
	
	@Override
	protected long proj_1() {
		return x;
	}
	
	@Override
	protected long proj_2() {
		return y;
	}
	
	@Override
	protected long proj_3() {
		return z;
	}
	
	@Override
	protected void set(long proj_1, long proj_2, long proj_3) {
		this.x = proj_1;
		this.y = proj_2;
		this.z = proj_3;
	}
	
	@Override
	public Vec3l copy() {
		return new Vec3l(this);
	}
}
