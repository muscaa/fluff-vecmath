package fluff.vecmath.gen._float.vector;

public abstract class AbstractFloatVec3<V extends AbstractFloatVec3<V>> implements IFloatVector<V> {
	
	protected abstract float proj_1();
	
	protected abstract float proj_2();
	
	protected abstract float proj_3();
	
	protected abstract void set(float proj_1, float proj_2, float proj_3);
	
	@Override
	public void add(float scalar) {
		set(
				proj_1() + scalar,
				proj_2() + scalar,
				proj_3() + scalar
				);
	}
	
	@Override
	public void subtract(float scalar) {
		set(
				proj_1() - scalar,
				proj_2() - scalar,
				proj_3() - scalar
				);
	}
	
	@Override
	public void multiply(float scalar) {
		set(
				proj_1() * scalar,
				proj_2() * scalar,
				proj_3() * scalar
				);
	}
	
	@Override
	public void divide(float scalar) {
		set(
				proj_1() / scalar,
				proj_2() / scalar,
				proj_3() / scalar
				);
	}
	
	@Override
	public void add(V vec) {
		set(
				proj_1() + vec.proj_1(),
				proj_2() + vec.proj_2(),
				proj_3() + vec.proj_3()
				);
	}
	
	@Override
	public void subtract(V vec) {
		set(
				proj_1() - vec.proj_1(),
				proj_2() - vec.proj_2(),
				proj_3() - vec.proj_3()
				);
	}
	
	@Override
	public void multiply(V vec) {
		set(
				proj_1() * vec.proj_1(),
				proj_2() * vec.proj_2(),
				proj_3() * vec.proj_3()
				);
	}
	
	@Override
	public void divide(V vec) {
		set(
				proj_1() / vec.proj_1(),
				proj_2() / vec.proj_2(),
				proj_3() / vec.proj_3()
				);
	}
	
	@Override
	public double dotMultiply(V vec) {
		return proj_1() * vec.proj_1() +
				proj_2() * vec.proj_2() +
				proj_3() * vec.proj_3()
				;
	}
	
	public void crossMultiply(V vec) {
		set(
				proj_2() * vec.proj_3() - proj_3() * vec.proj_2(),
				proj_3() * vec.proj_1() - proj_1() * vec.proj_3(),
				proj_1() * vec.proj_2() - proj_2() * vec.proj_1()
				);
	}
	
	@Override
	public void absolute() {
		set(
				Math.abs(proj_1()),
				Math.abs(proj_2()),
				Math.abs(proj_3())
				);
	}
	
	@Override
	public void negate() {
		set(
				-proj_1(),
				-proj_2(),
				-proj_3()
				);
	}
	
	@Override
	public double magnitude() {
		return Math.sqrt(
				proj_1() * proj_1() +
				proj_2() * proj_2() +
				proj_3() * proj_3()
				);
	}
	
	@Override
	public void normalise() {
		double mag = magnitude();
		if (mag == 0.0) return;
		
		set(
				(float ) (proj_1() / mag),
				(float ) (proj_2() / mag),
				(float ) (proj_3() / mag)
				);
	}
	
	@Override
	public String toString() {
		return "(" + proj_1() + ", " + proj_2() + ", " + proj_3() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractFloatVec3 vec) {
			return proj_1() == vec.proj_1() &&
					proj_2() == vec.proj_2() &&
					proj_3() == vec.proj_3()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + Float.floatToIntBits(proj_1());
		bits = 31L * bits + Float.floatToIntBits(proj_2());
		bits = 31L * bits + Float.floatToIntBits(proj_3());
		return (int) (bits ^ bits >> 32);
	}
}