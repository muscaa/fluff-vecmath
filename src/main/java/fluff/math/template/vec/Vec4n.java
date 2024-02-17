package fluff.math.template.vec;

public class Vec4n extends AbstractNumberVec4<Vec4n> {
	
	public /*number*/int x;
	public /*number*/int y;
	public /*number*/int z;
	public /*number*/int w;
	
	public Vec4n(/*number*/int x, /*number*/int y, /*number*/int z, /*number*/int w) {
		set(x, y, z, w);
	}
	
	public Vec4n(Vec4n vec) {
		this(vec.x, vec.y, vec.z, vec.w);
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
	protected /*number*/int getW() {
		return w;
	}
	
	@Override
	protected void set(/*number*/int x, /*number*/int y, /*number*/int z, /*number*/int w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	@Override
	public Vec4n copy() {
		return new Vec4n(this);
	}
}
