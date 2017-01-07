package proiectOOAD;

import java.util.List;
import java.util.*;

public class  IteratorRepository implements Container {
	public List<?> entities;
	
	
/*	public  IteratorRepository() {
		 Candidate c1 = new Candidate("Candidate1", "C1", 8.00);
		 Candidate c2 = new Candidate("Candidate2", "C2", 6.00);
		 Candidate c3 = new Candidate("Candidate3", "C3", 7.00);
		 candidates.add(c1);
		 candidates.add(c2);
		 candidates.add(c3);
		 
		 Employees e1 = new Employees("Employee1", "E1", 8.00);
		 Employees e2 = new Employees("Employee2", "E2", 6.00);
		 Employees e3 = new Employees("Employee3", "E3", 7.00);
		 employees.add(e1);
		 employees.add(e2);
		 employees.add(e3);
	}
	*/
	   @Override
	   public IteratorPatternInterface getIterator() {
	      return new NameIterator();
	   }	 
	   
	   private class NameIterator implements IteratorPatternInterface {

		      int index;

		      @Override
		      public boolean hasNext() {
		      
		         if(index < entities.size()){
		            return true;
		         }
		         return false;
		      }

		      @Override
		      public Object next() {
		      
		         if(this.hasNext()){
		            return entities.get(index++);
		         }
		         return null;
		      }		
		   }
}
