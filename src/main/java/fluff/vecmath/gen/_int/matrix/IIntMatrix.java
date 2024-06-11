package fluff.vecmath.gen._int.matrix;

import fluff.vecmath.IMatrix;

public interface IIntMatrix<V extends IIntMatrix<V>> extends IMatrix<V> {
	
	void add(int scalar);
	
	void subtract(int scalar);
	
	void multiply(int scalar);
	
	void divide(int scalar);
}
