package homework3_1.polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
//		EmailLogger emailLogger = new EmailLogger();
//		emailLogger.Log("Log mesajý");
		
//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
//				new ConsoleLogger() };
//
//		for (BaseLogger logger : loggers) {
//			logger.Log("Log mesajý");
//		}

		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		
	}

}
