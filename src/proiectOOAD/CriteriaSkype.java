package proiectOOAD;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSkype implements Criteria {
	 @Override
	   public List<Interview> meetCriteria(List<Interview> interviews) {
	      List<Interview> skypeInterviews = new ArrayList<Interview>(); 
	      
	      for (Interview interview : interviews) {
	         if(interview.getLocation().equalsIgnoreCase("Skype")){
	        	 skypeInterviews.add(interview);
	         }
	      }  
	      return skypeInterviews;
	   }
}