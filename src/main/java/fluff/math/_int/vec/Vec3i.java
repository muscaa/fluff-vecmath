package fluff.math._int.vec;

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
	protected int getX() {
		return x;
	}
	
	@Override
	protected int getY() {
		return y;
	}
	
	@Override
	protected int getZ() {
		return z;
	}
	
	@Override
	protected void set(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public Vec3i copy() {
		return new Vec3i(this);
	}
}
