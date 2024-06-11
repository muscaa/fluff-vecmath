package fluff.vecmath.gen._long.vector;

public abstract class AbstractLongVec2<V extends AbstractLongVec2<V>> implements ILongVector<V> {
	
	protected abstract long proj_1();
	
	protected abstract long proj_2();
	
	protected abstract void set(long proj_1, long proj_2);
	
	@Override
	public void add(long scalar) {
		set(
				proj_1() + scalar,
				proj_2() + scalar
				);
	}
	
	@Override
	public void subtract(long scalar) {
		set(
				proj_1() - scalar,
				proj_2() - scalar
				);
	}
	
	@Override
	public void multiply(long scalar) {
		set(
				proj_1() * scalar,
				proj_2() * scalar
				);
	}
	
	@Override
	public void divide(long scalar) {
		set(
				proj_1() / scalar,
				proj_2() / scalar
				);
	}
	
	@Override
	public void add(V vec) {
		set(
				proj_1() + vec.proj_1(),
				proj_2() + vec.proj_2()
				);
	}
	
	@Override
	public void subtract(V vec) {
		set(
				proj_1() - vec.proj_1(),
				proj_2() - vec.proj_2()
				);
	}
	
	@Override
	public void multiply(V vec) {
		set(
				proj_1() * vec.proj_1(),
				proj_2() * vec.proj_2()
				);
	}
	
	@Override
	public void divide(V vec) {
		set(
				proj_1() / vec.proj_1(),
				proj_2() / vec.proj_2()
				);
	}
	
	@Override
	public double dotMultiply(V vec) {
		return proj_1() * vec.proj_1() +
				proj_2() * vec.proj_2()
				;
	}
	
	@Override
	public void absolute() {
		set(
				Math.abs(proj_1()),
				Math.abs(proj_2())
				);
	}
	
	@Override
	public void negate() {
		set(
				-proj_1(),
				-proj_2()
				);
	}
	
	@Override
	public double magnitude() {
		return Math.sqrt(
				proj_1() * proj_1() +
				proj_2() * proj_2()
				);
	}
	
	@Override
	public void normalise() {
		double mag = magnitude();
		if (mag == 0.0) return;
		
		set(
				(long ) (proj_1() / mag),
				(long ) (proj_2() / mag)
				);
	}
	
	@Override
	public String toString() {
		return "(" + proj_1() + ", " + proj_2() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractLongVec2 vec) {
			return proj_1() == vec.proj_1() &&
					proj_2() == vec.proj_2()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + proj_1();
		bits = 31L * bits + proj_2();
		return (int) (bits ^ bits >> 32);
	}
}
