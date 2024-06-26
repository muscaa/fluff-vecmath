package fluff.vecmath.template.vector;

import fluff.vecmath.IVector;

/**
 * Interface for a vector with operations that involve both vectors and scalar values.
 *
 * @param <V> the type of the vector
 */
public interface INumberVector<V extends INumberVector<V>> extends IVector<V> {
    
    /**
     * Adds a scalar value to this vector.
     *
     * @param scalar the scalar value to add
     */
    void add(/*number*/double scalar);
    
    /**
     * Subtracts a scalar value from this vector.
     *
     * @param scalar the scalar value to subtract
     */
    void subtract(/*number*/double scalar);
    
    /**
     * Multiplies this vector by a scalar value.
     *
     * @param scalar the scalar value to multiply by
     */
    void multiply(/*number*/double scalar);
    
    /**
     * Divides this vector by a scalar value.
     *
     * @param scalar the scalar value to divide by
     */
    void divide(/*number*/double scalar);
}
