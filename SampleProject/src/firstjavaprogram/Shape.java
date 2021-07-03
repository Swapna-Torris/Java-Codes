package firstjavaprogram;

public interface Shape {
	
	public void area();
	public void perimeter();
	
	//from java 8
	default void readDetails() {
		System.out.println("reading details");
	}

	static void displayDetails() {
		System.out.println("display details");
	}
	

	
}
