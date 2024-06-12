package fluff.vecmath.gen._float.matrix;

import fluff.vecmath.IMatrix;

public interface IFloatMatrix<V extends IFloatMatrix<V>> extends IMatrix<V> {
	
	void add(float scalar);
	
	void subtract(float scalar);
	
	void multiply(float scalar);
	
	void divide(float scalar);
	
	float determinant();
}
