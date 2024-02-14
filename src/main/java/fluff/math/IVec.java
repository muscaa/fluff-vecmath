package fluff.math;

public interface IVec<V extends IVec<V>> {
	
	V add(V vec);
	
	V subtract(V vec);
	
	V multiply(V vec);
	
	V divide(V vec);
	
	V abs();
	
	V negate();
	
	double length();
	
	V copy();
	
	boolean isInside(V min, V max);
}
