package fluff.vecmath.gen._double.matrix;

public class Mat33d extends AbstractDoubleMatrix<Mat33d> {
	
	protected double [][] matrix;
	
	public Mat33d(
			double m00, double m01, double m02,
			double m10, double m11, double m12, 
			double m20, double m21, double m22
			) {
		set(new double [][] {
			{ m00, m01, m02 },
			{ m10, m11, m12 },
			{ m20, m21, m22 }
		});
	}
	
	public Mat33d(Mat33d mat) {
		double [][] matrix = new double [mat.getRows()][mat.getColumns()];
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
	protected double [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(double [][] matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public void invert() {
	}
	
	@Override
	public double determinant() {
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
	public Mat33d copy() {
		return new Mat33d(this);
	}
}
