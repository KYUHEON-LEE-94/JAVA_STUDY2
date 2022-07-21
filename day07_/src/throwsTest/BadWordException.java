package throwsTest;

public class BadWordException extends RuntimeException{

	public BadWordException() {
		super();
	}
	
	public BadWordException(String s) {
		super(s);
	}

	
}
