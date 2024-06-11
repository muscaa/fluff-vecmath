package fluff.vecmath.template.matrix;

import fluff.vecmath.IMatrix;

public interface INumberMatrix<V extends INumberMatrix<V>> extends IMatrix<V> {
	
	void add(/*number*/double scalar);
	
	void subtract(/*number*/double scalar);
	
	void multiply(/*number*/double scalar);
	
	void divide(/*number*/double scalar);
}
