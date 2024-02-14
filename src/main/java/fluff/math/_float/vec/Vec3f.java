package fluff.math._float.vec;

public class Vec3f extends AbstractFloatVec3<Vec3f> {
	
	public float x;
	public float y;
	public float z;
	
	public Vec3f(float x, float y, float z) {
		set(x, y, z);
	}
	
	public Vec3f(Vec3f vec) {
		this(vec.x, vec.y, vec.z);
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
	protected void set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public Vec3f copy() {
		return new Vec3f(this);
	}
}
