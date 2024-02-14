package fluff.math._int.matrix;

public class IntMat3 extends AbstractIntMatrix3<IntMat3> {
	
	public IntMat3(int[][][] m) {
		this.m = m;
	}
	
	public IntMat3(IntMat3 mat) {
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
	public IntMat3 copy() {
		return new IntMat3(this);
	}
}
