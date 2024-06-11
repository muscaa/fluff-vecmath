package fluff.vecmath.gen._long.matrix;

public class Matl extends AbstractLongMatrix<Matl> {
	
	protected long [][] matrix;
	
	public Matl(long [][] matrix) {
		set(matrix);
	}
	
	public Matl(Matl mat) {
		long [][] matrix = new long [mat.getRows()][mat.getColumns()];
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
	protected long [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(long [][] matrix) {
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
	public Matl copy() {
		return new Matl(this);
	}
}
