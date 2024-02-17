package fluff.math.template.size;

import fluff.math.ISize;

public interface INumberSize<V extends INumberSize<V>> extends ISize<V> {
	
	V add(/*number*/int val);
	
	V subtract(/*number*/int val);
	
	V multiply(/*number*/int val);
	
	V divide(/*number*/int val);
}
