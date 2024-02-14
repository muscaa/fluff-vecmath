package fluff.math._int.matrix;

import fluff.math.IMatrix;

public interface IIntMatrix<V extends IIntMatrix<V>> extends IMatrix<V> {
	
	V multiply(int val);
	
	V divide(int val);
}
