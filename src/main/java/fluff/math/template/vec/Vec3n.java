package fluff.math.template.vec;

public class Vec3n extends AbstractNumberVec3<Vec3n> {
	
	public /*number*/int x;
	public /*number*/int y;
	public /*number*/int z;
	
	public Vec3n(/*number*/int x, /*number*/int y, /*number*/int z) {
		set(x, y, z);
	}
	
	public Vec3n(Vec3n vec) {
		this(vec.x, vec.y, vec.z);
	}
	
	@Override
	protected /*number*/int getX() {
		return x;
	}
	
	@Override
	protected /*number*/int getY() {
		return y;
	}
	
	@Override
	protected /*number*/int getZ() {
		return z;
	}
	
	@Override
	protected void set(/*number*/int x, /*number*/int y, /*number*/int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public Vec3n copy() {
		return new Vec3n(this);
	}
}
