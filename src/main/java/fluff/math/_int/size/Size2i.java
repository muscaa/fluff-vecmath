package fluff.math._int.size;

import fluff.math._int.vec.AbstractIntVec2;

public class Size2i extends AbstractIntVec2<Size2i> implements IIntSize<Size2i> {
	
	public int width;
	public int height;
	
	public Size2i(int width, int height) {
		set(width, height);
	}
	
	public Size2i(Size2i size) {
		this(size.width, size.height);
	}
	
	@Override
	protected int getX() {
		return width;
	}
	
	@Override
	protected int getY() {
		return height;
	}
	
	@Override
	protected void set(int x, int y) {
		this.width = x;
		this.height = y;
	}
	
	@Override
	public Size2i copy() {
		return new Size2i(this);
	}
}
