package fluff.math.gen._long.size;

import fluff.math.ISize;

public interface ILongSize<V extends ILongSize<V>> extends ISize<V> {
	
	V add(long val);
	
	V subtract(long val);
	
	V multiply(long val);
	
	V divide(long val);
}
