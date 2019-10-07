package OOPConceptPart1;

public class FunctionsInJava {

	//main method is ----starting point of execution
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int l = obj.prq();
		System.out.println(l);
		String a = obj.qa();
		System.out.println(a);
		int d = obj.division(20, 10);
		System.out.println(d);
		
		//main method is void it never returns a value
	}
	//non static methods
	//1. no i/p no o/p
	//2. no i/p some o/p
	//3. some i/p some o/p
	
	//void ---doesnot return any value
	public void test(){   //test()---is a method name
		System.out.println("test method");
	}
	//return type is int
	public int prq(){
		System.out.println("PQR method");
		int a =10;
		int b =20;
		int c = a+b;
		return c;
	}
	
	public String qa(){
		System.out.println("qa method");
	String s = "Selenium";
	return s;
	}
//x ,y --- input parameters or arguments
	public int division(int x, int y){
		System.out.println("division method");
		int d =x /y;
		return d;
	
	}
}
