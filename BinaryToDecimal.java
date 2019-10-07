package BasicPrograms;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		String s = "101";
		double sum = 0;
		
		
		for(int i=s.length()-1, j=0; i>=0;i--,j++){
			
			sum = sum + (Integer.parseInt(s.charAt(i)+"") * Math.pow(2, j));
		}
		System.out.println((int)sum);

	}

}