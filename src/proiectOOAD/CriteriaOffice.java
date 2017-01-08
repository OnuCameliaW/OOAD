package proiectOOAD;

import java.util.ArrayList;
import java.util.List;

public class CriteriaOffice implements Criteria {
	 @Override
	   public List<Interview> meetCriteria(List<Interview> interviews) {
	      List<Interview> officeInterviews = new ArrayList<Interview>(); 
	      
	      for (Interview interview : interviews) {
	         if(interview.getLocation().equalsIgnoreCase("Office")){
	        	 officeInterviews.add(interview);
	         }
	      }  
	      return officeInterviews;
	   }
}