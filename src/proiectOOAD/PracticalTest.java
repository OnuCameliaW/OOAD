package proiectOOAD;

import java.util.List;

import proiectOOAD.FactoryPrototype.Clone;

public class PracticalTest extends FactoryPrototype implements Clone {
	public List<PracticalWork> practicalWork;
	FactoryPrototype basePrototype=null;
	  protected PracticalTest () {		
	    }
	  protected PracticalTest (FactoryPrototype prototypeTest) {
		  basePrototype=prototypeTest;
	    }	  	    
	public Clone cloan(){ 
		return new PracticalTest(basePrototype);
	}      
	 public String toString() {
	      return "PracticalTest";
	    }
}
