package fluff.math._int.matrix;

public class Mat2i extends AbstractIntMatrix2<Mat2i> {
	
	public Mat2i(int[][] m) {
		this.m = m;
	}
	
	public Mat2i(Mat2i mat) {
		int[][] m = new int[mat.m.length][mat.m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = mat.m[i][j];
			}
		}
		this.m = m;
	}
	
	@Override
	public Mat2i copy() {
		return new Mat2i(this);
	}
}
