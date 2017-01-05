package proiectOOAD;

 public interface Visitor {
	// Created to automatically use the right
    // code based on the Object sent
    // Method Overloading
     public double visit(Candidate CandidateInfo);
     public double visit(Employees EmployeeInfo);
   
}
