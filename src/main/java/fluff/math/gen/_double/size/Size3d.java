package fluff.math.gen._double.size;

import fluff.math.gen._double.vec.AbstractDoubleVec3;

public class Size3d extends AbstractDoubleVec3<Size3d> implements IDoubleSize<Size3d> {
	
	public double width;
	public double height;
	public double length;
	
	public Size3d(double width, double height, double length) {
		set(width, height, length);
	}
	
	public Size3d(Size3d size) {
		this(size.width, size.height, size.length);
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
	protected double getZ() {
		return length;
	}
	
	@Override
	protected void set(double x, double y, double z) {
		this.width = x;
		this.height = y;
		this.length = z;
	}
	
	@Override
	public Size3d copy() {
		return new Size3d(this);
	}
}
