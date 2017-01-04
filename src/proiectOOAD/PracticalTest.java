package proiectOOAD;

import proiectOOAD.FactoryPrototype.Clone;

public class PracticalTest implements Clone{
	public Clone cloan(){ 
		return new PracticalTest();
	}
	 public String toString() {
	      return "PracticalTest";
	    }
}
