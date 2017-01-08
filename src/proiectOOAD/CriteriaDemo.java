package proiectOOAD;
import java.util.*;
import java.sql.Date;

public class CriteriaDemo {
	public CriteriaDemo(){
		List<Interview> interviews  = new ArrayList<Interview>();
		interviews.add(new Interview(1,"15/10/2014", "17/10/2014","Telephone Interview",LocationCategory.Telephone,DificultyLevelCategory.Intern,TypeCategory.Technical));
		interviews.add(new Interview(2,"15/10/2014", "17/10/2014","Telephone Interview",LocationCategory.Telephone,DificultyLevelCategory.Junior,TypeCategory.Personality));
		interviews.add(new Interview(3,"15/10/2014", "17/10/2014","Skype Interview",LocationCategory.Skype,DificultyLevelCategory.Junior,TypeCategory.Personality));
		interviews.add(new Interview(4,"15/10/2014", "17/10/2014","Office Interview",LocationCategory.Office,DificultyLevelCategory.Junior,TypeCategory.Personality));
		
		Criteria telephone = new CriteriaTelephone();
		System.out.println("Telephone Interviews: ");
	      printPersons(telephone.meetCriteria(interviews));

	    Criteria skype = new CriteriaSkype();
			System.out.println("Skype Interviews: ");
		      printPersons(skype.meetCriteria(interviews));
		     
		  Criteria office = new CriteriaOffice();
			System.out.println("Office Interviews: ");
		  printPersons(office.meetCriteria(interviews));
	}
	  public static void printPersons(List<Interview> interviews){
		   
	      for (Interview interview : interviews) {
	         System.out.println("Interview : [ Id : " + interview.interviewId + ", "
	         		+ "Date Start : " + interview.dateStart 
	         		+ ", Date Finish : " + interview.dateFinish
	         		+ ", Location Category : " + interview.location
	         		+ " ]");
	      }
	   }      
}
