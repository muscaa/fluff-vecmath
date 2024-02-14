package fluff.math._float.vec;

public abstract class AbstractFloatVec2<V extends AbstractFloatVec2<V>> implements IFloatVec<V> {
	
	protected abstract float getX();
	
	protected abstract float getY();
	
	protected abstract void set(float x, float y);
	
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
	public V add(float val) {
		set(
				getX() + val,
				getY() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(float val) {
		set(
				getX() - val,
				getY() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(float val) {
		set(
				getX() * val,
				getY() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(float val) {
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
		if (obj instanceof AbstractFloatVec4 vec) {
			return getX() == vec.getX() &&
					getY() == vec.getY()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + Float.floatToIntBits(getX());
		bits = 31L * bits + Float.floatToIntBits(getY());
		return (int) (bits ^ bits >> 32);
	}
}
