package fluff.vecmath;

/**
 * Interface representing a mathematical matrix with basic matrix operations.
 *
 * @param <V> the type of the implementing class extending IMatrix
 */
public interface IMatrix<V extends IMatrix<V>> extends IMath<V> {
    
    /**
     * Adds the given matrix to this matrix.
     *
     * @param mat the matrix to be added
     * @return this matrix
     */
    V add(V mat);
    
    /**
     * Subtracts the given matrix from this matrix.
     *
     * @param mat the matrix to be subtracted
     * @return this matrix
     */
    V subtract(V mat);
    
    /**
     * Multiplies this matrix by the given matrix element-wise.
     *
     * @param mat the matrix to be multiplied
     * @return this matrix
     */
    V multiply(V mat);
    
    /**
     * Divides this matrix by the given matrix element-wise.
     *
     * @param mat the matrix to be divided
     * @return this matrix
     */
    V divide(V mat);
    
    /**
     * Multiplies this matrix by the given matrix using matrix multiplication.
     *
     * @param mat the matrix to be multiplied
     * @return this matrix
     */
    V crossMultiply(V mat);
    
    /**
     * Inverts this matrix.
     * 
     * @return this matrix
     */
    V invert();
    
    /**
     * Converts all elements of this matrix to their absolute values.
     * 
     * @return this matrix
     */
    V absolute();
    
    /**
     * Negates all elements of this matrix.
     * 
     * @return this matrix
     */
    V negate();
    
    /**
     * Transposes this matrix.
     * 
     * @return this matrix
     */
    V transpose();
    
    /**
     * Checks if this matrix is a square matrix (number of rows equals number of columns).
     *
     * @return true if this matrix is square, false otherwise
     */
    boolean isSquare();
    
    /**
     * Retrieves the number of rows in this matrix.
     *
     * @return the number of rows
     */
    int getRows();
    
    /**
     * Retrieves the number of columns in this matrix.
     *
     * @return the number of columns
     */
    int getColumns();
}
