package fluff.vecmath.template.vector;

/**
 * Abstract base class for 3D vectors with numerical operations.
 * This class provides common vector operations for vectors with three components.
 *
 * @param <V> the type of the vector extending this abstract class
 */
public abstract class AbstractNumberVec3<V extends AbstractNumberVec3<V>> implements INumberVector<V> {
    
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
     * Retrieves the third component of the vector.
     *
     * @return the third component of the vector
     */
    protected abstract /*number*/double proj_3();
    
    /**
     * Sets the components of the vector.
     *
     * @param proj_1 the value to set for the first component
     * @param proj_2 the value to set for the second component
     * @param proj_3 the value to set for the third component
     * @return this vector
     */
    protected abstract V set(/*number*/double proj_1, /*number*/double proj_2, /*number*/double proj_3);
    
    @Override
    public V add(/*number*/double scalar) {
        return set(
                proj_1() + scalar,
                proj_2() + scalar,
                proj_3() + scalar
                );
    }
    
    @Override
    public V subtract(/*number*/double scalar) {
        return set(
                proj_1() - scalar,
                proj_2() - scalar,
                proj_3() - scalar
                );
    }
    
    @Override
    public V multiply(/*number*/double scalar) {
        return set(
                proj_1() * scalar,
                proj_2() * scalar,
                proj_3() * scalar
                );
    }
    
    @Override
    public V divide(/*number*/double scalar) {
        return set(
                proj_1() / scalar,
                proj_2() / scalar,
                proj_3() / scalar
                );
    }
    
    @Override
    public V add(V vec) {
        return set(
                proj_1() + vec.proj_1(),
                proj_2() + vec.proj_2(),
                proj_3() + vec.proj_3()
                );
    }
    
    @Override
    public V subtract(V vec) {
        return set(
                proj_1() - vec.proj_1(),
                proj_2() - vec.proj_2(),
                proj_3() - vec.proj_3()
                );
    }
    
    @Override
    public V multiply(V vec) {
        return set(
                proj_1() * vec.proj_1(),
                proj_2() * vec.proj_2(),
                proj_3() * vec.proj_3()
                );
    }
    
    @Override
    public V divide(V vec) {
        return set(
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
    
    /**
     * Performs a cross product with the given vector and sets the result to this vector.
     *
     * @param vec the vector to cross with
     * @return this vector
     */
    public V crossMultiply(V vec) {
        return set(
                proj_2() * vec.proj_3() - proj_3() * vec.proj_2(),
                proj_3() * vec.proj_1() - proj_1() * vec.proj_3(),
                proj_1() * vec.proj_2() - proj_2() * vec.proj_1()
                );
    }
    
    @Override
    public V absolute() {
        return set(
                Math.abs(proj_1()),
                Math.abs(proj_2()),
                Math.abs(proj_3())
                );
    }
    
    @Override
    public V negate() {
        return set(
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
    public V normalise() {
        double mag = magnitude();
        if (mag == 0.0) return (V) this;
        
        return set(
                (/*number*/double ) (proj_1() / mag),
                (/*number*/double ) (proj_2() / mag),
                (/*number*/double ) (proj_3() / mag)
                );
    }
    
    @Override
    public String toString() {
        return "(" + proj_1() + ", " + proj_2() + ", " + proj_3() + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractNumberVec3 vec) {
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
        bits = 31L * bits /*convert_proj_1*/;
        bits = 31L * bits /*convert_proj_2*/;
        bits = 31L * bits /*convert_proj_3*/;
        return (int) (bits ^ (bits >> 32));
    }
}
