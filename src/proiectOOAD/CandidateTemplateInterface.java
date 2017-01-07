package proiectOOAD;

public abstract class CandidateTemplateInterface {
	abstract void discutieHR();
	abstract void test();
	abstract void testPractic();
	
	   //template method
	   public final void procesRecrutare(){
	   discutieHR();	
	   test();
	   testPractic();
	   }
}
