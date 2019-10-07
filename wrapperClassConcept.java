package OOPConceptPart1;

public class wrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x ="100";
		System.out.println(x+20);
		
		//data conversion from string to integer
		int i = Integer.parseInt(x);
		System.out.println(i+20);
 //integer,Double, Character, Boolean
		//string to double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+20);
 //string to boolean
		String k = "true";
	boolean  b = Boolean.parseBoolean(k);
	System.out.println(k);

	//int to string conversion
	int j = 200;
	System.out.println(j+20);
String s = String.valueOf(j);
System.out.println(s+20);

String u = "100A";
Integer.parseInt(u);  //NumberFormatException---for input string

	}

}
