package fluff.math._double.size;

import fluff.math.ISize;

public interface IDoubleSize<V extends IDoubleSize<V>> extends ISize<V> {
	
	V add(double val);
	
	V subtract(double val);
	
	V multiply(double val);
	
	V divide(double val);
}
