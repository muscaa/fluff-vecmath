package fluff.vecmath;

/**
 * Interface representing a mathematical vector with basic vector operations.
 *
 * @param <V> the type of the implementing class extending IVector
 */
public interface IVector<V extends IVector<V>> extends IMath<V> {
    
    /**
     * Adds the given vector to this vector.
     *
     * @param vec the vector to be added
     * @return this vector
     */
    V add(V vec);
    
    /**
     * Subtracts the given vector from this vector.
     *
     * @param vec the vector to be subtracted
     * @return this vector
     */
    V subtract(V vec);
    
    /**
     * Multiplies this vector by the given vector element-wise.
     *
     * @param vec the vector to be multiplied
     * @return this vector
     */
    V multiply(V vec);
    
    /**
     * Divides this vector by the given vector element-wise.
     *
     * @param vec the vector to be divided
     * @return this vector
     */
    V divide(V vec);
    
    /**
     * Calculates the dot product of this vector and the given vector.
     *
     * @param vec the vector to be used for the dot product calculation
     * @return the dot product of the two vectors
     */
    double dotMultiply(V vec);
    
    /**
     * Converts all components of this vector to their absolute values.
     * 
     * @return this vector
     */
    V absolute();
    
    /**
     * Negates all components of this vector.
     * 
     * @return this vector
     */
    V negate();
    
    /**
     * Calculates the magnitude (length) of this vector.
     *
     * @return the magnitude of this vector
     */
    double magnitude();
    
    /**
     * Normalises this vector (makes it unit length).
     * 
     * @return this vector
     */
    V normalise();
}
