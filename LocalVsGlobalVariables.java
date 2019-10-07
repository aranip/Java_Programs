package OOPConceptPart1;

public class LocalVsGlobalVariables {
// Global variables or class variables
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i =  10;  //local variable for main method
System.out.println(i);
LocalVsGlobalVariables obj = new LocalVsGlobalVariables ();
System.out.println(obj.name);
System.out.println(obj.age);
int k = obj.sum();
System.out.println(k);
	}

	public int sum(){
		int i =10;  //local var for sum method
		int j = 20;
		int age = 35;
		return age;
	}
	
}
