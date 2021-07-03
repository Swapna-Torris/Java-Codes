package interfaceexample;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "THis is a string in java";
		String str =  "this is a new string in java";
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		s += str;
		System.out.println("After chaning the content");
		System.out.println(s.hashCode());
		
		System.out.println("=========================================================");
		StringBuffer s1 = new StringBuffer("THis is a string in java");
		StringBuffer str1 =  new StringBuffer("this is a new string in java");
		System.out.println(s1.hashCode());
		System.out.println(str1.hashCode());
		s1.append(str1);
		System.out.println("After chaning the content");
		System.out.println(s1.hashCode());
		
		System.out.println("=========================================================");
		StringBuilder s11 = new StringBuilder("THis is a string in java");
		StringBuilder str11 =  new StringBuilder("this is a new string in java");
		System.out.println(s11.hashCode());
		System.out.println(str11.hashCode());
		s11.append(str11);
		System.out.println("After chaning the content");
		System.out.println(s11.hashCode());
		StringBuilder sbnew = new StringBuilder(s);
		sbnew.append("this is string builder");
		s = sbnew.toString();
		System.out.println(s + "\t" + s.hashCode());
		
	}

}
