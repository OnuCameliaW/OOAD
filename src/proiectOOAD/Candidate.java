package proiectOOAD;
import java.sql.Date;

public  class Candidate extends Person implements Visitable{
	public Integer numberOfResume;
	public Date dayApplyRecruit;
	private double points;

	public double getPoints() {
        return points;
	    }

	public double accept(Visitor visitor) {
	      return visitor.visit(this);
	  }
	
	public Candidate(String firstName, String lastName, double points) {
		super(firstName, lastName);
		this.points = points;
	}
}
