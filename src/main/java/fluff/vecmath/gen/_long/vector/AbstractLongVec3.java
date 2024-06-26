package fluff.vecmath.gen._long.vector;

/**
 * Abstract base class for 3D vectors with numerical operations.
 * This class provides common vector operations for vectors with three components.
 *
 * @param <V> the type of the vector extending this abstract class
 */
public abstract class AbstractLongVec3<V extends AbstractLongVec3<V>> implements ILongVector<V> {
    
    /**
     * Retrieves the first component of the vector.
     *
     * @return the first component of the vector
     */
    protected abstract long proj_1();
    
    /**
     * Retrieves the second component of the vector.
     *
     * @return the second component of the vector
     */
    protected abstract long proj_2();
    
    /**
     * Retrieves the third component of the vector.
     *
     * @return the third component of the vector
     */
    protected abstract long proj_3();
    
    /**
     * Sets the components of the vector.
     *
     * @param proj_1 the value to set for the first component
     * @param proj_2 the value to set for the second component
     * @param proj_3 the value to set for the third component
     */
    protected abstract void set(long proj_1, long proj_2, long proj_3);
    
    @Override
    public void add(long scalar) {
        set(
                proj_1() + scalar,
                proj_2() + scalar,
                proj_3() + scalar
                );
    }
    
    @Override
    public void subtract(long scalar) {
        set(
                proj_1() - scalar,
                proj_2() - scalar,
                proj_3() - scalar
                );
    }
    
    @Override
    public void multiply(long scalar) {
        set(
                proj_1() * scalar,
                proj_2() * scalar,
                proj_3() * scalar
                );
    }
    
    @Override
    public void divide(long scalar) {
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
    
    /**
     * Performs a cross product with the given vector and sets the result to this vector.
     *
     * @param vec the vector to cross with
     */
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
                (long ) (proj_1() / mag),
                (long ) (proj_2() / mag),
                (long ) (proj_3() / mag)
                );
    }
    
    @Override
    public String toString() {
        return "(" + proj_1() + ", " + proj_2() + ", " + proj_3() + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractLongVec3 vec) {
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
        bits = 31L * bits + proj_1();
        bits = 31L * bits + proj_2();
        bits = 31L * bits + proj_3();
        return (int) (bits ^ (bits >> 32));
    }
}
