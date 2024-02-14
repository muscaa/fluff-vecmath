package fluff.math._float.size;

import fluff.math._float.vec.AbstractFloatVec3;

public class Size3f extends AbstractFloatVec3<Size3f> implements IFloatSize<Size3f> {
	
	public float width;
	public float height;
	public float length;
	
	public Size3f(float width, float height, float length) {
		set(width, height, length);
	}
	
	public Size3f(Size3f size) {
		this(size.width, size.height, size.length);
	}
	
	@Override
	protected float getX() {
		return width;
	}
	
	@Override
	protected float getY() {
		return height;
	}
	
	@Override
	protected float getZ() {
		return length;
	}
	
	@Override
	protected void set(float x, float y, float z) {
		this.width = x;
		this.height = y;
		this.length = z;
	}
	
	@Override
	public Size3f copy() {
		return new Size3f(this);
	}
}
