package homework3_1.polymorphismDemo;

public class EmailLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to email : " + message);
	}
}
