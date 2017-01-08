package proiectOOAD;
import java.util.*;

import proiectOOAD.Factory;
public class Main {

	 public static void main(String[] args) {
		
		 //singleton
		HrManager hrManager= HrManager.getInstance(); 
		
		//prototype
		Factory.Iterate();
		
		  //Visitor
		   InfoVisitor InfoPoints = new InfoVisitor();		  
		  System.out.println("-------");
		  System.out.println("This is visitor pattern");
		  
		  IteratorRepository repository = new IteratorRepository();
		  //Iterate throughout the list of Candidates
		  	 List<Candidate> candidatesForIterator=new ArrayList<Candidate>();
			 Candidate c1 = new Candidate("Candidate1", "C1", 8.00);
			 Candidate c2 = new Candidate("Candidate2", "C2", 6.00);
			 Candidate c3 = new Candidate("Candidate3", "C3", 7.00);
			 candidatesForIterator.add(c1);
			 candidatesForIterator.add(c2);
			 candidatesForIterator.add(c3);
			 repository.entities=candidatesForIterator;
	      for(IteratorPatternInterface iter = repository.getIterator(); iter.hasNext();){
	         Candidate c = (Candidate)iter.next();
	         System.out.println(c.firstName+ " a acumulat "
	   		      + c.accept(InfoPoints) +" puncte");
	      } 	 
	      //Iterate throughout the list of Employees
		 List<Employees> employeesForIterator=new ArrayList<Employees>();
		 Employees e1 = new Employees("Employee1", "E1", 8.00);
		 Employees e2 = new Employees("Employee2", "E2", 6.00);
		 Employees e3 = new Employees("Employee3", "E3", 7.00);
		 employeesForIterator.add(e1);
		 employeesForIterator.add(e2);
		 employeesForIterator.add(e3);
		 repository.entities=employeesForIterator;
	      for(IteratorPatternInterface iter = repository.getIterator(); iter.hasNext();){
		         Employees e = (Employees)iter.next();
		         System.out.println();
		         System.out.println(e.firstName + " a acumulat " + e.accept(InfoPoints) + " lei - bonus la salariu ");
		      } 
		  
		  System.out.println();

		   // Builder ( create test)
		                // Get a TestBuilder of type OldTestBuilder
		  TestBuilder techTest = new OldTestBuilder();
		               // Pass the OldTestBuilder specification to the teacher
		  TestTeacherCreate testTeacher = new TestTeacherCreate(techTest);
		               // Tell the teacher to create a test using the specifications
		  				// of the OldTestBuilder class
		 testTeacher.createTest();
		// The teacher/technical teacher )) returns the right test based off of the specs
		   // sent to it on line 28
		   Test firstTest = techTest.getTest();
		   System.out.println("-------");
		   System.out.println("this is builder pattern");
		   System.out.println("Test Name: " + firstTest.getTestName());
		   System.out.println("Test Description: " + firstTest.getTestDescription());
		   System.out.println("Test Type: " + firstTest.getTestType());
		   System.out.println("Test ID: " + firstTest.getTestId());

		   System.out.println("-------");
		   System.out.println("Inceput Template Design Pattern");
		   System.out.println();
		   TemplateDemo t=new TemplateDemo();
     
		   System.out.println("-----------------------------");
		   System.out.println("Decorator Design Pattern");

	   // Decorator Pattern  ( increase the standard question to medium and adanced by add/ "decorate" questions) 
	       // The Questions object is sent to the QustionsMediumJava constructor
	        // and then to the QustionsAdvancedJava constructor
 QuestionsDecoratorInterface basicQuestion =  new QuestionsAdvancedJava(new QuestionsMediumJava(new Questions()));
               System.out.println("Question is incresed with: " + basicQuestion.getDescription());
               System.out.println("Points for question: " + basicQuestion.getPoints());

           System.out.println("-----------------------------");   
           
           System.out.println("Criteria Design Pattern");
           CriteriaDemo c=new CriteriaDemo();
		  
		
	}
	     
	 
	  
	   
	 
	   

	
}
