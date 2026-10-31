package inheritance;

public class Sourceclass implements Interface1,Interface2 {
	public void doit() {
		   System.out.println("did it");
	   }
   public void printit() {
	   System.out.println("printed");
   }
   public static void main(String[] args) {
	   Sourceclass obj=new Sourceclass();
	   obj.doit();
	   obj.printit();
//	   obj.doit();
   }
}
