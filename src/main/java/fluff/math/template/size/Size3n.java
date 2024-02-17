package fluff.math.template.size;

import fluff.math.template.vec.AbstractNumberVec3;

public class Size3n extends AbstractNumberVec3<Size3n> implements INumberSize<Size3n> {
	
	public /*number*/int width;
	public /*number*/int height;
	public /*number*/int length;
	
	public Size3n(/*number*/int width, /*number*/int height, /*number*/int length) {
		set(width, height, length);
	}
	
	public Size3n(Size3n size) {
		this(size.width, size.height, size.length);
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
	protected /*number*/int getZ() {
		return length;
	}
	
	@Override
	protected void set(/*number*/int x, /*number*/int y, /*number*/int z) {
		this.width = x;
		this.height = y;
		this.length = z;
	}
	
	@Override
	public Size3n copy() {
		return new Size3n(this);
	}
}
