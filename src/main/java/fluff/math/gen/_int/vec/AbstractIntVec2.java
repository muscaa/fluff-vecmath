package fluff.math.gen._int.vec;

public abstract class AbstractIntVec2<V extends AbstractIntVec2<V>> implements IIntVec<V> {
	
	protected abstract int getX();
	
	protected abstract int getY();
	
	protected abstract void set(int x, int y);
	
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
	public V add(int val) {
		set(
				getX() + val,
				getY() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(int val) {
		set(
				getX() - val,
				getY() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(int val) {
		set(
				getX() * val,
				getY() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(int val) {
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
		if (obj instanceof AbstractIntVec2 vec) {
			return getX() == vec.getX() &&
					getY() == vec.getY()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + getX();
		bits = 31L * bits + getY();
		return (int) (bits ^ bits >> 32);
	}
}
