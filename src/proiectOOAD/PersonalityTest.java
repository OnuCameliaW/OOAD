package proiectOOAD;

import proiectOOAD.FactoryPrototype.Clone;

public class PersonalityTest implements Clone  {
	public Clone cloan(){ 
		return new PersonalityTest();
	}
	 public String toString() {
	      return "PersonalityTest";
	    }
}
