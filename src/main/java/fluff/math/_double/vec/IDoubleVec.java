package fluff.math._double.vec;

import fluff.math.IVec;

public interface IDoubleVec<V extends IDoubleVec<V>> extends IVec<V> {
	
	V add(double val);
	
	V subtract(double val);
	
	V multiply(double val);
	
	V divide(double val);
}
