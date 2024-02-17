package fluff.math.gen._float.matrix;

public class Mat3f extends AbstractFloatMatrix3<Mat3f> {
	
	protected float [][][] m;
	
	public Mat3f(float [][][] m) {
		set(m);
	}
	
	public Mat3f(Mat3f mat) {
		float [][][] m = new float [mat.getDepth()][mat.getRows()][mat.getColumns()];
		for (int i = 0; i < mat.getDepth(); i++) {
			for (int j = 0; j < mat.getRows(); j++) {
				for (int k = 0; k < mat.getColumns(); k++) {
					m[i][j][k] = mat.get(i, j, k);
				}
			}
		}
		set(m);
	}
	
	@Override
	public float get(int i, int j, int k) {
		return m[i][j][k];
	}
	
	@Override
	public Mat3f set(int i, int j, int k, float val) {
		m[i][j][k] = val;
		return this;
	}
	
	@Override
	public int getDepth() {
		return m.length;
	}
	
	@Override
	public int getRows() {
		return m[0].length;
	}
	
	@Override
	public int getColumns() {
		return m[0][0].length;
	}
	
	@Override
	protected void set(float [][][] m) {
		this.m = m;
	}
	
	@Override
	public Mat3f copy() {
		return new Mat3f(this);
	}
}
