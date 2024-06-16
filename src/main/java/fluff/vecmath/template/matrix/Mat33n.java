package fluff.vecmath.template.matrix;

public class Mat33n extends AbstractNumberMatrix<Mat33n> {
	
	protected /*number*/double [][] matrix;
	
	public Mat33n(
			/*number*/double m00, /*number*/double m01, /*number*/double m02,
			/*number*/double m10, /*number*/double m11, /*number*/double m12, 
			/*number*/double m20, /*number*/double m21, /*number*/double m22
			) {
		set(new /*number*/double [][] {
			{ m00, m01, m02 },
			{ m10, m11, m12 },
			{ m20, m21, m22 }
		});
	}
	
	public Mat33n(Mat33n mat) {
		/*number*/double [][] matrix = new /*number*/double [mat.getRows()][mat.getColumns()];
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
	protected /*number*/double [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(/*number*/double [][] matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public void invert() {
	}
	
	@Override
	public /*number*/double determinant() {
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
	public Mat33n copy() {
		return new Mat33n(this);
	}
}
