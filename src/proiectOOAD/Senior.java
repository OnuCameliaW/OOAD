package proiectOOAD;

public class Senior extends CandidateTemplateInterface{
	 @Override
	   void discutieHR() {
	      System.out.println("Senior a avut discutia HR");
	   }
	 @Override
	   void test() {
	      System.out.println("Senior nu are un test");
	   }
	 @Override
	   void testPractic() {
	      System.out.println("Senior nu are un test practic");
	   }
}
