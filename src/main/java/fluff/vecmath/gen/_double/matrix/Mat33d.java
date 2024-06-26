package fluff.vecmath.gen._double.matrix;

import fluff.vecmath.MathException;

/**
 * Class representing a 3x3 matrix with numeric values.
 * Provides various operations such as addition, subtraction, multiplication, and inversion.
 */
public class Mat33d extends AbstractDoubleMatrix<Mat33d> {
    
    protected double [][] matrix;
    
    /**
     * Constructs a new 3x3 matrix with the specified values.
     *
     * @param m00 the value at row 0, column 0
     * @param m01 the value at row 0, column 1
     * @param m02 the value at row 0, column 2
     * @param m10 the value at row 1, column 0
     * @param m11 the value at row 1, column 1
     * @param m12 the value at row 1, column 2
     * @param m20 the value at row 2, column 0
     * @param m21 the value at row 2, column 1
     * @param m22 the value at row 2, column 2
     */
    public Mat33d(
            double m00, double m01, double m02,
            double m10, double m11, double m12, 
            double m20, double m21, double m22
            ) {
        set(new double [][] {
            { m00, m01, m02 },
            { m10, m11, m12 },
            { m20, m21, m22 }
        });
    }
    
    /**
     * Constructs a new 3x3 matrix by copying the values from the specified matrix.
     *
     * @param mat the matrix to copy
     */
    public Mat33d(Mat33d mat) {
        double [][] matrix = new double [mat.getRows()][mat.getColumns()];
        set(matrix);
        
        for (int i = 0; i < mat.getRows(); i++) {
            for (int j = 0; j < mat.getColumns(); j++) {
                set(i, j,
                		mat.get(i, j)
                		);
            }
        }
    }
    
    @Override
    protected double [][] get() {
        return matrix;
    }
    
    @Override
    protected void set(double [][] matrix) {
        this.matrix = matrix;
    }
    
    @Override
    public void invert() {
        double det = determinant();
        if (det == 0) throw new MathException("Matrix is not invertible!");
        
        double [][] newMatrix = new double [3][3];
        newMatrix[0][0] = (get(1, 1) * get(2, 2) - get(1, 2) * get(2, 1)) / det;
        newMatrix[0][1] = (get(0, 2) * get(2, 1) - get(0, 1) * get(2, 2)) / det;
        newMatrix[0][2] = (get(0, 1) * get(1, 2) - get(0, 2) * get(1, 1)) / det;
        newMatrix[1][0] = (get(1, 2) * get(2, 0) - get(1, 0) * get(2, 2)) / det;
        newMatrix[1][1] = (get(0, 0) * get(2, 2) - get(0, 2) * get(2, 0)) / det;
        newMatrix[1][2] = (get(0, 2) * get(1, 0) - get(0, 0) * get(1, 2)) / det;
        newMatrix[2][0] = (get(1, 0) * get(2, 1) - get(1, 1) * get(2, 0)) / det;
        newMatrix[2][1] = (get(0, 1) * get(2, 0) - get(0, 0) * get(2, 1)) / det;
        newMatrix[2][2] = (get(0, 0) * get(1, 1) - get(0, 1) * get(1, 0)) / det;
        
        set(newMatrix);
    }
    
    @Override
    public double determinant() {
        return get(0, 0) * get(1, 1) * get(2, 2) +
                get(1, 0) * get(2, 1) * get(0, 2) +
                get(0, 1) * get(1, 2) * get(2, 0) -
                get(0, 2) * get(1, 1) * get(2, 0) -
                get(1, 2) * get(2, 1) * get(0, 0) -
                get(0, 1) * get(1, 0) * get(2, 2);
    }
    
    @Override
    public Mat33d copy() {
        return new Mat33d(this);
    }
}
