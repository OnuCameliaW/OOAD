package proiectOOAD;
import java.util.*;

import proiectOOAD.Factory;
public class Main {

	 public static void main(String[] args) {
		
		//Singleton
		SingletonDemo s=new SingletonDemo();
			
		//Prototype
		PrototypeDemo p=new PrototypeDemo();
		
		//Visitor
		VisitorAndIteratorDemo vi=new VisitorAndIteratorDemo();
		
		//Builder ( create test)
		BuilderDemo b=new BuilderDemo();
				
		//Decorator Pattern  
		DecoratorDemo d=new DecoratorDemo();
		 
		//Criteria Design Pattern            
		System.out.println("Criteria Design Pattern");
		CriteriaDemo c=new CriteriaDemo();
		  
		//FlyWeight Design Pattern 
		System.out.println("FlyWeight Design Pattern");
		FlyWeightDemo f=new FlyWeightDemo();
		
		//Template 
		TemplateDemo t=new TemplateDemo();
	}
	     
	 
	  
	   
	 
	   

	
}
