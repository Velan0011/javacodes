package javatest;
//2 marks
//
//1. A Student class contains name, age, and marks. These fields must not be directly accessed or modified from outside the class. Which OOP concept should be used? 
//State one reason.
//we must use data encapsulation by specifying name,age and marks and private..and have to define getter and setter functions  to access these fields from outside classes.
//
//2. A Car class reuses common properties and methods from a Vehicle class. Identify the OOP concept and write the basic Java inheritance syntax.
//
//inheritance is being used to use the methods and properties of the parent class.syntax to implement inheritance is,
//class Parent{
//int a=10;
//void printit(){
//System.out.println(a);}}
//class Child extends Parent{
//public static void main(String[] args){
//Child obj=new Child();
//obj.printit();}}
//
//3. A Calculator class has add(int, int), add(int, int, int), and add(double, double) methods. Identify the concept demonstrated.
//
// concept which is been implemented here is method overloading
//
//4. A parent class has a display() method, and a child class provides its own implementation of display(). What is this called?
//
// this is called method overriding
//
//5. A program must hide implementation details and expose only essential operations. Which OOP concept supports this? Name one Java feature used to achieve it.
//
//the oops concept which supports this is abstraction,java feature that helps to achieve this is abstract class
//
//3 marks
//
//6. Differentiate between method overloading and method overriding. Give one Java example for each.
//
//overloading refers to method with same name but with different parameters,overriding refers to a child class method which is same as parent class method that is 
//used to rewrite the parent class method to perform a particular task.
//overloading==>
//void add(int a,int b){return a+b;}
//void add(int a,int b,int c){return a+b+c;}
//overriding==>
//class a{
//void prinit(){System.out.println("parent");}}
//class b extends a{
//void printit(){System.out.println("child");}}
//
//7. What is the difference between an abstract class and an interface? Write any three points.
//
//with abstract class we implement heirarchical inheritance,with interface we implement multiple inheritace in java.abstract class supports constructor,interface doesnot.
//we can implement multiple interfaces to a class
//
//8. Explain the four main OOP principles: encapsulation, inheritance, polymorphism, and abstraction.
//
//encapsulation
//wrapping up of datas and methods inside a class is called encapsulation,By specifying values or methods as private we can encapsulate them within a class so other
//outside classes wont access them directly.
//inheritace
//through inheritace child class can use the properties and methods of the parent class it extends.
//polymorphism
//polymorphism means one face many tasks..for example add function in different classes can perform different tasks.
//abstraction
//hiding the process or details and showing the necessary outputs to the users is called abstraction
//
//9. Can a private method of a parent class be overridden by a child class? Explain your answer with a small code example or reason.
//
//private method of a parents class cannot be overridden by a child class,because private methods can be only accessed within their class
//class a{
//private void printit(){System.out.println("parent");}}class b extends a{void printit(){System.out.println("child");}} this will throw error
//





public class Theoryoct31 {

}
