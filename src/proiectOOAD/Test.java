package proiectOOAD;


//The concrete Test class based on the testPlan interface

public class Test implements TestPlan,FlyWeightInterface{
	private int testId;
	private String testName;
	private String testDescription;
	private TypeCategory testType;
	
	public Test(TypeCategory t){
	      this.testType = t;		
	   }
	public Test(){}
	public void setTestId(int id) {	
		testId = id;	}
    public int getTestId(){ return testId; }
	
	
	public void setTestName(String name) {
		testName = name;	}
	public String getTestName(){ return testName; }
	
	
	public void setTestDescription(String description) {
		 testDescription = description;   }
	public String getTestDescription(){ return testDescription; }
	
	
	public void setTestType(TypeCategory type) {
		 testType = type;	}
	public TypeCategory getTestType(){ return testType; }
	
	@Override
	   public void makeTest() {
	      System.out.println("Test: [Category : " + testType + ", Test Name : testName"   + ", Test Description :" + testDescription);
	   }
	
}
