package fluff.vecmath.gen._double.matrix;

import fluff.vecmath.IMatrix;

public interface IDoubleMatrix<V extends IDoubleMatrix<V>> extends IMatrix<V> {
	
	void add(double scalar);
	
	void subtract(double scalar);
	
	void multiply(double scalar);
	
	void divide(double scalar);
	
	double determinant();
}
