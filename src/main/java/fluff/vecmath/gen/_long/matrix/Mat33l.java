package fluff.vecmath.gen._long.matrix;

import fluff.vecmath.MathException;

public class Mat33l extends AbstractLongMatrix<Mat33l> {
	
	protected long [][] matrix;
	
	public Mat33l(
			long m00, long m01, long m02,
			long m10, long m11, long m12, 
			long m20, long m21, long m22
			) {
		set(new long [][] {
			{ m00, m01, m02 },
			{ m10, m11, m12 },
			{ m20, m21, m22 }
		});
	}
	
	public Mat33l(Mat33l mat) {
		long [][] matrix = new long [mat.getRows()][mat.getColumns()];
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
	protected long [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(long [][] matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public void invert() {
		long det = determinant();
		if (det == 0) throw new MathException("Matrix is not invertible!");
		
		long [][] inv = new long [3][3];
	    inv[0][0] = (get(1, 1) * get(2, 2) - get(1, 2) * get(2, 1)) / det;
	    inv[0][1] = (get(0, 2) * get(2, 1) - get(0, 1) * get(2, 2)) / det;
	    inv[0][2] = (get(0, 1) * get(1, 2) - get(0, 2) * get(1, 1)) / det;
	    inv[1][0] = (get(1, 2) * get(2, 0) - get(1, 0) * get(2, 2)) / det;
	    inv[1][1] = (get(0, 0) * get(2, 2) - get(0, 2) * get(2, 0)) / det;
	    inv[1][2] = (get(0, 2) * get(1, 0) - get(0, 0) * get(1, 2)) / det;
	    inv[2][0] = (get(1, 0) * get(2, 1) - get(1, 1) * get(2, 0)) / det;
	    inv[2][1] = (get(0, 1) * get(2, 0) - get(0, 0) * get(2, 1)) / det;
	    inv[2][2] = (get(0, 0) * get(1, 1) - get(0, 1) * get(1, 0)) / det;
	    
	    set(inv);
	}
	
	@Override
	public long determinant() {
		return get(0, 0) * get(1, 1) * get(2, 2) +
				get(1, 0) * get(2, 1) * get(0, 2) +
				get(0, 1) * get(1, 2) * get(2, 0) -
				get(0, 2) * get(1, 1) * get(2, 0) -
				get(1, 2) * get(2, 1) * get(0, 0) -
				get(0, 1) * get(1, 0) * get(2, 2)
				;
	}
	
	@Override
	public Mat33l copy() {
		return new Mat33l(this);
	}
}
