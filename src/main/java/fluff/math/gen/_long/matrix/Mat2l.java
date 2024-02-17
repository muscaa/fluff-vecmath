package fluff.math.gen._long.matrix;

public class Mat2l extends AbstractLongMatrix2<Mat2l> {
	
	protected long [][] m;
	
	public Mat2l(long [][] m) {
		set(m);
	}
	
	public Mat2l(Mat2l mat) {
		long [][] m = new long [mat.getRows()][mat.getColumns()];
		for (int i = 0; i < mat.getRows(); i++) {
			for (int j = 0; j < mat.getColumns(); j++) {
				m[i][j] = mat.get(i, j);
			}
		}
		set(m);
	}
	
	@Override
	public long get(int i, int j) {
		return m[i][j];
	}
	
	@Override
	public Mat2l set(int i, int j, long val) {
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
	protected void set(long [][] m) {
		this.m = m;
	}
	
	@Override
	public Mat2l copy() {
		return new Mat2l(this);
	}
}
