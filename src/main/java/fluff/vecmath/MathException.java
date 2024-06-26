package fluff.vecmath;

public class MathException extends RuntimeException {
	
	private static final long serialVersionUID = 9035270755121017785L;
	
	public MathException() {
        super();
    }
	
    public MathException(String message) {
        super(message);
    }
    
    public MathException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public MathException(Throwable cause) {
        super(cause);
    }
}
