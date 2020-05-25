package log;

public class LoggerTester {
	
	public static void main(String[] args) {
		Eventlogger logger = new Eventlogger("log.txt");
		logger.log("test");
	}
	
}
