package proiectOOAD;
import proiectOOAD.Factory;
public class Main {

	 public static void main(String[] args) {
		//singleton
		HrManager hrManager= HrManager.getInstance();
		
		//prototype
		Factory.Iterate();
	}
	

	
}
