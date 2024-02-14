package fluff.math._int.matrix;

public class Mat3i extends AbstractIntMatrix3<Mat3i> {
	
	public Mat3i(int[][][] m) {
		this.m = m;
	}
	
	public Mat3i(Mat3i mat) {
		int[][][] m = new int[mat.m.length][mat.m[0].length][mat.m[0][0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				for (int k = 0; k < m[0][0].length; k++) {
					m[i][j][k] = mat.m[i][j][k];
				}
			}
		}
		this.m = m;
	}
	
	@Override
	public Mat3i copy() {
		return new Mat3i(this);
	}
}
