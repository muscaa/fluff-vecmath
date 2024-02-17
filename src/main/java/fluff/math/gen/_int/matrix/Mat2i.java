package fluff.math.gen._int.matrix;

public class Mat2i extends AbstractIntMatrix2<Mat2i> {
	
	protected int [][] m;
	
	public Mat2i(int [][] m) {
		set(m);
	}
	
	public Mat2i(Mat2i mat) {
		int [][] m = new int [mat.getRows()][mat.getColumns()];
		for (int i = 0; i < mat.getRows(); i++) {
			for (int j = 0; j < mat.getColumns(); j++) {
				m[i][j] = mat.get(i, j);
			}
		}
		set(m);
	}
	
	@Override
	public int get(int i, int j) {
		return m[i][j];
	}
	
	@Override
	public Mat2i set(int i, int j, int val) {
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
	protected void set(int [][] m) {
		this.m = m;
	}
	
	@Override
	public Mat2i copy() {
		return new Mat2i(this);
	}
}
