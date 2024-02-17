package fluff.math.template.matrix;

import fluff.math.IMatrix;

public interface INumberMatrix<V extends INumberMatrix<V>> extends IMatrix<V> {
	
	V multiply(/*number*/int val);
	
	V divide(/*number*/int val);
}
