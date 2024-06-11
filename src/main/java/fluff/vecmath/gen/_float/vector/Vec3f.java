package fluff.vecmath.gen._float.vector;

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
	protected float proj_1() {
		return x;
	}
	
	@Override
	protected float proj_2() {
		return y;
	}
	
	@Override
	protected float proj_3() {
		return z;
	}
	
	@Override
	protected void set(float proj_1, float proj_2, float proj_3) {
		this.x = proj_1;
		this.y = proj_2;
		this.z = proj_3;
	}
	
	@Override
	public Vec3f copy() {
		return new Vec3f(this);
	}
}
