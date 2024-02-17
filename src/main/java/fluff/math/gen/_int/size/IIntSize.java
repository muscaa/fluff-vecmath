package fluff.math.gen._int.size;

import fluff.math.ISize;

public interface IIntSize<V extends IIntSize<V>> extends ISize<V> {
	
	V add(int val);
	
	V subtract(int val);
	
	V multiply(int val);
	
	V divide(int val);
}
