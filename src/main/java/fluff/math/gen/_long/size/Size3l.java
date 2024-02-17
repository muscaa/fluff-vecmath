package fluff.math.gen._long.size;

import fluff.math.gen._long.vec.AbstractLongVec3;

public class Size3l extends AbstractLongVec3<Size3l> implements ILongSize<Size3l> {
	
	public long width;
	public long height;
	public long length;
	
	public Size3l(long width, long height, long length) {
		set(width, height, length);
	}
	
	public Size3l(Size3l size) {
		this(size.width, size.height, size.length);
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
	protected long getZ() {
		return length;
	}
	
	@Override
	protected void set(long x, long y, long z) {
		this.width = x;
		this.height = y;
		this.length = z;
	}
	
	@Override
	public Size3l copy() {
		return new Size3l(this);
	}
}
