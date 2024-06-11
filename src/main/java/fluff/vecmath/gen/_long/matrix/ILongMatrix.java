package fluff.vecmath.gen._long.matrix;

import fluff.vecmath.IMatrix;

public interface ILongMatrix<V extends ILongMatrix<V>> extends IMatrix<V> {
	
	void add(long scalar);
	
	void subtract(long scalar);
	
	void multiply(long scalar);
	
	void divide(long scalar);
}
