package fluff.math._long.matrix;

import fluff.math.IMatrix;

public interface ILongMatrix<V extends ILongMatrix<V>> extends IMatrix<V> {
	
	V multiply(long val);
	
	V divide(long val);
}
