package fluff.math._float.size;

import fluff.math._float.vec.AbstractFloatVec2;

public class Size2f extends AbstractFloatVec2<Size2f> implements IFloatSize<Size2f> {
	
	public float width;
	public float height;
	
	public Size2f(float width, float height) {
		set(width, height);
	}
	
	public Size2f(Size2f size) {
		this(size.width, size.height);
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
	protected void set(float x, float y) {
		this.width = x;
		this.height = y;
	}
	
	@Override
	public Size2f copy() {
		return new Size2f(this);
	}
}
