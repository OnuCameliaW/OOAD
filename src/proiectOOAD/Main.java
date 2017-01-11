package proiectOOAD;
import java.util.*;

import proiectOOAD.Factory;
public class Main {

	 public static void main(String[] args) {
		
		//Singleton
		System.out.println("Here is Singleton Pattern");
		SingletonDemo s=new SingletonDemo();
		System.out.println();
		System.out.println("---------------------------");
			
		//Prototype
		System.out.println("Here is Prototype Pattern");
		PrototypeDemo p=new PrototypeDemo();
		System.out.println();
		System.out.println("---------------------------");

		
		//Visitor
		System.out.println("Here is Visitor Pattern");
		VisitorAndIteratorDemo vi=new VisitorAndIteratorDemo();
		System.out.println();
		System.out.println("---------------------------");

		
		//Builder ( create test)
		System.out.println("Here is Builder Pattern");
		BuilderDemo b=new BuilderDemo();
		System.out.println();
		System.out.println("---------------------------");

				
		//Decorator Pattern 
		System.out.println("Here is Decorator Pattern");
		DecoratorDemo d=new DecoratorDemo();
		System.out.println();
		System.out.println("---------------------------");

		 
		//Criteria Design Pattern
		System.out.println("Here is Criteria Pattern");
		CriteriaDemo c=new CriteriaDemo();
		System.out.println();
		System.out.println("---------------------------");

		  
		//FlyWeight Design Pattern
		System.out.println("Here is Flyweight Pattern");
		FlyWeightDemo f=new FlyWeightDemo();
		System.out.println();
		System.out.println("---------------------------");

		
		//Template 
		System.out.println("Here is Template Pattern");
		TemplateDemo t=new TemplateDemo();
		System.out.println();
		System.out.println("---------------------------");

	}
	     
	 
	  
	   
	 
	   

	
}
