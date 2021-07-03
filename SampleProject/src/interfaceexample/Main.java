package interfaceexample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One tw  = new Two();
		System.out.println(tw instanceof  Two);
		System.out.println(tw instanceof  One);
		tw.display();
		tw.display1();
		
		StaticDemo sd = new StaticDemo();
	}

}
