package proiectOOAD;

public class Medium extends CandidateTemplateInterface{
	 @Override
	   void discutieHR() {
	      System.out.println("Mediu a avut discutia HR");
	   }
	 @Override
	   void test() {
	      System.out.println("Mediu nu are un test");
	   }
	 @Override
	   void testPractic() {
	      System.out.println("Mediu va avea un test practic");
	   }
}
