package fluff.math._int.matrix;

public abstract class AbstractIntMatrix3<V extends AbstractIntMatrix3<V>> implements IIntMatrix<V> {
	
	protected int[][][] m;
	
	public int get(int i, int j, int k) {
		return m[i][j][k];
	}
	
	public V set(int i, int j, int k, int val) {
		m[i][j][k] = val;
		return (V) this;
	}
	
	@Override
	public V add(V mat) {
		if (isSameSize(mat)) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					for (int k = 0; k < m[0][0].length; k++) {
						m[i][j][k] += mat.m[i][j][k];
					}
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V subtract(V mat) {
		if (isSameSize(mat)) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					for (int k = 0; k < m[0][0].length; k++) {
						m[i][j][k] -= mat.m[i][j][k];
					}
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V multiply(V mat) { // ?
		return (V) this;
	}
	
	@Override
	public V divide(V mat) { // ?
		return (V) this;
	}
	
	@Override
	public V abs() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				for (int k = 0; k < m[0][0].length; k++) {
					m[i][j][k] = Math.abs(m[i][j][k]);
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V negate() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				for (int k = 0; k < m[0][0].length; k++) {
					m[i][j][k] = -m[i][j][k];
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V multiply(int val) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				for (int k = 0; k < m[0][0].length; k++) {
					m[i][j][k] *= val;
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V divide(int val) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				for (int k = 0; k < m[0][0].length; k++) {
					m[i][j][k] /= val;
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < m.length; i++) {
			sb.append("[");
			for (int j = 0; j < m[0].length; j++) {
				sb.append("(");
				for (int k = 0; k < m[0][0].length; k++) {
					sb.append(m[i][j][k]);
					
					if (k + 1 < m[0][0].length) {
						sb.append(", ");
					}
				}
				sb.append(")");
				
				if (j + 1 < m[0].length) {
					sb.append(", ");
				}
			}
			sb.append("]");
			
			if (i + 1 < m.length) {
				sb.append(", ");
			}
		}
		sb.append("}");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractIntMatrix3 mat) {
			if (!isSameSize(mat)) return false;
			
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					for (int k = 0; k < m[0][0].length; k++) {
						if (m[i][j][k] != mat.m[i][j][k]) return false;
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
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				for (int k = 0; k < m[0][0].length; k++) {
					bits = 31L * bits + m[i][j][k];
				}
			}
		}
		return (int) (bits ^ bits >> 32);
	}
	
	protected boolean isSameSize(AbstractIntMatrix3<V> mat) {
		return m.length != mat.m.length || m[0].length != mat.m[0].length || m[0][0].length != mat.m[0][0].length;
	}
}
