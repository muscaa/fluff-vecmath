package fluff.math.gen._double.vec;

public abstract class AbstractDoubleVec4<V extends AbstractDoubleVec4<V>> implements IDoubleVec<V> {
	
	protected abstract double getX();
	
	protected abstract double getY();
	
	protected abstract double getZ();
	
	protected abstract double getW();
	
	protected abstract void set(double x, double y, double z, double w);
	
	@Override
	public V add(V vec) {
		set(
				getX() + vec.getX(),
				getY() + vec.getY(),
				getZ() + vec.getZ(),
				getW() + vec.getW()
				);
		return (V) this;
	}
	
	@Override
	public V subtract(V vec) {
		set(
				getX() - vec.getX(),
				getY() - vec.getY(),
				getZ() - vec.getZ(),
				getW() - vec.getW()
				);
		return (V) this;
	}
	
	@Override
	public V multiply(V vec) {
		set(
				getX() * vec.getX(),
				getY() * vec.getY(),
				getZ() * vec.getZ(),
				getW() * vec.getW()
				);
		return (V) this;
	}
	
	@Override
	public V divide(V vec) {
		set(
				getX() / vec.getX(),
				getY() / vec.getY(),
				getZ() / vec.getZ(),
				getW() / vec.getW()
				);
		return (V) this;
	}
	
	@Override
	public V abs() {
		set(
				Math.abs(getX()),
				Math.abs(getY()),
				Math.abs(getZ()),
				Math.abs(getW())
				);
		return (V) this;
	}
	
	@Override
	public V negate() {
		set(
				-getX(),
				-getY(),
				-getZ(),
				-getW()
				);
		return (V) this;
	}
	
	@Override
	public double length() {
		return Math.sqrt(
				getX() * getX() +
				getY() * getY() +
				getZ() * getZ() +
				getW() * getW()
				);
	}
	
	@Override
	public boolean isInside(V min, V max) {
		return getX() >= min.getX() && getX() <= max.getX() &&
				getY() >= min.getY() && getY() <= max.getY() &&
				getZ() >= min.getZ() && getZ() <= max.getZ() &&
				getW() >= min.getW() && getW() <= max.getW()
				;
	}
	
	@Override
	public V add(double val) {
		set(
				getX() + val,
				getY() + val,
				getZ() + val,
				getW() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(double val) {
		set(
				getX() - val,
				getY() - val,
				getZ() - val,
				getW() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(double val) {
		set(
				getX() * val,
				getY() * val,
				getZ() * val,
				getW() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(double val) {
		set(
				getX() / val,
				getY() / val,
				getZ() / val,
				getW() / val
				);
		return (V) this;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ", " + getW() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractDoubleVec4 vec) {
			return getX() == vec.getX() &&
					getY() == vec.getY() &&
					getZ() == vec.getZ() &&
					getW() == vec.getW()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + Double.doubleToLongBits(getX());
		bits = 31L * bits + Double.doubleToLongBits(getY());
		bits = 31L * bits + Double.doubleToLongBits(getZ());
		bits = 31L * bits + Double.doubleToLongBits(getW());
		return (int) (bits ^ bits >> 32);
	}
}
