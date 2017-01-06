package proiectOOAD;

//The concrete builder class that assembles the parts 
//of the finished Test object


public class OldTestBuilder implements TestBuilder {
   
    private Test test;
    
    public OldTestBuilder() {
    	this.test = new Test();
    }
	 
	public void buildTestId() {
		
		test.setTestId(100);
	}

	
	public void buildTestName() {
		test.setTestName("Testul 1");
		
	}

	
	public void buildTestDescription() {
		
		test.setTestDescription("Test de cunoastere Java");
	}

	
	public void buildTestType() {
		test.setTestType(TypeCategory.Technical);
	}

	
	public Test getTest() {
		
		return this.test;
	}

}
