package fluff.vecmath;

/**
 * Exception class for errors related to mathematical operations.
 */
public class MathException extends RuntimeException {
    
    private static final long serialVersionUID = 9035270755121017785L;
    
    /**
     * Constructs a new MathException with no detail message.
     */
    public MathException() {
        super();
    }
    
    /**
     * Constructs a new MathException with the specified detail message.
     *
     * @param message the detail message
     */
    public MathException(String message) {
        super(message);
    }
    
    /**
     * Constructs a new MathException with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause the cause of the exception
     */
    public MathException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * Constructs a new MathException with the specified cause.
     *
     * @param cause the cause of the exception
     */
    public MathException(Throwable cause) {
        super(cause);
    }
}
