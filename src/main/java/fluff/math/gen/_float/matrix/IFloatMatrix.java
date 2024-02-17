package fluff.math.gen._float.matrix;

import fluff.math.IMatrix;

public interface IFloatMatrix<V extends IFloatMatrix<V>> extends IMatrix<V> {
	
	V multiply(float val);
	
	V divide(float val);
}
