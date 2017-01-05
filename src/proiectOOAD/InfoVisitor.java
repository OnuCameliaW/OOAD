package proiectOOAD;
import java.text.DecimalFormat;



public class InfoVisitor implements Visitor {
	DecimalFormat df = new DecimalFormat("#.##");
	// Concrete Visitor Class

	public InfoVisitor() {	}

	// Show info when candidate
	public double visit(Candidate CandidateInfo) {
		System.out.println("Candidate Info: Points ");
		System.out.println();                             //"punctele acumulate de candidate"
       return Double.parseDouble(df.format((CandidateInfo.getPoints())));
	}

	// Show info when employee
	public double visit(Employees EmployeeInfo) {
    System.out.println("Candidate Info: Points ");          //bani in plus pentru angajat
	 return Double.parseDouble(df.format((EmployeeInfo.getPoints() * 0.1)));
	}

	
	
}
