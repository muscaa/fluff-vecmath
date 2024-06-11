package fluff.vecmath.template.matrix;

public abstract class AbstractNumberMatrix<V extends AbstractNumberMatrix<V>> implements INumberMatrix<V> {
	
	protected abstract /*number*/double [][] get();
	
	protected abstract void set(/*number*/double [][] matrix);
	
	public /*number*/double get(int row, int column) {
		return get()[row][column];
	}
	
	public void set(int row, int column, /*number*/double value) {
		get()[row][column] = value;
	}
	
	public void resize(int rowOff, int columnOff, int rows, int columns) {
		/*number*/double [][] newMatrix = new /*number*/double [rows][columns];
		
		for (int i = 0; i < rows; i++, rowOff++) {
			for (int j = 0; j < columns; j++, columnOff++) {
				newMatrix[i][j] = rowOff < getRows() && columnOff < getColumns() ? get(rowOff, columnOff) : 0;
			}
		}
		
		set(newMatrix);
	}
	
	public boolean isSameSize(AbstractNumberMatrix<V> mat) {
		return getRows() == mat.getRows() && getColumns() == mat.getColumns();
	}
	
	@Override
	public void add(/*number*/double scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) + scalar
						);
			}
		}
	}
	
	@Override
	public void subtract(/*number*/double scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) - scalar
						);
			}
		}
	}
	
	@Override
	public void multiply(/*number*/double scalar) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) * scalar
						);
			}
		}
	}
	
	@Override
	public void divide(/*number*/double scalar) {
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
		/*number*/double [][] newMatrix = new /*number*/double [getColumns()][getRows()];
		
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				newMatrix[j][i] = get(i, j);
			}
		}
		
		set(newMatrix);
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
		if (obj instanceof AbstractNumberMatrix mat) {
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
				bits = 31L * bits /*convert_ij*/;
			}
		}
		return (int) (bits ^ bits >> 32);
	}
}
