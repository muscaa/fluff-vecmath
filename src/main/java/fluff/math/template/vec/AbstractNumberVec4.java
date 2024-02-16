package fluff.math.template.vec;

/*public*/ abstract class AbstractNumberVec4<V extends AbstractNumberVec4<V>> implements INumberVec<V> {
	
	protected abstract /*number*/int getX();
	
	protected abstract /*number*/int getY();
	
	protected abstract /*number*/int getZ();
	
	protected abstract /*number*/int getW();
	
	protected abstract void set(/*number*/int x, /*number*/int y, /*number*/int z, /*number*/int w);
	
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
	public V add(/*number*/int val) {
		set(
				getX() + val,
				getY() + val,
				getZ() + val,
				getW() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(/*number*/int val) {
		set(
				getX() - val,
				getY() - val,
				getZ() - val,
				getW() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(/*number*/int val) {
		set(
				getX() * val,
				getY() * val,
				getZ() * val,
				getW() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(/*number*/int val) {
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
		if (obj instanceof AbstractNumberVec4 vec) {
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
		bits = 31L * bits + getX();
		bits = 31L * bits + getY();
		bits = 31L * bits + getZ();
		bits = 31L * bits + getW();
		return (int) (bits ^ bits >> 32);
	}
}
