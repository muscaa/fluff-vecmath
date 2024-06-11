package fluff.vecmath.gen._int.vector;

import fluff.vecmath.IVector;

public interface IIntVector<V extends IIntVector<V>> extends IVector<V> {
	
	void add(int scalar);
	
	void subtract(int scalar);
	
	void multiply(int scalar);
	
	void divide(int scalar);
}
