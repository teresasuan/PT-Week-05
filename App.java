package Week05CodingAssignment;
import week05.Card;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger instance1 = new AsteriskLogger("Hello");
		instance1.log();
		instance1.error();

		SpacedLogger instance2 = new SpacedLogger("Hello");
		instance2.log();
		instance2.error();
		
	}

}
