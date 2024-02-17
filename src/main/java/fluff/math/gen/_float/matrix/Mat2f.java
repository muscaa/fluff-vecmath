package fluff.math.gen._float.matrix;

public class Mat2f extends AbstractFloatMatrix2<Mat2f> {
	
	protected float [][] m;
	
	public Mat2f(float [][] m) {
		set(m);
	}
	
	public Mat2f(Mat2f mat) {
		float [][] m = new float [mat.getRows()][mat.getColumns()];
		for (int i = 0; i < mat.getRows(); i++) {
			for (int j = 0; j < mat.getColumns(); j++) {
				m[i][j] = mat.get(i, j);
			}
		}
		set(m);
	}
	
	@Override
	public float get(int i, int j) {
		return m[i][j];
	}
	
	@Override
	public Mat2f set(int i, int j, float val) {
		m[i][j] = val;
		return this;
	}
	
	@Override
	public int getRows() {
		return m.length;
	}
	
	@Override
	public int getColumns() {
		return m[0].length;
	}
	
	@Override
	protected void set(float [][] m) {
		this.m = m;
	}
	
	@Override
	public Mat2f copy() {
		return new Mat2f(this);
	}
}
