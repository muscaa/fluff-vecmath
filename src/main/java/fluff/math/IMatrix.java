package fluff.math;

public interface IMatrix<V extends IMatrix<V>> {
	
	V add(V mat);
	
	V subtract(V mat);
	
	V multiply(V mat);
	
	V abs();
	
	V negate();
	
	V copy();
}
