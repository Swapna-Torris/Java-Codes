package firstjavaprogram;

public class AnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A() {
			
			@Override
			void show(int a) {
				// TODO Auto-generated method stub
				System.out.println("show method of abs class using anonymous class");
			}
		};
		
		B b = new B() {
			
			@Override
			public void printvalue() {
				// TODO Auto-generated method stub
				System.out.println("show method of interface using anonymous class");
			}
		};

	}

}
