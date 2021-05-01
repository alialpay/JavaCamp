package homework3_1.polymorphismDemo;

public class ConsoleLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to console : " + message);
	}
}
