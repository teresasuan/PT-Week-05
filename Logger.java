package Week05CodingAssignment;

//This is an interface (a class can inherit multiple interfaces), it does not define any method implementations, 
//it only defines the method signatures.  Use when you know WHAT you want to happen, but the class that implements
//the interface will define HOW it's going to happen.  Think of the word "contract", an interface HAS TO create 
//a concrete implementation of each of the methods defined in the interface.

public interface Logger {

	public void log(String string);
	
	public void error(String string);
	
}
