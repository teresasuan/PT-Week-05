package Week05CodingAssignment;
import week05.Card;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		logger.error("hola");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello");
		logger2.error("hola");
		
		//AsteriskLogger instance1 = new AsteriskLogger("Hello");
		//instance1.log();
		//instance1.error();

		//SpacedLogger instance2 = new SpacedLogger("Hello");
		//instance2.log();
		//instance2.error();
		
	}

}
