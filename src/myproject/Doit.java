package myproject;

import accessspecifiers.Privateex;

abstract class doitabstract{
	abstract void printit();
}
class Cat extends doitabstract {
    void printit() {
    	System.out.println("cat");
    	}	
}
class Dog extends doitabstract{
	void printit() {
		System.out.println("Dog");
	}
}
class Monkey extends doitabstract{
	void printit() {
		System.out.println("monkey");
	}
}
public class Doit extends Privateex{
public static void main(String[] args) {
       doitabstract obj=new Cat();
       obj.printit();
       doitabstract obj2=new Dog();
       obj2.printit();
       doitabstract obj3=new Monkey();
       obj3.printit();
       Doit obj4=new Doit();
       printit();
       obj4.performit();
       System.out.println(name1);
       System.out.println(name1);
       char[] va= {'a','b','1'};
       System.out.println(va);
       
	}
}
