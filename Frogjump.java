package BasicPrograms;


public class Frogjump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(solution(10,85,30));
	}
	public static int solution(int X, int Y, int D) {
	
        double temp=Math.ceil((double)(Y-X)/D);
        int steps= (int) temp;
return steps;
    }
}
