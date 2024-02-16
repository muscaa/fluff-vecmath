package fluff.math.gen._int.vec;

public abstract class AbstractIntVec3<V extends AbstractIntVec3<V>> implements IIntVec<V> {
	
	protected abstract int getX();
	
	protected abstract int getY();
	
	protected abstract int getZ();
	
	protected abstract void set(int x, int y, int z);
	
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
	public V add(int val) {
		set(
				getX() + val,
				getY() + val,
				getZ() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(int val) {
		set(
				getX() - val,
				getY() - val,
				getZ() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(int val) {
		set(
				getX() * val,
				getY() * val,
				getZ() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(int val) {
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
		if (obj instanceof AbstractIntVec3 vec) {
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
		bits = 31L * bits + getX();
		bits = 31L * bits + getY();
		bits = 31L * bits + getZ();
		return (int) (bits ^ bits >> 32);
	}
}
