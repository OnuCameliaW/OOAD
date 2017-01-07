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
    System.out.println("Employee Info: Points "); 
    System.out.println(EmployeeInfo.getPoints()); 
    return EmployeeInfo.getPoints() * 0.1; //bani in plus pentru angajat
	}

	
	
}
