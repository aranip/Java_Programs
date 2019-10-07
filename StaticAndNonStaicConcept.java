package OOPConceptPart1;

public class StaticAndNonStaicConcept {

	//global var:--the scope of global variables will be available across all the functions with some condition. 
	
	String name ="Tom"; //non static global var
	static int age =25; //static global var
	
	
	public static void main(String[] args) {
		//how to call static methods and vars
		//1.direct calling
sum();
//2.calling by classname
StaticAndNonStaicConcept.sum();
System.out.println(age);
System.out.println(StaticAndNonStaicConcept.age);

//how to call non-static methods
StaticAndNonStaicConcept obj = new StaticAndNonStaicConcept();
obj.sendMail();
System.out.println(obj.name);

//can i access static methods by using object reference? ---yes but not a good practice
//obj.sum(); //warning will be given 
	}

	public void sendMail(){
		System.out.println("Send mail method");

	}
	public static void sum(){
		System.out.println("Sum method");
	
	}
}
