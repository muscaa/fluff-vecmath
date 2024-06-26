package fluff.vecmath.gen._float.matrix;

import fluff.vecmath.MathException;

/**
 * Class representing a 3x3 matrix with numeric values.
 * Provides various operations such as addition, subtraction, multiplication, and inversion.
 */
public class Mat33f extends AbstractFloatMatrix<Mat33f> {
    
    protected float [][] matrix;
    
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
    public Mat33f(
            float m00, float m01, float m02,
            float m10, float m11, float m12, 
            float m20, float m21, float m22
            ) {
        set(new float [][] {
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
    public Mat33f(Mat33f mat) {
        float [][] matrix = new float [mat.getRows()][mat.getColumns()];
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
    protected float [][] get() {
        return matrix;
    }
    
    @Override
    protected void set(float [][] matrix) {
        this.matrix = matrix;
    }
    
    @Override
    public void invert() {
        float det = determinant();
        if (det == 0) throw new MathException("Matrix is not invertible!");
        
        float [][] newMatrix = new float [3][3];
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
    public float determinant() {
        return get(0, 0) * get(1, 1) * get(2, 2) +
                get(1, 0) * get(2, 1) * get(0, 2) +
                get(0, 1) * get(1, 2) * get(2, 0) -
                get(0, 2) * get(1, 1) * get(2, 0) -
                get(1, 2) * get(2, 1) * get(0, 0) -
                get(0, 1) * get(1, 0) * get(2, 2);
    }
    
    @Override
    public Mat33f copy() {
        return new Mat33f(this);
    }
}
