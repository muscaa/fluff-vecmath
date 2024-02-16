package fluff.math.gen._int.vec;

public abstract class AbstractIntVec4<V extends AbstractIntVec4<V>> implements IIntVec<V> {
	
	protected abstract int getX();
	
	protected abstract int getY();
	
	protected abstract int getZ();
	
	protected abstract int getW();
	
	protected abstract void set(int x, int y, int z, int w);
	
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
	public V add(int val) {
		set(
				getX() + val,
				getY() + val,
				getZ() + val,
				getW() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(int val) {
		set(
				getX() - val,
				getY() - val,
				getZ() - val,
				getW() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(int val) {
		set(
				getX() * val,
				getY() * val,
				getZ() * val,
				getW() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(int val) {
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
		if (obj instanceof AbstractIntVec4 vec) {
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
