package proiectOOAD;
import proiectOOAD.Factory;
public class Main {

	 public static void main(String[] args) {
		//singleton
		HrManager hrManager= HrManager.getInstance(); 
		//prototype
		Factory.Iterate();
		
		  //Visitor
		   InfoVisitor InfoPoints = new InfoVisitor();
		   Candidate Vasile = new Candidate("Vasile", "Vasilescu", 8.00);
		   Employees George = new Employees("George", "Georgescu",10.00);
		  System.out.println(Vasile.firstName+ " a acumulat "
		      + Vasile.accept(InfoPoints) +" puncte");
		  
		  System.out.println(George.firstName +" a acumulat " +
				  	George.accept(InfoPoints) +" lei - bonus la salar ");
		
	}
	     
	 
	  
	   
	 
	   

	
}
