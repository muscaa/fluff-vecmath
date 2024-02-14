package fluff.math._int.vec;

import fluff.math.IVec;

public interface IIntVec<V extends IIntVec<V>> extends IVec<V> {
	
	V add(int val);
	
	V subtract(int val);
	
	V multiply(int val);
	
	V divide(int val);
}
