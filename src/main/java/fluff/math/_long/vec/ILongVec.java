package fluff.math._long.vec;

import fluff.math.IVec;

public interface ILongVec<V extends ILongVec<V>> extends IVec<V> {
	
	V add(long val);
	
	V subtract(long val);
	
	V multiply(long val);
	
	V divide(long val);
}
