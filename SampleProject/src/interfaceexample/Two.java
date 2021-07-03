package interfaceexample;

public final class Two extends One implements C{
	Two(){
		System.out.println("Two class constructor");
	}
	
	public final int a = 30;
	
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		One o = new One();
		System.out.println("this is method one");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		
	}

	public static void display() {
		System.out.println("this is static display method in two class");
	}
	public final void display1() {
		this.methodOne();
		System.out.println("this is display method in two class");
	}
}
