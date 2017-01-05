package proiectOOAD;

import java.sql.Date;

public class Employees extends Person implements Visitable{
	public Date hiringDate;
	public DepartamentCategory departament;
	private double points;
	
	public double getPoints() {
        return points;
	    }
	
	public double accept(Visitor visitor) {
	      return visitor.visit(this);
	    }

	public Employees(String firstName, String lastName, double points) {
		super(firstName, lastName);
		this.points = points;
	}

	
	
	
	

	
   
	
	
}
