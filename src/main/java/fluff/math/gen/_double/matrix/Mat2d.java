package fluff.math.gen._double.matrix;

public class Mat2d extends AbstractDoubleMatrix2<Mat2d> {
	
	protected double [][] m;
	
	public Mat2d(double [][] m) {
		set(m);
	}
	
	public Mat2d(Mat2d mat) {
		double [][] m = new double [mat.getRows()][mat.getColumns()];
		for (int i = 0; i < mat.getRows(); i++) {
			for (int j = 0; j < mat.getColumns(); j++) {
				m[i][j] = mat.get(i, j);
			}
		}
		set(m);
	}
	
	@Override
	public double get(int i, int j) {
		return m[i][j];
	}
	
	@Override
	public Mat2d set(int i, int j, double val) {
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
	protected void set(double [][] m) {
		this.m = m;
	}
	
	@Override
	public Mat2d copy() {
		return new Mat2d(this);
	}
}
