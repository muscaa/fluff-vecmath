package fluff.vecmath;

public interface IVector<V extends IVector<V>> extends IMath<V> {
	
	void add(V vec);
	
	void subtract(V vec);
	
	void multiply(V vec);
	
	void divide(V vec);
	
	double dotMultiply(V vec);
	
	void absolute();
	
	void negate();
	
	double magnitude();
	
	void normalise();
}
