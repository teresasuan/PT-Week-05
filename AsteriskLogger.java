package Week05CodingAssignment;

public class AsteriskLogger implements Logger{

	//Methods
	@Override
	public void log(String string) {
		System.out.println("***" + string + "***");
	}
	
	@Override
	public void error(String string) {
		System.out.println("******************" + "\n***" + "Error: " + string + "***" + "\n******************");
	}
	

	//String string;
	
	//Constructor
	//public AsteriskLogger(String string) {
	//	this.string = string;
	//}
	
	
	
	//Getters & Setters
	//public String getString() {
	//	return string;
	//}
	//public void setString(String string) {
	//	this.string = string;
	//}
	
	
	}
//}
