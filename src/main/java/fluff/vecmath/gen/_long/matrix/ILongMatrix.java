package fluff.vecmath.gen._long.matrix;

import fluff.vecmath.IMatrix;

/**
 * Represents a matrix of numeric values and provides operations for matrix arithmetic with scalars and other matrices.
 *
 * @param <V> the type of the matrix
 */
public interface ILongMatrix<V extends ILongMatrix<V>> extends IMatrix<V> {
    
    /**
     * Adds the specified scalar to each element of this matrix.
     *
     * @param scalar the scalar value to be added
     */
    void add(long scalar);
    
    /**
     * Subtracts the specified scalar from each element of this matrix.
     *
     * @param scalar the scalar value to be subtracted
     */
    void subtract(long scalar);
    
    /**
     * Multiplies each element of this matrix by the specified scalar.
     *
     * @param scalar the scalar value to multiply
     */
    void multiply(long scalar);
    
    /**
     * Divides each element of this matrix by the specified scalar.
     *
     * @param scalar the scalar value to divide
     */
    void divide(long scalar);
    
    /**
     * Computes the determinant of this matrix.
     *
     * @return the determinant of the matrix
     */
    long determinant();
}
