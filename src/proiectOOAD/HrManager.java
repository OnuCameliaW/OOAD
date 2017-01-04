package proiectOOAD;

//SINGLETON
public class HrManager {
	public int EmployeeId;
	public DepartamentCategory departament;
	
	private static HrManager hrManager=new HrManager();
	
	private HrManager() {}
	
	public static HrManager getInstance() {
		System.out.println("One HRManager");
		 if(hrManager == null) {
			 hrManager = new HrManager();
	      }
		return hrManager;			
	}	
}
