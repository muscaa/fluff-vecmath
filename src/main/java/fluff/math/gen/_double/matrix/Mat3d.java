package fluff.math.gen._double.matrix;

public class Mat3d extends AbstractDoubleMatrix3<Mat3d> {
	
	protected double [][][] m;
	
	public Mat3d(double [][][] m) {
		set(m);
	}
	
	public Mat3d(Mat3d mat) {
		double [][][] m = new double [mat.getDepth()][mat.getRows()][mat.getColumns()];
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
	public double get(int i, int j, int k) {
		return m[i][j][k];
	}
	
	@Override
	public Mat3d set(int i, int j, int k, double val) {
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
	protected void set(double [][][] m) {
		this.m = m;
	}
	
	@Override
	public Mat3d copy() {
		return new Mat3d(this);
	}
}
