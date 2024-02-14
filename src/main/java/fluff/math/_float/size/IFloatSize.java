package fluff.math._float.size;

import fluff.math.ISize;

public interface IFloatSize<V extends IFloatSize<V>> extends ISize<V> {
	
	V add(float val);
	
	V subtract(float val);
	
	V multiply(float val);
	
	V divide(float val);
}
