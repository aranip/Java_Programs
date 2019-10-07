package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		//dynamic polymophism
		//child class object can be referred by parent interface refernce va
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		//only overriden methods can be called
	}

}
