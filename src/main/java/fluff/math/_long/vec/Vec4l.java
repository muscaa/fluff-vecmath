package fluff.math._long.vec;

public class Vec4l extends AbstractLongVec4<Vec4l> {
	
	public long x;
	public long y;
	public long z;
	public long w;
	
	public Vec4l(long x, long y, long z, long w) {
		set(x, y, z, w);
	}
	
	public Vec4l(Vec4l vec) {
		this(vec.x, vec.y, vec.z, vec.w);
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
	protected long getW() {
		return w;
	}
	
	@Override
	protected void set(long x, long y, long z, long w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	@Override
	public Vec4l copy() {
		return new Vec4l(this);
	}
}
