package fluff.vecmath.gen._long.vector;

import fluff.vecmath.IVector;

public interface ILongVector<V extends ILongVector<V>> extends IVector<V> {
	
	void add(long scalar);
	
	void subtract(long scalar);
	
	void multiply(long scalar);
	
	void divide(long scalar);
}
