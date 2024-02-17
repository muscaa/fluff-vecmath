package fluff.math.gen._long.matrix;

public class Mat3l extends AbstractLongMatrix3<Mat3l> {
	
	protected long [][][] m;
	
	public Mat3l(long [][][] m) {
		set(m);
	}
	
	public Mat3l(Mat3l mat) {
		long [][][] m = new long [mat.getDepth()][mat.getRows()][mat.getColumns()];
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
	public long get(int i, int j, int k) {
		return m[i][j][k];
	}
	
	@Override
	public Mat3l set(int i, int j, int k, long val) {
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
	protected void set(long [][][] m) {
		this.m = m;
	}
	
	@Override
	public Mat3l copy() {
		return new Mat3l(this);
	}
}
