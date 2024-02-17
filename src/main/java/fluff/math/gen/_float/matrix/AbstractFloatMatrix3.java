package fluff.math.gen._float.matrix;

public abstract class AbstractFloatMatrix3<V extends AbstractFloatMatrix3<V>> implements IFloatMatrix<V> {
	
	public abstract float get(int i, int j, int k);
	
	public abstract V set(int i, int j, int k, float val);
	
	public abstract int getDepth();
	
	public abstract int getRows();
	
	public abstract int getColumns();
	
	protected abstract void set(float [][][] m);
	
	@Override
	public V add(V mat) {
		if (isSameSize(mat)) {
			for (int i = 0; i < getDepth(); i++) {
				for (int j = 0; j < getRows(); j++) {
					for (int k = 0; k < getColumns(); k++) {
						set(i, j, k,
								get(i, j, k) + mat.get(i, j, k)
								);
					}
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V subtract(V mat) {
		if (isSameSize(mat)) {
			for (int i = 0; i < getDepth(); i++) {
				for (int j = 0; j < getRows(); j++) {
					for (int k = 0; k < getColumns(); k++) {
						set(i, j, k,
								get(i, j, k) - mat.get(i, j, k)
								);
					}
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V multiply(V mat) {
		float [][][] result = new float [getDepth()][getRows()][mat.getColumns()];
        for (int i = 0; i < getDepth(); i++) {
            for (int j = 0; j < getRows(); j++) {
                for (int k = 0; k < mat.getColumns(); k++) {
                    for (int l = 0; l < getColumns(); l++) {
                        result[i][j][k] += get(i, j, l) * mat.get(i, l, k);
                    }
                }
            }
        }
        set(result);
		return (V) this;
	}
	
	@Override
	public V abs() {
		for (int i = 0; i < getDepth(); i++) {
			for (int j = 0; j < getRows(); j++) {
				for (int k = 0; k < getColumns(); k++) {
					set(i, j, k,
							Math.abs(get(i, j, k))
							);
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V negate() {
		for (int i = 0; i < getDepth(); i++) {
			for (int j = 0; j < getRows(); j++) {
				for (int k = 0; k < getColumns(); k++) {
					set(i, j, k,
							-get(i, j, k)
							);
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V multiply(float val) {
		for (int i = 0; i < getDepth(); i++) {
			for (int j = 0; j < getRows(); j++) {
				for (int k = 0; k < getColumns(); k++) {
					set(i, j, k,
							get(i, j, k) * val
							);
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V divide(float val) {
		for (int i = 0; i < getDepth(); i++) {
			for (int j = 0; j < getRows(); j++) {
				for (int k = 0; k < getColumns(); k++) {
					set(i, j, k,
							get(i, j, k) / val
							);
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < getDepth(); i++) {
			sb.append("[");
			for (int j = 0; j < getRows(); j++) {
				sb.append("(");
				for (int k = 0; k < getColumns(); k++) {
					sb.append(get(i, j, k));
					
					if (k + 1 < getColumns()) {
						sb.append(", ");
					}
				}
				sb.append(")");
				
				if (j + 1 < getRows()) {
					sb.append(", ");
				}
			}
			sb.append("]");
			
			if (i + 1 < getDepth()) {
				sb.append(", ");
			}
		}
		sb.append("}");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractFloatMatrix3 mat) {
			if (!isSameSize(mat)) return false;
			
			for (int i = 0; i < getDepth(); i++) {
				for (int j = 0; j < getRows(); j++) {
					for (int k = 0; k < getColumns(); k++) {
						if (get(i, j, k) != mat.get(i, j, k)) return false;
					}
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		for (int i = 0; i < getDepth(); i++) {
			for (int j = 0; j < getRows(); j++) {
				for (int k = 0; k < getColumns(); k++) {
					bits = 31L * bits + Float.floatToIntBits(get(i, j, k));
				}
			}
		}
		return (int) (bits ^ bits >> 32);
	}
	
	protected boolean isSameSize(AbstractFloatMatrix3<V> mat) {
		return getDepth() != mat.getDepth() || getRows() != mat.getRows() || getColumns() != mat.getColumns();
	}
}
