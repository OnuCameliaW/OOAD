package proiectOOAD;
import proiectOOAD.Factory;
public class Main {

	 public static void main(String[] args) {
		
		 //singleton
		HrManager hrManager= HrManager.getInstance(); 
		
		//prototype
		Factory.Iterate();
		
		  //Visitor
		  		   InfoVisitor InfoPoints = new InfoVisitor();
		   Candidate Vasile = new Candidate("Vasile", "Vasilescu", 8.00);
		   Employees George = new Employees("George", "Georgescu",10.00);
		  System.out.println("-------");
		  System.out.println("This is visitor pattern");
		  System.out.println(Vasile.firstName+ " a acumulat "
		      + Vasile.accept(InfoPoints) +" puncte");
		  
		  System.out.println(George.firstName +" a acumulat " +
				  	George.accept(InfoPoints) +" lei - bonus la salar ");
		  System.out.println();
		  
		  
		   // Builder ( create test)
		                // Get a TestBuilder of type OldTestBuilder
		  TestBuilder techTest = new OldTestBuilder();
		               // Pass the OldRobotBuilder specification to the engineer
		  TestTeacherCreate testTeacher = new TestTeacherCreate(techTest);
		               // Tell the teacher to create a test using the specifications
		  				// of the OldTestBuilder class
		 testTeacher.createTest();
		// The teacher/technical teacher )) returns the right test based off of the specs
		   // sent to it on line 28
		   Test firstTest = techTest.getTest();
		   System.out.println("-------");
		   System.out.println("this is builder pattern");
		   System.out.println("Test Name: " + firstTest.getTestName());
		   System.out.println("Test Description: " + firstTest.getTestDescription());
		   System.out.println("Test Type: " + firstTest.getTestType());
		   System.out.println("Test ID: " + firstTest.getTestId());


 


		  
		
	}
	     
	 
	  
	   
	 
	   

	
}
