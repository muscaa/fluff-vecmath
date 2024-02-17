package fluff.math.gen._double.matrix;

import fluff.math.IMatrix;

public interface IDoubleMatrix<V extends IDoubleMatrix<V>> extends IMatrix<V> {
	
	V multiply(double val);
	
	V divide(double val);
}
