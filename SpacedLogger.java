package Week05CodingAssignment;

public class SpacedLogger implements Logger{

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	//String string;
	
	//Constructor
	//public SpacedLogger(String string) {
	//	this.string = string;
	//}
	
	//Methods
	@Override
	public void log (String string) {
		StringBuilder result = new StringBuilder();
		for (int i=0; i<string.length(); i++) {
		if (i>0) {
			result.append(" ");
		}
		result.append(string.charAt(i));
	}
		System.out.println(result.toString());
	}
	
	@Override
	public void error (String string) {
		
		StringBuilder result = new StringBuilder();
		for (int i=0; i<string.length(); i++) {
		if (i>0) {
			result.append(" ");
		}
		result.append(string.charAt(i));
	}
		System.out.println("Error: " + result.toString());
	}
	}
