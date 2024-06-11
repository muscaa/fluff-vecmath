package fluff.vecmath.gen._double.matrix;

public class Matd extends AbstractDoubleMatrix<Matd> {
	
	protected double [][] matrix;
	
	public Matd(double [][] matrix) {
		set(matrix);
	}
	
	public Matd(Matd mat) {
		double [][] matrix = new double [mat.getRows()][mat.getColumns()];
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
	protected double [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(double [][] matrix) {
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
	public Matd copy() {
		return new Matd(this);
	}
}
