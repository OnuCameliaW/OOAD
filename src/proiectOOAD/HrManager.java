package proiectOOAD;

//SINGLETON
public class HrManager {
	public int EmployeeId;
	public DepartamentCategory departament;
	
	private static HrManager hrManager=new HrManager();
	
	private HrManager() {}
	
	public static HrManager getInstance() {
		System.out.println("Singleton in HrManager");
		System.out.println("One HRManager");
		 if(hrManager == null) {
			 hrManager = new HrManager();
	      }
		System.out.println("");
		return hrManager;			
	}	
}
