package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //static polymorphism---compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		System.out.println("**********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.theftsafety();----not allowed
		
		System.out.println("**********");
      //top casting
		Car c1 = new BMW();  //child class object can be referred by parent class reference variable is called dynamic polymorhism or runtime polymorphism
	c1.start();
	c1.stop();
	c1.refuel();
	
	//down casting
	BMW b1 = (BMW)new Car();  //class cast exception
	}

}
