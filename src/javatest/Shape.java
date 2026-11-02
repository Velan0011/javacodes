//13. Shape Abstraction: Create an abstract class Shape with an abstract method calculateArea(). 
//Create Circle and Rectangle classes that extend Shape and implement calculateArea().
//Create objects and display both areas.
//Use suitable constructors and fields.



package javatest;

public abstract class Shape {

    abstract double calculatearea(int l,int b);
    abstract double calculate(int a);
   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj=new Circle();
		Shape obj2=new Rectangle();
		System.out.println(obj.calculate(10));
		System.out.println(obj2.calculatearea(10,20));

	}
}
 class Circle extends Shape{
	

//	@Override
	double calculate(int r) {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}
	double calculatearea(int l,int b) {
	return 0;
	}
}
class Rectangle extends Shape{
	double calculatearea(int l,int b) {
		// TODO Auto-generated method stub
		return l*b;
	}
	double calculate(int r) {
	return 0;
	}

}
