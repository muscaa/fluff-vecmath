package fluff.math._int.matrix;

public abstract class AbstractIntMatrix2<V extends AbstractIntMatrix2<V>> implements IIntMatrix<V> {
	
	protected int[][] m;
	
	public int get(int i, int j) {
		return m[i][j];
	}
	
	public V set(int i, int j, int val) {
		m[i][j] = val;
		return (V) this;
	}
	
	@Override
	public V add(V mat) {
		if (isSameSize(mat)) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					m[i][j] += mat.m[i][j];
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
					m[i][j] -= mat.m[i][j];
				}
			}
		}
		return (V) this;
	}
	
	@Override
	public V multiply(V mat) { // may produce different size
		
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
				m[i][j] = Math.abs(m[i][j]);
			}
		}
		return (V) this;
	}
	
	@Override
	public V negate() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = -m[i][j];
			}
		}
		return (V) this;
	}
	
	@Override
	public V multiply(int val) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] *= val;
			}
		}
		return (V) this;
	}
	
	@Override
	public V divide(int val) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] /= val;
			}
		}
		return (V) this;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < m.length; i++) {
			sb.append("(");
			for (int j = 0; j < m[0].length; j++) {
				sb.append(m[i][j]);
				
				if (j + 1 < m[0].length) {
					sb.append(", ");
				}
			}
			sb.append(")");
			
			if (i + 1 < m.length) {
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
			
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					if (m[i][j] != mat.m[i][j]) return false;
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
				bits = 31L * bits + m[i][j];
			}
		}
		return (int) (bits ^ bits >> 32);
	}
	
	protected boolean isSameSize(AbstractIntMatrix2<V> mat) {
		return m.length != mat.m.length || m[0].length != mat.m[0].length;
	}
}
