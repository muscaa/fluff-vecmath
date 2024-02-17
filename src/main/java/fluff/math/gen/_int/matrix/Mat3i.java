package fluff.math.gen._int.matrix;

public class Mat3i extends AbstractIntMatrix3<Mat3i> {
	
	protected int [][][] m;
	
	public Mat3i(int [][][] m) {
		set(m);
	}
	
	public Mat3i(Mat3i mat) {
		int [][][] m = new int [mat.getDepth()][mat.getRows()][mat.getColumns()];
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
	public int get(int i, int j, int k) {
		return m[i][j][k];
	}
	
	@Override
	public Mat3i set(int i, int j, int k, int val) {
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
	protected void set(int [][][] m) {
		this.m = m;
	}
	
	@Override
	public Mat3i copy() {
		return new Mat3i(this);
	}
}
