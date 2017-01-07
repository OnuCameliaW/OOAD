package proiectOOAD;

public class QuestionsAdvancedJava extends QuestionsVariantDecorator{

	public QuestionsAdvancedJava(QuestionsDecoratorInterface newQuestions) {
		super(newQuestions);
		System.out.println("increase level of question to advanced");
	}
	
	// Returns the result of calling getDescription() for
	// Questions, QuestionsMediumJava and then QuestionsAdvancedJava

public String getDescription() {
		
		return tempQuestions.getDescription()+" ,increased to advanced ";
	}

  	public double getPoints() {
  		System.out.println("Extra points for advanced increase: " + 3.00);
  		return tempQuestions.getPoints() + 3.00;
	}
	

	

        
	}


