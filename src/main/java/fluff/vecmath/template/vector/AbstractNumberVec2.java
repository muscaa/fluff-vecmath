package fluff.vecmath.template.vector;

/**
 * Abstract base class for 2D vectors with numerical operations.
 * This class provides common vector operations for vectors with two components.
 *
 * @param <V> the type of the vector extending this abstract class
 */
public abstract class AbstractNumberVec2<V extends AbstractNumberVec2<V>> implements INumberVector<V> {
    
    /**
     * Retrieves the first component of the vector.
     *
     * @return the first component of the vector
     */
    protected abstract /*number*/double proj_1();
    
    /**
     * Retrieves the second component of the vector.
     *
     * @return the second component of the vector
     */
    protected abstract /*number*/double proj_2();
    
    /**
     * Sets the components of the vector.
     *
     * @param proj_1 the value to set for the first component
     * @param proj_2 the value to set for the second component
     * @return this vector
     */
    protected abstract V set(/*number*/double proj_1, /*number*/double proj_2);
    
    @Override
    public V add(/*number*/double scalar) {
        return set(
                proj_1() + scalar,
                proj_2() + scalar
                );
    }
    
    @Override
    public V subtract(/*number*/double scalar) {
        return set(
                proj_1() - scalar,
                proj_2() - scalar
                );
    }
    
    @Override
    public V multiply(/*number*/double scalar) {
        return set(
                proj_1() * scalar,
                proj_2() * scalar
                );
    }
    
    @Override
    public V divide(/*number*/double scalar) {
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
                (/*number*/double ) (proj_1() / mag),
                (/*number*/double ) (proj_2() / mag)
                );
    }
    
    @Override
    public String toString() {
        return "(" + proj_1() + ", " + proj_2() + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractNumberVec2 vec) {
            return proj_1() == vec.proj_1() &&
                    proj_2() == vec.proj_2()
                    ;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        long bits = 1L;
        bits = 31L * bits /*convert_proj_1*/;
        bits = 31L * bits /*convert_proj_2*/;
        return (int) (bits ^ (bits >> 32));
    }
}
