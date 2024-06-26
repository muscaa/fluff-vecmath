package fluff.vecmath.gen._double.vector;

/**
 * Abstract base class for 2D vectors with numerical operations.
 * This class provides common vector operations for vectors with two components.
 *
 * @param <V> the type of the vector extending this abstract class
 */
public abstract class AbstractDoubleVec2<V extends AbstractDoubleVec2<V>> implements IDoubleVector<V> {
    
    /**
     * Retrieves the first component of the vector.
     *
     * @return the first component of the vector
     */
    protected abstract double proj_1();
    
    /**
     * Retrieves the second component of the vector.
     *
     * @return the second component of the vector
     */
    protected abstract double proj_2();
    
    /**
     * Sets the components of the vector.
     *
     * @param proj_1 the value to set for the first component
     * @param proj_2 the value to set for the second component
     */
    protected abstract void set(double proj_1, double proj_2);
    
    @Override
    public void add(double scalar) {
        set(
                proj_1() + scalar,
                proj_2() + scalar
                );
    }
    
    @Override
    public void subtract(double scalar) {
        set(
                proj_1() - scalar,
                proj_2() - scalar
                );
    }
    
    @Override
    public void multiply(double scalar) {
        set(
                proj_1() * scalar,
                proj_2() * scalar
                );
    }
    
    @Override
    public void divide(double scalar) {
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
                (double ) (proj_1() / mag),
                (double ) (proj_2() / mag)
                );
    }
    
    @Override
    public String toString() {
        return "(" + proj_1() + ", " + proj_2() + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractDoubleVec2 vec) {
            return proj_1() == vec.proj_1() &&
                    proj_2() == vec.proj_2()
                    ;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        long bits = 1L;
        bits = 31L * bits + Double.doubleToLongBits(proj_1());
        bits = 31L * bits + Double.doubleToLongBits(proj_2());
        return (int) (bits ^ (bits >> 32));
    }
}
