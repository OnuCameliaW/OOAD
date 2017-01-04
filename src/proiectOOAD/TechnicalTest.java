package proiectOOAD;

import proiectOOAD.FactoryPrototype.Clone;

public class TechnicalTest implements Clone {
	public Clone cloan(){ 
		return new TechnicalTest();
	}
	
	 public String toString() {
	      return "TechnicalTest";
	    }
}

