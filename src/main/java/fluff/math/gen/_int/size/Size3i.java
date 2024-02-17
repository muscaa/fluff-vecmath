package fluff.math.gen._int.size;

import fluff.math.gen._int.vec.AbstractIntVec3;

public class Size3i extends AbstractIntVec3<Size3i> implements IIntSize<Size3i> {
	
	public int width;
	public int height;
	public int length;
	
	public Size3i(int width, int height, int length) {
		set(width, height, length);
	}
	
	public Size3i(Size3i size) {
		this(size.width, size.height, size.length);
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
	protected int getZ() {
		return length;
	}
	
	@Override
	protected void set(int x, int y, int z) {
		this.width = x;
		this.height = y;
		this.length = z;
	}
	
	@Override
	public Size3i copy() {
		return new Size3i(this);
	}
}
