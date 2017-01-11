package proiectOOAD;

import java.util.ArrayList;
import java.util.List;

public class VisitorAndIteratorDemo {
	public VisitorAndIteratorDemo(){
		 InfoVisitor InfoPoints = new InfoVisitor();		  
		  
		  IteratorRepository repository = new IteratorRepository();
		  //Iterate throughout the list of Candidates
		  System.out.println();
		  System.out.println("---> Here we visit every Candidate in Candidate List");
		  System.out.println();
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
	      System.out.println();
	      System.out.println("---> Here we visit every Employee in Employee List");
		  System.out.println();
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
		  
	}
}
