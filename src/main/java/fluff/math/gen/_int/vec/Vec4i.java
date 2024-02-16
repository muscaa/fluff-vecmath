package fluff.math.gen._int.vec;

public class Vec4i extends AbstractIntVec4<Vec4i> {
	
	public int x;
	public int y;
	public int z;
	public int w;
	
	public Vec4i(int x, int y, int z, int w) {
		set(x, y, z, w);
	}
	
	public Vec4i(Vec4i vec) {
		this(vec.x, vec.y, vec.z, vec.w);
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
	protected int getW() {
		return w;
	}
	
	@Override
	protected void set(int x, int y, int z, int w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	@Override
	public Vec4i copy() {
		return new Vec4i(this);
	}
}
