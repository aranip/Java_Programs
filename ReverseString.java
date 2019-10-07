package BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Selenium";
		/*String rev = "";
		int length = s.length();
		for(int i = length -1 ; i>=0 ; i--){
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);

	} */

	//using string buffer class  its a mutable 
	
	StringBuffer sf = new StringBuffer(s);
	System.out.println(sf.reverse());
	}
}
