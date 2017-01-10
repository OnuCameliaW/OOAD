package proiectOOAD;

public class DecoratorDemo {
	//( increase the standard question to medium and adanced by add/ "decorate" questions) 
    // The Questions object is sent to the QustionsMediumJava constructor
    // and then to the QustionsAdvancedJava constructor
	public DecoratorDemo(){
		QuestionsDecoratorInterface basicQuestion =  new QuestionsAdvancedJava(new QuestionsMediumJava(new Questions()));
        System.out.println("Question is incresed with: " + basicQuestion.getDescription());
        System.out.println("Points for question: " + basicQuestion.getPoints());

	}
}
