package proiectOOAD;

import java.util.*;

import proiectOOAD.FactoryPrototype.Clone;

class Factory  {
    private static java.util.Map prototypes = new java.util.HashMap();

    public static Clone makeObject( String s) {
      return ((Clone)prototypes.get(s)).cloan();
    }
    public static void Iterate(){ 
    	 prototypes.put( "technical",   new TechnicalTest() );
         prototypes.put( "practical",  new PracticalTest() );
         prototypes.put( "personality", new PersonalityTest() );
         
    	 Iterator it = prototypes.entrySet().iterator();
    	    while (it.hasNext()) {
    	        Map.Entry pair = (Map.Entry)it.next();   	     
    	       // System.out.println(pair.getKey() + " = " + pair.getValue());
    	        System.out.println( Factory.makeObject( pair.getKey().toString() ));
    	        it.remove(); // avoids a ConcurrentModificationException
    	    }
    	    
    
    }
    
  }