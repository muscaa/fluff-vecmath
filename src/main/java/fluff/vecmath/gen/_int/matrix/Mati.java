package fluff.vecmath.gen._int.matrix;

public class Mati extends AbstractIntMatrix<Mati> {
	
	protected int [][] matrix;
	
	public Mati(int [][] matrix) {
		set(matrix);
	}
	
	public Mati(Mati mat) {
		int [][] matrix = new int [mat.getRows()][mat.getColumns()];
		set(matrix);
		
		for (int i = 0; i < mat.getRows(); i++) {
			for (int j = 0; j < mat.getColumns(); j++) {
				set(i, j,
						mat.get(i, j)
						);
			}
		}
	}
	
	@Override
	protected int [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(int [][] matrix) {
		this.matrix = matrix;
	}
	
	@Override
	public int getRows() {
		return matrix.length;
	}
	
	@Override
	public int getColumns() {
		return matrix[0].length;
	}
	
	@Override
	public Mati copy() {
		return new Mati(this);
	}
}
