package fluff.vecmath.gen._int.matrix;

public abstract class AbstractIntMatrix<V extends AbstractIntMatrix<V>> implements IIntMatrix<V> {
	
	protected abstract int [][] get();
	
	protected abstract void set(int [][] matrix);
	
	public int get(int row, int column) {
		return get()[row][column];
	}
	
	public void set(int row, int column, int value) {
		get()[row][column] = value;
	}
	
	public void resize(int rowOff, int columnOff, int rows, int columns) {
		int [][] newMatrix = new int [rows][columns];
		
		for (int i = 0; i < rows; i++, rowOff++) {
			for (int j = 0; j < columns; j++, columnOff++) {
				newMatrix[i][j] = rowOff < getRows() && columnOff < getColumns() ? get(rowOff, columnOff) : 0;
			}
		}
		
		set(newMatrix);
	}
	
	public boolean isSameSize(AbstractIntMatrix<V> mat) {
		return getRows() == mat.getRows() && getColumns() == mat.getColumns();
	}
	
	@Override
	public void add(int scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) + scalar
						);
			}
		}
	}
	
	@Override
	public void subtract(int scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) - scalar
						);
			}
		}
	}
	
	@Override
	public void multiply(int scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) * scalar
						);
			}
		}
	}
	
	@Override
	public void divide(int scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) / scalar
						);
			}
		}
	}
	
	@Override
	public void add(V mat) {
		int rows = Math.min(getRows(), mat.getRows());
		int cols = Math.min(getColumns(), mat.getColumns());
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				set(i, j,
						get(i, j) + mat.get(i, j)
						);
			}
		}
	}
	
	@Override
	public void subtract(V mat) {
		int rows = Math.min(getRows(), mat.getRows());
		int cols = Math.min(getColumns(), mat.getColumns());
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				set(i, j,
						get(i, j) - mat.get(i, j)
						);
			}
		}
	}
	
	@Override
	public void multiply(V mat) {
		int rows = Math.min(getRows(), mat.getRows());
		int cols = Math.min(getColumns(), mat.getColumns());
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				set(i, j,
						get(i, j) * mat.get(i, j)
						);
			}
		}
	}
	
	@Override
	public void divide(V mat) {
		int rows = Math.min(getRows(), mat.getRows());
		int cols = Math.min(getColumns(), mat.getColumns());
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				set(i, j,
						get(i, j) / mat.get(i, j)
						);
			}
		}
	}
	
	@Override
	public void crossMultiply(V mat) {
        int [][] newMatrix = new int [getRows()][mat.getColumns()];
        
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < mat.getColumns(); j++) {
                for (int k = 0; k < getColumns(); k++) {
                	newMatrix[i][j] += get(i, k) * mat.get(k, j);
                }
            }
        }
        
        set(newMatrix);
	}
	
	@Override
	public void invert() {
	}
	
	@Override
	public int determinant() {
		if (!isSquare()) return 0;
		int n = getRows();
		int [][] copy = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				copy[i][j] = get(i, j);
			}
		}
		
		for (int k = 0; k < n - 1; k++) {
			for (int i = k + 1; i < n; i++) {
				for (int j = k + 1; j < n; j++) {
					int pivot = k != 0 ? copy[k - 1][k - 1] : 1;
					
					copy[i][j] = copy[i][j] * copy[k][k] - copy[i][k] * copy[k][j];
					copy[i][j] /= pivot;
				}
			}
		}
		
		return copy[n - 1][n - 1];
	}
	
	@Override
	public int rank() {
		return 0;
	}
	
	@Override
	public void absolute() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						Math.abs(get(i, j))
						);
			}
		}
	}
	
	@Override
	public void negate() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						-get(i, j)
						);
			}
		}
	}
	
	@Override
	public void transpose() {
		int [][] newMatrix = new int [getColumns()][getRows()];
		
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				newMatrix[j][i] = get(i, j);
			}
		}
		
		set(newMatrix);
	}
	
	@Override
	public boolean isSquare() {
		return getRows() == getColumns();
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
		if (obj instanceof AbstractIntMatrix mat) {
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
				bits = 31L * bits + get(i, j);
			}
		}
		return (int) (bits ^ bits >> 32);
	}
}
