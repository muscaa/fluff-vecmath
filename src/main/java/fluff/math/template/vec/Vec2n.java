package fluff.math.template.vec;

/*public*/ class Vec2n extends AbstractNumberVec2<Vec2n> {
	
	public /*number*/int x;
	public /*number*/int y;
	
	public Vec2n(/*number*/int x, /*number*/int y) {
		set(x, y);
	}
	
	public Vec2n(Vec2n vec) {
		this(vec.x, vec.y);
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
	protected void set(/*number*/int x, /*number*/int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Vec2n copy() {
		return new Vec2n(this);
	}
}
