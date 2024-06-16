package fluff.vecmath.gen._long.matrix;

public abstract class AbstractLongMatrix<V extends AbstractLongMatrix<V>> implements ILongMatrix<V> {
	
	protected abstract long [][] get();
	
	protected abstract void set(long [][] matrix);
	
	public long get(int row, int column) {
		return get()[row][column];
	}
	
	public void set(int row, int column, long value) {
		get()[row][column] = value;
	}
	
	public boolean isSameSize(AbstractLongMatrix<V> mat) {
		return getRows() == mat.getRows() && getColumns() == mat.getColumns();
	}
	
	@Override
	public void add(long scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) + scalar
						);
			}
		}
	}
	
	@Override
	public void subtract(long scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) - scalar
						);
			}
		}
	}
	
	@Override
	public void multiply(long scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) * scalar
						);
			}
		}
	}
	
	@Override
	public void divide(long scalar) {
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
        long [][] newMatrix = new long [getRows()][mat.getColumns()];
        
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
		long [][] newMatrix = new long [getColumns()][getRows()];
		
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
		if (obj instanceof AbstractLongMatrix mat) {
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
