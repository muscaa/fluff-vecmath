package fluff.vecmath.gen._float.matrix;

public class Matf extends AbstractFloatMatrix<Matf> {
	
	protected float [][] matrix;
	
	public Matf(float [][] matrix) {
		set(matrix);
	}
	
	public Matf(Matf mat) {
		float [][] matrix = new float [mat.getRows()][mat.getColumns()];
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
	protected float [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(float [][] matrix) {
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
	public Matf copy() {
		return new Matf(this);
	}
}
