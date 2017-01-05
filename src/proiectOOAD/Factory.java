package proiectOOAD;

import java.lang.reflect.Field;
import java.util.*;

import proiectOOAD.FactoryPrototype.Clone;

class Factory  {
    private static java.util.Map prototypes = new java.util.HashMap();

    public static Clone makeObject( String s) {
      return ((Clone)prototypes.get(s)).cloan();
    }
    public static void Iterate(){ 
    	FactoryPrototype basePrototype=new FactoryPrototype();
    	System.out.println("The prototypes for the tests in Factory");
    	 prototypes.put( "technical",   new TechnicalTest() );
         prototypes.put( "personality", new PersonalityTest() );         
         prototypes.put( "practical", new PracticalTest(basePrototype) );  

    	 Iterator it = prototypes.entrySet().iterator();
    	    while (it.hasNext()) {
    	        Map.Entry pair = (Map.Entry)it.next();   	     
    	        System.out.println( Factory.makeObject( pair.getKey().toString() ));
    	        it.remove(); // avoids a ConcurrentModificationException
    	    }
            System.out.println("");     
 
    
    }
    
  }