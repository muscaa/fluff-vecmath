package fluff.vecmath.template.vector;

import fluff.vecmath.IVector;

public interface INumberVector<V extends INumberVector<V>> extends IVector<V> {
	
	void add(/*number*/double scalar);
	
	void subtract(/*number*/double scalar);
	
	void multiply(/*number*/double scalar);
	
	void divide(/*number*/double scalar);
}
