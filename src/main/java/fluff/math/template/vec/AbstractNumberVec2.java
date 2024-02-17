package fluff.math.template.vec;

public abstract class AbstractNumberVec2<V extends AbstractNumberVec2<V>> implements INumberVec<V> {
	
	protected abstract /*number*/int getX();
	
	protected abstract /*number*/int getY();
	
	protected abstract void set(/*number*/int x, /*number*/int y);
	
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
	public V add(/*number*/int val) {
		set(
				getX() + val,
				getY() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(/*number*/int val) {
		set(
				getX() - val,
				getY() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(/*number*/int val) {
		set(
				getX() * val,
				getY() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(/*number*/int val) {
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
		if (obj instanceof AbstractNumberVec2 vec) {
			return getX() == vec.getX() &&
					getY() == vec.getY()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits /*convert_x*/;
		bits = 31L * bits /*convert_y*/;
		return (int) (bits ^ bits >> 32);
	}
}
