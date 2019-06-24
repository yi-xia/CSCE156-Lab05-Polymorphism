package unl.cse;

import unl.cse.entities.Droid;
import unl.cse.entities.Graduate;
import unl.cse.entities.Undergraduate;

public class CourseDemo {

	public static void main(String args[]) {
		
		Undergraduate luke = new Undergraduate("1234", "Skywalker", "Luke");
		Undergraduate wedge = new Undergraduate("5678", "Antilles", "Wedge");
		
		Graduate ben = new Graduate("4411", "Kenobi", "Ben");
		Graduate mace = new Graduate("0021", "Windu", "Mace");
		
		Droid c3po = new Droid("C3PO", "Protocol");
		Droid r2d2 = new Droid("R2D2", "Astromech");
		

		Course c = new Course("CSCE", "156");		
		//TODO: add sections to this course as you create them
		
		System.out.println(c);
		
	}
}
