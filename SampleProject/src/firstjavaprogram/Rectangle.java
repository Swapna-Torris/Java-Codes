package firstjavaprogram;

class Rectangle implements Shape{

public void area(){
System.out.println("area of rec");
}

public void perimeter(){

System.out.println("perimeter of rec");
}

public static void main(String...arg){

	System.out.println("class implementing the shape");

Rectangle  rt = new Rectangle ();
rt.area();
rt.perimeter();
Shape.displayDetails();
rt.readDetails();
}


}