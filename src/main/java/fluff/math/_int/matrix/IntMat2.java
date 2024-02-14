package fluff.math._int.matrix;

public class IntMat2 extends AbstractIntMatrix2<IntMat2> {
	
	public IntMat2(int[][] m) {
		this.m = m;
	}
	
	public IntMat2(IntMat2 mat) {
		int[][] m = new int[mat.m.length][mat.m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = mat.m[i][j];
			}
		}
		this.m = m;
	}
	
	@Override
	public IntMat2 copy() {
		return new IntMat2(this);
	}
}
