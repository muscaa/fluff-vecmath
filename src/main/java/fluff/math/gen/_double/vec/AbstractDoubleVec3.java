package fluff.math.gen._double.vec;

public abstract class AbstractDoubleVec3<V extends AbstractDoubleVec3<V>> implements IDoubleVec<V> {
	
	protected abstract double getX();
	
	protected abstract double getY();
	
	protected abstract double getZ();
	
	protected abstract void set(double x, double y, double z);
	
	@Override
	public V add(V vec) {
		set(
				getX() + vec.getX(),
				getY() + vec.getY(),
				getZ() + vec.getZ()
				);
		return (V) this;
	}
	
	@Override
	public V subtract(V vec) {
		set(
				getX() - vec.getX(),
				getY() - vec.getY(),
				getZ() - vec.getZ()
				);
		return (V) this;
	}
	
	@Override
	public V multiply(V vec) {
		set(
				getX() * vec.getX(),
				getY() * vec.getY(),
				getZ() * vec.getZ()
				);
		return (V) this;
	}
	
	@Override
	public V divide(V vec) {
		set(
				getX() / vec.getX(),
				getY() / vec.getY(),
				getZ() / vec.getZ()
				);
		return (V) this;
	}
	
	@Override
	public V abs() {
		set(
				Math.abs(getX()),
				Math.abs(getY()),
				Math.abs(getZ())
				);
		return (V) this;
	}
	
	@Override
	public V negate() {
		set(
				-getX(),
				-getY(),
				-getZ()
				);
		return (V) this;
	}
	
	@Override
	public double length() {
		return Math.sqrt(
				getX() * getX() +
				getY() * getY() +
				getZ() * getZ()
				);
	}
	
	@Override
	public boolean isInside(V min, V max) {
		return getX() >= min.getX() && getX() <= max.getX() &&
				getY() >= min.getY() && getY() <= max.getY() &&
				getZ() >= min.getZ() && getZ() <= max.getZ()
				;
	}
	
	@Override
	public V add(double val) {
		set(
				getX() + val,
				getY() + val,
				getZ() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(double val) {
		set(
				getX() - val,
				getY() - val,
				getZ() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(double val) {
		set(
				getX() * val,
				getY() * val,
				getZ() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(double val) {
		set(
				getX() / val,
				getY() / val,
				getZ() / val
				);
		return (V) this;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractDoubleVec3 vec) {
			return getX() == vec.getX() &&
					getY() == vec.getY() &&
					getZ() == vec.getZ()
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
		return (int) (bits ^ bits >> 32);
	}
}
