package proiectOOAD;

public class TemplateDemo {
	public TemplateDemo(){
		  CandidateTemplateInterface template = new Junior();
		  template.procesRecrutare();
		  
	      System.out.println();
	      
	      template = new Medium();
	      template.procesRecrutare();	
	      
	      System.out.println();
	      
	      template = new Senior();
	      template.procesRecrutare();	
	}
}
