package fluff.math.template.vec;

import fluff.math.IVec;

/*public*/ interface INumberVec<V extends INumberVec<V>> extends IVec<V> {
	
	V add(/*number*/int val);
	
	V subtract(/*number*/int val);
	
	V multiply(/*number*/int val);
	
	V divide(/*number*/int val);
}
