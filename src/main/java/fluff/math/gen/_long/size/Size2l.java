package fluff.math.gen._long.size;

import fluff.math.gen._long.vec.AbstractLongVec2;

public class Size2l extends AbstractLongVec2<Size2l> implements ILongSize<Size2l> {
	
	public long width;
	public long height;
	
	public Size2l(long width, long height) {
		set(width, height);
	}
	
	public Size2l(Size2l size) {
		this(size.width, size.height);
	}
	
	@Override
	protected long getX() {
		return width;
	}
	
	@Override
	protected long getY() {
		return height;
	}
	
	@Override
	protected void set(long x, long y) {
		this.width = x;
		this.height = y;
	}
	
	@Override
	public Size2l copy() {
		return new Size2l(this);
	}
}
