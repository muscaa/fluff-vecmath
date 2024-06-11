package fluff.vecmath;

public interface IMatrix<V extends IMatrix<V>> extends IMath<V> {
	
	void add(V mat);
	
	void subtract(V mat);
	
	void multiply(V mat);
	
	void divide(V mat);
	
	void absolute();
	
	void negate();
	
	void transpose();
	
	int getRows();
	
	int getColumns();
}
