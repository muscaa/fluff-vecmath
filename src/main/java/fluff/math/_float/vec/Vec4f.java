package fluff.math._float.vec;

public class Vec4f extends AbstractFloatVec4<Vec4f> {
	
	public float x;
	public float y;
	public float z;
	public float w;
	
	public Vec4f(float x, float y, float z, float w) {
		set(x, y, z, w);
	}
	
	public Vec4f(Vec4f vec) {
		this(vec.x, vec.y, vec.z, vec.w);
	}
	
	@Override
	protected float getX() {
		return x;
	}
	
	@Override
	protected float getY() {
		return y;
	}
	
	@Override
	protected float getZ() {
		return z;
	}
	
	@Override
	protected float getW() {
		return w;
	}
	
	@Override
	protected void set(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	@Override
	public Vec4f copy() {
		return new Vec4f(this);
	}
}
