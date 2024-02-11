package Week05CodingAssignment;

public class SpacedLogger {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	String string;
	
	//Constructor
	public SpacedLogger(String string) {
		this.string = string;
	}
	
	//Methods
	public void log () {
		StringBuilder result = new StringBuilder();
		for (int i=0; i<string.length(); i++) {
		if (i>0) {
			result.append(" ");
		}
		result.append(string.charAt(i));
	}
		System.out.println(result.toString());
	}
	
	public void error () {
		
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
