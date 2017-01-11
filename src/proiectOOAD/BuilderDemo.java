package proiectOOAD;

public class BuilderDemo {
	public BuilderDemo(){
        // Get a TestBuilder of type OldTestBuilder
	  TestBuilder techTest = new OldTestBuilder();
	               // Pass the OldTestBuilder specification to the teacher
	  TestTeacherCreate testTeacher = new TestTeacherCreate(techTest);
	               // Tell the teacher to create a test using the specifications
	  				// of the OldTestBuilder class
	 testTeacher.createTest();
	// The teacher/technical teacher )) returns the right test based off of the specs
	   // sent to it on line 28
	   Test firstTest = techTest.getTest();
	   System.out.println("This is builder pattern");
	   System.out.println("Test Name: " + firstTest.getTestName());
	   System.out.println("Test Description: " + firstTest.getTestDescription());
	   System.out.println("Test Type: " + firstTest.getTestType());
	   System.out.println("Test ID: " + firstTest.getTestId());
	   System.out.println();


	}
}
