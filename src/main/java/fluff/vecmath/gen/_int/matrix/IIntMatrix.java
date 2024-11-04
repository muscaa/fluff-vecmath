package fluff.vecmath.gen._int.matrix;

import fluff.vecmath.IMatrix;

/**
 * Represents a matrix of numeric values and provides operations for matrix arithmetic with scalars and other matrices.
 *
 * @param <V> the type of the matrix
 */
public interface IIntMatrix<V extends IIntMatrix<V>> extends IMatrix<V> {
    
    /**
     * Adds the specified scalar to each element of this matrix.
     *
     * @param scalar the scalar value to be added
     * @return this matrix
     */
    V add(int scalar);
    
    /**
     * Subtracts the specified scalar from each element of this matrix.
     *
     * @param scalar the scalar value to be subtracted
     * @return this matrix
     */
    V subtract(int scalar);
    
    /**
     * Multiplies each element of this matrix by the specified scalar.
     *
     * @param scalar the scalar value to multiply
     * @return this matrix
     */
    V multiply(int scalar);
    
    /**
     * Divides each element of this matrix by the specified scalar.
     *
     * @param scalar the scalar value to divide
     * @return this matrix
     */
    V divide(int scalar);
    
    /**
     * Computes the determinant of this matrix.
     *
     * @return the determinant of the matrix
     */
    int determinant();
}
