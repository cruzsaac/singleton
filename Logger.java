public class Logger {

	private static Logger variableLogger;

	private Logger() {}

	public static Logger getInstance() {
			
		if(variableLogger==null) {	
			variableLogger = new Logger();
		}
		return variableLogger;
	
	}
	
	public void log(String text) {
		System.out.println(text);	
	}
		

}
