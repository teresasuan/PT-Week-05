package Week05CodingAssignment;

public class AsteriskLogger {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	String string;
	
	//Constructor
	public AsteriskLogger(String string) {
		this.string = string;
	}
	
	
	//Methods
	public void log() {
		System.out.println("***" + string + "***");
	}
	
	public void error() {
		System.out.println("******************" + "\n***" + "Error: " + string + "***" + "\n******************");
	}
	
	
	//Getters & Setters
	//public String getString() {
	//	return string;
	//}
	//public void setString(String string) {
	//	this.string = string;
	//}
	
	

}
