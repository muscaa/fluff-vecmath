package fluff.math._double.vec;

public abstract class AbstractDoubleVec2<V extends AbstractDoubleVec2<V>> implements IDoubleVec<V> {
	
	protected abstract double getX();
	
	protected abstract double getY();
	
	protected abstract void set(double x, double y);
	
	@Override
	public V add(V vec) {
		set(
				getX() + vec.getX(),
				getY() + vec.getY()
				);
		return (V) this;
	}
	
	@Override
	public V subtract(V vec) {
		set(
				getX() - vec.getX(),
				getY() - vec.getY()
				);
		return (V) this;
	}
	
	@Override
	public V multiply(V vec) {
		set(
				getX() * vec.getX(),
				getY() * vec.getY()
				);
		return (V) this;
	}
	
	@Override
	public V divide(V vec) {
		set(
				getX() / vec.getX(),
				getY() / vec.getY()
				);
		return (V) this;
	}
	
	@Override
	public V abs() {
		set(
				Math.abs(getX()),
				Math.abs(getY())
				);
		return (V) this;
	}
	
	@Override
	public V negate() {
		set(
				-getX(),
				-getY()
				);
		return (V) this;
	}
	
	@Override
	public double length() {
		return Math.sqrt(
				getX() * getX() +
				getY() * getY()
				);
	}
	
	@Override
	public boolean isInside(V min, V max) {
		return getX() >= min.getX() && getX() <= max.getX() &&
				getY() >= min.getY() && getY() <= max.getY()
				;
	}
	
	@Override
	public V add(double val) {
		set(
				getX() + val,
				getY() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(double val) {
		set(
				getX() - val,
				getY() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(double val) {
		set(
				getX() * val,
				getY() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(double val) {
		set(
				getX() / val,
				getY() / val
				);
		return (V) this;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractDoubleVec4 vec) {
			return getX() == vec.getX() &&
					getY() == vec.getY()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + Double.doubleToLongBits(getX());
		bits = 31L * bits + Double.doubleToLongBits(getY());
		return (int) (bits ^ bits >> 32);
	}
}
