package proiectOOAD;

public class QuestionsMediumJava extends QuestionsVariantDecorator{
	    
	 public QuestionsMediumJava(QuestionsDecoratorInterface newQuestions) {
			super(newQuestions);
	 
		System.out.println(" create simple questions");
		System.out.println(" increase level of question to medium");
	 }	
		// Returns the result of calling getDescription() for
		// Questions and add /increase to " medium /part of question " to it
	
		public String getDescription() {
		
		return tempQuestions.getDescription()+" ,increased to medium ";
	}

  	public double getPoints() {
  		System.out.println("Extra points for medium increase: " + 1.50);
  		return tempQuestions.getPoints() + 1.50;
	}

}
