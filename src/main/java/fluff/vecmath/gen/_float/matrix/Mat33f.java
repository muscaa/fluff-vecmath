package fluff.vecmath.gen._float.matrix;

public class Mat33f extends AbstractFloatMatrix<Mat33f> {
	
	protected float [][] matrix;
	
	public Mat33f(
			float m00, float m01, float m02,
			float m10, float m11, float m12, 
			float m20, float m21, float m22
			) {
		set(new float [][] {
			{ m00, m01, m02 },
			{ m10, m11, m12 },
			{ m20, m21, m22 }
		});
	}
	
	public Mat33f(Mat33f mat) {
		float [][] matrix = new float [mat.getRows()][mat.getColumns()];
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
	protected float [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(float [][] matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public void invert() {
	}
	
	@Override
	public float determinant() {
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
	public Mat33f copy() {
		return new Mat33f(this);
	}
}
