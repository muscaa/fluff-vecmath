package fluff.vecmath.gen._float.vector;

/**
 * Abstract base class for 3D vectors with numerical operations.
 * This class provides common vector operations for vectors with three components.
 *
 * @param <V> the type of the vector extending this abstract class
 */
public abstract class AbstractFloatVec3<V extends AbstractFloatVec3<V>> implements IFloatVector<V> {
    
    /**
     * Retrieves the first component of the vector.
     *
     * @return the first component of the vector
     */
    protected abstract float proj_1();
    
    /**
     * Retrieves the second component of the vector.
     *
     * @return the second component of the vector
     */
    protected abstract float proj_2();
    
    /**
     * Retrieves the third component of the vector.
     *
     * @return the third component of the vector
     */
    protected abstract float proj_3();
    
    /**
     * Sets the components of the vector.
     *
     * @param proj_1 the value to set for the first component
     * @param proj_2 the value to set for the second component
     * @param proj_3 the value to set for the third component
     */
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
        return (int) (bits ^ (bits >> 32));
    }
}
