package fluff.vecmath.gen._int.vector;

import fluff.vecmath.IVector;

/**
 * Interface for a vector with operations that involve both vectors and scalar values.
 *
 * @param <V> the type of the vector
 */
public interface IIntVector<V extends IIntVector<V>> extends IVector<V> {
    
    /**
     * Adds a scalar value to this vector.
     *
     * @param scalar the scalar value to add
     */
    void add(int scalar);
    
    /**
     * Subtracts a scalar value from this vector.
     *
     * @param scalar the scalar value to subtract
     */
    void subtract(int scalar);
    
    /**
     * Multiplies this vector by a scalar value.
     *
     * @param scalar the scalar value to multiply by
     */
    void multiply(int scalar);
    
    /**
     * Divides this vector by a scalar value.
     *
     * @param scalar the scalar value to divide by
     */
    void divide(int scalar);
}
