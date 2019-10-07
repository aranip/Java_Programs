package OOPSConceptPart2;

public class HSBCBank implements USBank,BrazilBank{ //we are achieving multiple inheritance
	//is -a relationship

	//if a class is implementing any interface then its mandatory to define /override all the methods of Interface
	
	//USBank methods---overriding from usbank
	public void credit(){
		System.out.println("hsbc---credit");
	}
	
	public void debit(){
		System.out.println("hsbc---debit");

	}
	public void transferMoney(){
		System.out.println("hsbc---transferMoney");

	}
	
	//separate methods of  HSBCBank class
	public void educationLoan(){
	System.out.println("hsbc---eduLoan");
	}
	public void carLoan(){
	System.out.println("hsbc---carloan");
	}
	
	//BrazilBank methods:overriding from brazilbank
	public void mutualFund(){
		System.out.println("hsbc ---mutualfund");
	}
}
