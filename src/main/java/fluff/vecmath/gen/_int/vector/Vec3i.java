package fluff.vecmath.gen._int.vector;

public class Vec3i extends AbstractIntVec3<Vec3i> {
	
	public int x;
	public int y;
	public int z;
	
	public Vec3i(int x, int y, int z) {
		set(x, y, z);
	}
	
	public Vec3i(Vec3i vec) {
		this(vec.x, vec.y, vec.z);
	}
	
	@Override
	protected int proj_1() {
		return x;
	}
	
	@Override
	protected int proj_2() {
		return y;
	}
	
	@Override
	protected int proj_3() {
		return z;
	}
	
	@Override
	protected void set(int proj_1, int proj_2, int proj_3) {
		this.x = proj_1;
		this.y = proj_2;
		this.z = proj_3;
	}
	
	@Override
	public Vec3i copy() {
		return new Vec3i(this);
	}
}
