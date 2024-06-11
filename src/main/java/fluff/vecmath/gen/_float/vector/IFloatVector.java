package fluff.vecmath.gen._float.vector;

import fluff.vecmath.IVector;

public interface IFloatVector<V extends IFloatVector<V>> extends IVector<V> {
	
	void add(float scalar);
	
	void subtract(float scalar);
	
	void multiply(float scalar);
	
	void divide(float scalar);
}
