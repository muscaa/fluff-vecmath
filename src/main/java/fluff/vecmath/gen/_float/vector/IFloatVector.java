package fluff.vecmath.gen._float.vector;

import fluff.vecmath.IVector;

/**
 * Interface for a vector with operations that involve both vectors and scalar values.
 *
 * @param <V> the type of the vector
 */
public interface IFloatVector<V extends IFloatVector<V>> extends IVector<V> {
    
    /**
     * Adds a scalar value to this vector.
     *
     * @param scalar the scalar value to add
     * @return this vector
     */
    V add(float scalar);
    
    /**
     * Subtracts a scalar value from this vector.
     *
     * @param scalar the scalar value to subtract
     * @return this vector
     */
    V subtract(float scalar);
    
    /**
     * Multiplies this vector by a scalar value.
     *
     * @param scalar the scalar value to multiply by
     * @return this vector
     */
    V multiply(float scalar);
    
    /**
     * Divides this vector by a scalar value.
     *
     * @param scalar the scalar value to divide by
     * @return this vector
     */
    V divide(float scalar);
}
