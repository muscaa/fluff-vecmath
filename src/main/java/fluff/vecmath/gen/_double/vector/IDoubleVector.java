package fluff.vecmath.gen._double.vector;

import fluff.vecmath.IVector;

public interface IDoubleVector<V extends IDoubleVector<V>> extends IVector<V> {
	
	void add(double scalar);
	
	void subtract(double scalar);
	
	void multiply(double scalar);
	
	void divide(double scalar);
}
