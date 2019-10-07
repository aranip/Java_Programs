package OOPConceptPart1;

public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x =10;
		int y =20;
		int z = obj.testSum(x, y); //call by value OR pass by value
	System.out.println(z);
	obj.p =50;
	obj.q = 60;
	  
	obj.swap(obj);
	//after swap
	System.out.println(obj.p);
	System.out.println(obj.q);

	}

	public int testSum(int a, int b){
		a=30;
		b=40;
		int c = a+b;
		return c;
		
	}
//call by reference ---done in java by using object ref
	public void swap(CallByValueAndCallByReference t){
		int temp;
		temp =t.p; //temp = 50
		t.p= t.q;  //t.p =60
		t.q= temp; //t.q =50
	}
}
