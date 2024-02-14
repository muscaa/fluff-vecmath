package fluff.math._long.vec;

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
	protected long getX() {
		return x;
	}
	
	@Override
	protected long getY() {
		return y;
	}
	
	@Override
	protected long getZ() {
		return z;
	}
	
	@Override
	protected void set(long x, long y, long z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public Vec3l copy() {
		return new Vec3l(this);
	}
}
