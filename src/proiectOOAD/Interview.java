package proiectOOAD;

import java.sql.Date;
import java.util.*;

public class Interview {
	public int interviewId;
	public String dateStart;
	public String dateFinish;
	public String comments;
	public LocationCategory location;
	public DificultyLevelCategory dificultyLevel;
	public TypeCategory interviewType;
	
	 public Interview(int id, String dateStart, String dateFinish,
			String comm, LocationCategory l,
			DificultyLevelCategory d, TypeCategory t) {
		 	this.interviewId=id;
			this.dateStart=dateStart;
			this.dateFinish=dateFinish;
			this.comments=comm;
			this.location=l;
			this.dificultyLevel=d;
			this.interviewType=t;
	}
	public String getLocation() {
	      return this.location.toString();
	   }
}
