package tom;

public class EncapsulationDemo {
	//String name="araa"; //global access
 private String name;

public String getName() {   //getter method
	System.out.println("getter someone change your name");
	return name;
}
public void setName(String name) {
	System.out.println("setter method change your name");
	this.name=name;
	
}
}
