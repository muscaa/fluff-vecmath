package fluff.vecmath.template.matrix;

public class Matn extends AbstractNumberMatrix<Matn> {
	
	protected /*number*/double [][] matrix;
	
	public Matn(/*number*/double [][] matrix) {
		set(matrix);
	}
	
	public Matn(Matn mat) {
		/*number*/double [][] matrix = new /*number*/double [mat.getRows()][mat.getColumns()];
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
	protected /*number*/double [][] get() {
		return matrix;
	}
	
	@Override
	protected void set(/*number*/double [][] matrix) {
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
	public Matn copy() {
		return new Matn(this);
	}
}
