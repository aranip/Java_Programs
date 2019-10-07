package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
	obj.sum("Tom");
	}
	public static void main(int p){
		
	}
	//main method can be overloaded
	//method overloading--when the method name is same with different input parameters within the same class
	//u cannot create a method inside a method
	//duplicate methods ---same method name with same input parameters and same datatypes are not allowed
public void sum(){
System.out.println("Sum method --zero parameters");	
}
	
public void sum(int i){
	System.out.println("Sum method --one input parameters");
	System.out.println(i);
}
public void sum(int k, int j){
	System.out.println("Sum method --two input parameters");
	System.out.println(k+j);
}
public void sum(String s){
	System.out.println("Sum method --one input parameter");
	System.out.println(s);

}
}
