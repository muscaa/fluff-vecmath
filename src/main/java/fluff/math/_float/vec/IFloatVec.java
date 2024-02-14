package fluff.math._float.vec;

import fluff.math.IVec;

public interface IFloatVec<V extends IFloatVec<V>> extends IVec<V> {
	
	V add(float val);
	
	V subtract(float val);
	
	V multiply(float val);
	
	V divide(float val);
}
