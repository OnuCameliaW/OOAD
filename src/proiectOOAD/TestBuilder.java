package proiectOOAD;

//Defines the methods needed for creating parts
//for the test


public interface TestBuilder {
	
	public void buildTestId();
	public void buildTestName();
	public void buildTestDescription();
	public void buildTestType();
	public Test getTest();

}
