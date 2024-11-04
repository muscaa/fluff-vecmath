package fluff.vecmath.gen._double.matrix;

/**
 * Abstract class representing a matrix of numeric values with various arithmetic operations.
 *
 * @param <V> the type of the matrix
 */
public abstract class AbstractDoubleMatrix<V extends AbstractDoubleMatrix<V>> implements IDoubleMatrix<V> {
    
    /**
     * Returns the underlying matrix data.
     *
     * @return a 2D array representing the matrix
     */
    protected abstract double [][] get();
    
    /**
     * Sets the matrix data.
     *
     * @param matrix a 2D array representing the new matrix
     */
    protected abstract V set(double [][] matrix);
    
    /**
     * Returns the value at the specified row and column.
     *
     * @param row the row index
     * @param column the column index
     * @return the value at the specified row and column
     */
    public double get(int row, int column) {
        return get()[row][column];
    }
    
    /**
     * Sets the value at the specified row and column.
     *
     * @param row the row index
     * @param column the column index
     * @param value the value to set
     * @return this matrix
     */
    public V set(int row, int column, double value) {
        get()[row][column] = value;
        return (V) this;
    }
    
    /**
     * Checks if this matrix is the same size as the specified matrix.
     *
     * @param mat the matrix to compare with
     * @return true if the matrices are the same size, false otherwise
     */
    public boolean isSameSize(AbstractDoubleMatrix<V> mat) {
        return getRows() == mat.getRows() && getColumns() == mat.getColumns();
    }
    
    @Override
    public V add(double scalar) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                set(i, j,
                		get(i, j) + scalar
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V subtract(double scalar) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                set(i, j,
                		get(i, j) - scalar
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V multiply(double scalar) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                set(i, j,
                		get(i, j) * scalar
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V divide(double scalar) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                set(i, j,
                		get(i, j) / scalar
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V add(V mat) {
        int rows = Math.min(getRows(), mat.getRows());
        int cols = Math.min(getColumns(), mat.getColumns());
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                set(i, j,
                		get(i, j) + mat.get(i, j)
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V subtract(V mat) {
        int rows = Math.min(getRows(), mat.getRows());
        int cols = Math.min(getColumns(), mat.getColumns());
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                set(i, j,
                		get(i, j) - mat.get(i, j)
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V multiply(V mat) {
        int rows = Math.min(getRows(), mat.getRows());
        int cols = Math.min(getColumns(), mat.getColumns());
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                set(i, j,
                		get(i, j) * mat.get(i, j)
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V divide(V mat) {
        int rows = Math.min(getRows(), mat.getRows());
        int cols = Math.min(getColumns(), mat.getColumns());
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                set(i, j,
                		get(i, j) / mat.get(i, j)
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V crossMultiply(V mat) {
        double [][] newMatrix = new double [getRows()][mat.getColumns()];
        
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < mat.getColumns(); j++) {
                for (int k = 0; k < getColumns(); k++) {
                    newMatrix[i][j] += get(i, k) * mat.get(k, j);
                }
            }
        }
        
        return set(newMatrix);
    }
    
    @Override
    public V absolute() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                set(i, j,
                		Math.abs(get(i, j))
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V negate() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                set(i, j,
                		-get(i, j)
                		);
            }
        }
        return (V) this;
    }
    
    @Override
    public V transpose() {
        double [][] newMatrix = new double [getColumns()][getRows()];
        
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                newMatrix[j][i] = get(i, j);
            }
        }
        
        return set(newMatrix);
    }
    
    @Override
    public boolean isSquare() {
        return getRows() == getColumns();
    }
    
    @Override
    public int getRows() {
        return get().length;
    }
    
    @Override
    public int getColumns() {
        return get()[0].length;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < getRows(); i++) {
            sb.append("(");
            for (int j = 0; j < getColumns(); j++) {
                sb.append(get(i, j));
                
                if (j + 1 < getColumns()) {
                    sb.append(", ");
                }
            }
            sb.append(")");
            
            if (i + 1 < getRows()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractDoubleMatrix mat) {
            if (!isSameSize(mat)) return false;
            
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < getColumns(); j++) {
                    if (get(i, j) != mat.get(i, j)) return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        long bits = 1L;
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                bits = 31L * bits + Double.doubleToLongBits(get(i, j));
            }
        }
        return (int) (bits ^ bits >> 32);
    }
}
