package fluff.vecmath.gen._int.matrix;

public class Mat33i extends AbstractIntMatrix<Mat33i> {
	
	protected int [][] matrix;
	
	public Mat33i(
			int m00, int m01, int m02,
			int m10, int m11, int m12, 
			int m20, int m21, int m22
			) {
		set(new int [][] {
			{ m00, m01, m02 },
			{ m10, m11, m12 },
			{ m20, m21, m22 }
		});
	}
	
	public Mat33i(Mat33i mat) {
		int [][] matrix = new int [mat.getRows()][mat.getColumns()];
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
	protected int [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(int [][] matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public void invert() {
	}
	
	@Override
	public int determinant() {
		return get(0, 0) * get(1, 1) * get(2, 2) +
				get(1, 0) * get(2, 1) * get(0, 2) +
				get(0, 1) * get(1, 2) * get(2, 0) -
				get(0, 2) * get(1, 1) * get(2, 0) -
				get(1, 2) * get(2, 1) * get(0, 0) -
				get(0, 1) * get(1, 0) * get(2, 2)
				;
	}
	
	@Override
	public int rank() {
		return 0;
	}
	
	@Override
	public Mat33i copy() {
		return new Mat33i(this);
	}
}
