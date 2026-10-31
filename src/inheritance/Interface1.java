package inheritance;

public interface Interface1{
	 public void doit();
	 private static int getdata() {
		 return 20;
	 }
	 public static void main(String[] args) {
//		 Interface1 obj=new Interface1() {
//			 public void doit() {
//				 System.out.println("hello");
//			 }
//		 };
		 Interface1.getdata();
	 }
}
