package proiectOOAD;


//The teacher/engineer class creates a Test using the
//builder interface that is defined (OldTestBuilder)


public class TestTeacherCreate {
       
	   private TestBuilder testBuilder;
	   
	// OldTestBuilder specification is sent to the teacher
	   
	   public TestTeacherCreate(TestBuilder testBuilder){
		           this.testBuilder = testBuilder;
		       }
	
	   // Return the Test made from the OldTestBuilder specs
	   
	   public Test getTest(){
		   return this.testBuilder.getTest();
	   }
	   
	   // Execute the methods specific to the TestBuilder
	  // that implements TestBuilder (OldTestBuilder)
	   
	   
	   public void createTest() {
		
		           this.testBuilder.buildTestId();
		           this.testBuilder.buildTestName();
 	               this.testBuilder.buildTestDescription();		  
		           this.testBuilder.buildTestType();
		       }




}
