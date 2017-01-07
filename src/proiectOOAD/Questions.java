package proiectOOAD;
//Implements the QuestionsDecoratorInterface with only the required
//methods from the interface

//Every Question it will start as a simple standard Question

public class Questions implements QuestionsDecoratorInterface{
	public int questionId;
	public String description;
	public String correctAnswer;
	public DificultyLevelCategory dificultyLevel;
	public TypeCategory QuestionType;
	public double points;

	
	public String getDescription() {
		
		return "Simple java questions";
	}
	
	public double getPoints() {
		 System.out.println("Points for simple java question: " + 1.00);

		return 1.00;
	}
}
