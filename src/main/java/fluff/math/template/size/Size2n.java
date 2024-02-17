package fluff.math.template.size;

import fluff.math.template.vec.AbstractNumberVec2;

public class Size2n extends AbstractNumberVec2<Size2n> implements INumberSize<Size2n> {
	
	public /*number*/int width;
	public /*number*/int height;
	
	public Size2n(/*number*/int width, /*number*/int height) {
		set(width, height);
	}
	
	public Size2n(Size2n size) {
		this(size.width, size.height);
	}
	
	@Override
	protected /*number*/int getX() {
		return width;
	}
	
	@Override
	protected /*number*/int getY() {
		return height;
	}
	
	@Override
	protected void set(/*number*/int x, /*number*/int y) {
		this.width = x;
		this.height = y;
	}
	
	@Override
	public Size2n copy() {
		return new Size2n(this);
	}
}
