package homework3_1.polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to database : " + message);
	}
}
