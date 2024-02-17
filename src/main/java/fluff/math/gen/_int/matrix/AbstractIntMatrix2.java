package fluff.math.gen._int.matrix;

public abstract class AbstractIntMatrix2<V extends AbstractIntMatrix2<V>> implements IIntMatrix<V> {
	
	public abstract int get(int i, int j);
	
	public abstract V set(int i, int j, int val);
	
	public abstract int getRows();
	
	public abstract int getColumns();
	
	protected abstract void set(int [][] m);
	
	@Override
	public V add(V mat) {
		if (isSameSize(mat)) {
			for (int i = 0; i < getRows(); i++) {
				for (int j = 0; j < getColumns(); j++) {
					set(i, j,
							get(i, j) + mat.get(i, j)
							);
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V subtract(V mat) {
		if (isSameSize(mat)) {
			for (int i = 0; i < getRows(); i++) {
				for (int j = 0; j < getColumns(); j++) {
					set(i, j,
							get(i, j) - mat.get(i, j)
							);
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V multiply(V mat) {
        int [][] result = new int [getRows()][mat.getColumns()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < mat.getColumns(); j++) {
                for (int k = 0; k < getColumns(); k++) {
                    result[i][j] += get(i, k) * mat.get(k, j);
                }
            }
        }
        set(result);
		return (V) this;
	}
	
	@Override
	public V abs() {
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
	public V multiply(int val) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) * val
						);
			}
		}
		return (V) this;
	}
	
	@Override
	public V divide(int val) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				set(i, j,
						get(i, j) / val
						);
			}
		}
		return (V) this;
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
		if (obj instanceof AbstractIntMatrix2 mat) {
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
	
	protected boolean isSameSize(AbstractIntMatrix2<V> mat) {
		return getRows() != mat.getRows() || getColumns() != mat.getColumns();
	}
}
