package proiectOOAD;
import java.util.*;

public class CriteriaTelephone implements Criteria {
	 @Override
	   public List<Interview> meetCriteria(List<Interview> interviews) {
	      List<Interview> telephoneInterviews = new ArrayList<Interview>(); 
	      
	      for (Interview interview : interviews) {
	         if(interview.getLocation().equalsIgnoreCase("Telephone")){
	        	 telephoneInterviews.add(interview);
	         }
	      }
	      return telephoneInterviews;
	   }
}