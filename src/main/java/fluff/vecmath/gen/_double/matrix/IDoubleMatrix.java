package fluff.vecmath.gen._double.matrix;

import fluff.vecmath.IMatrix;

/**
 * Represents a matrix of numeric values and provides operations for matrix arithmetic with scalars and other matrices.
 *
 * @param <V> the type of the matrix
 */
public interface IDoubleMatrix<V extends IDoubleMatrix<V>> extends IMatrix<V> {
    
    /**
     * Adds the specified scalar to each element of this matrix.
     *
     * @param scalar the scalar value to be added
     */
    void add(double scalar);
    
    /**
     * Subtracts the specified scalar from each element of this matrix.
     *
     * @param scalar the scalar value to be subtracted
     */
    void subtract(double scalar);
    
    /**
     * Multiplies each element of this matrix by the specified scalar.
     *
     * @param scalar the scalar value to multiply
     */
    void multiply(double scalar);
    
    /**
     * Divides each element of this matrix by the specified scalar.
     *
     * @param scalar the scalar value to divide
     */
    void divide(double scalar);
    
    /**
     * Computes the determinant of this matrix.
     *
     * @return the determinant of the matrix
     */
    double determinant();
}
