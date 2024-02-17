package fluff.math.template.matrix;

public class Mat2n extends AbstractNumberMatrix2<Mat2n> {
	
	protected /*number*/int [][] m;
	
	public Mat2n(/*number*/int [][] m) {
		set(m);
	}
	
	public Mat2n(Mat2n mat) {
		/*number*/int [][] m = new /*number*/int [mat.getRows()][mat.getColumns()];
		for (int i = 0; i < mat.getRows(); i++) {
			for (int j = 0; j < mat.getColumns(); j++) {
				m[i][j] = mat.get(i, j);
			}
		}
		set(m);
	}
	
	@Override
	public /*number*/int get(int i, int j) {
		return m[i][j];
	}
	
	@Override
	public Mat2n set(int i, int j, /*number*/int val) {
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
	protected void set(/*number*/int [][] m) {
		this.m = m;
	}
	
	@Override
	public Mat2n copy() {
		return new Mat2n(this);
	}
}
