package fluff.math.template.matrix;

public class Mat3n extends AbstractNumberMatrix3<Mat3n> {
	
	protected /*number*/int [][][] m;
	
	public Mat3n(/*number*/int [][][] m) {
		set(m);
	}
	
	public Mat3n(Mat3n mat) {
		/*number*/int [][][] m = new /*number*/int [mat.getDepth()][mat.getRows()][mat.getColumns()];
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
	public /*number*/int get(int i, int j, int k) {
		return m[i][j][k];
	}
	
	@Override
	public Mat3n set(int i, int j, int k, /*number*/int val) {
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
	protected void set(/*number*/int [][][] m) {
		this.m = m;
	}
	
	@Override
	public Mat3n copy() {
		return new Mat3n(this);
	}
}
