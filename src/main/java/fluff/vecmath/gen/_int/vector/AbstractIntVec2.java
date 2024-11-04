package fluff.vecmath.gen._int.vector;

/**
 * Abstract base class for 2D vectors with numerical operations.
 * This class provides common vector operations for vectors with two components.
 *
 * @param <V> the type of the vector extending this abstract class
 */
public abstract class AbstractIntVec2<V extends AbstractIntVec2<V>> implements IIntVector<V> {
    
    /**
     * Retrieves the first component of the vector.
     *
     * @return the first component of the vector
     */
    protected abstract int proj_1();
    
    /**
     * Retrieves the second component of the vector.
     *
     * @return the second component of the vector
     */
    protected abstract int proj_2();
    
    /**
     * Sets the components of the vector.
     *
     * @param proj_1 the value to set for the first component
     * @param proj_2 the value to set for the second component
     * @return this vector
     */
    protected abstract V set(int proj_1, int proj_2);
    
    @Override
    public V add(int scalar) {
        return set(
                proj_1() + scalar,
                proj_2() + scalar
                );
    }
    
    @Override
    public V subtract(int scalar) {
        return set(
                proj_1() - scalar,
                proj_2() - scalar
                );
    }
    
    @Override
    public V multiply(int scalar) {
        return set(
                proj_1() * scalar,
                proj_2() * scalar
                );
    }
    
    @Override
    public V divide(int scalar) {
        return set(
                proj_1() / scalar,
                proj_2() / scalar
                );
    }
    
    @Override
    public V add(V vec) {
        return set(
                proj_1() + vec.proj_1(),
                proj_2() + vec.proj_2()
                );
    }
    
    @Override
    public V subtract(V vec) {
        return set(
                proj_1() - vec.proj_1(),
                proj_2() - vec.proj_2()
                );
    }
    
    @Override
    public V multiply(V vec) {
        return set(
                proj_1() * vec.proj_1(),
                proj_2() * vec.proj_2()
                );
    }
    
    @Override
    public V divide(V vec) {
        return set(
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
    public V absolute() {
        return set(
                Math.abs(proj_1()),
                Math.abs(proj_2())
                );
    }
    
    @Override
    public V negate() {
        return set(
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
    public V normalise() {
        double mag = magnitude();
        if (mag == 0.0) return (V) this;
        
        return set(
                (int ) (proj_1() / mag),
                (int ) (proj_2() / mag)
                );
    }
    
    @Override
    public String toString() {
        return "(" + proj_1() + ", " + proj_2() + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractIntVec2 vec) {
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
        return (int) (bits ^ (bits >> 32));
    }
}
