package proiectOOAD;
// Has a "Has a" relationship with Question. This is an
//Aggregation Relationship

abstract class QuestionsVariantDecorator implements QuestionsDecoratorInterface{
    
	protected QuestionsDecoratorInterface tempQuestions;

	// Assigns the type instance to this attribute
	// of a QuestionsDecoratorInterface
	
	// All decorators can dynamically customize the QuestionsDecoratorInterface
	// instance Questions because of this
    
	public QuestionsVariantDecorator(QuestionsDecoratorInterface newQuestions) {
		    tempQuestions = newQuestions;
	}
	
    
	public String getDescription() {
		
		return tempQuestions.getDescription();
	}

  	public double getPoints() {
	
		return tempQuestions.getPoints();
	}

}
