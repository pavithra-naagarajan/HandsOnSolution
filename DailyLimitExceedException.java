package exceptiondemo;

public class DailyLimitExceedException extends Exception{

	public DailyLimitExceedException() {
		
	}
	public DailyLimitExceedException(String msg) {
		super(msg);
	}

}
