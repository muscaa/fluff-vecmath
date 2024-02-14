package fluff.math._double.size;

import fluff.math._double.vec.AbstractDoubleVec2;

public class Size2d extends AbstractDoubleVec2<Size2d> implements IDoubleSize<Size2d> {
	
	public double width;
	public double height;
	
	public Size2d(double width, double height) {
		set(width, height);
	}
	
	public Size2d(Size2d size) {
		this(size.width, size.height);
	}
	
	@Override
	protected double getX() {
		return width;
	}
	
	@Override
	protected double getY() {
		return height;
	}
	
	@Override
	protected void set(double x, double y) {
		this.width = x;
		this.height = y;
	}
	
	@Override
	public Size2d copy() {
		return new Size2d(this);
	}
}
