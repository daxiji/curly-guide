package graphFactory;

public class inexistException extends RuntimeException  {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public inexistException() {
        super();
    }

    public inexistException(String message, Throwable cause) {
        super(message, cause);
    }

    public inexistException(String message) {
        super(message);
    }

    public inexistException(Throwable cause) {
        super(cause);
    }
    
}
