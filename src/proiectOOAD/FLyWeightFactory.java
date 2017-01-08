package proiectOOAD;

import java.util.*;

public class FLyWeightFactory {
	 private static final HashMap<String, FlyWeightInterface> testMap = new HashMap();

	   public static FlyWeightInterface getTest(TypeCategory type) {
	      Test test = (Test)testMap.get(type.toString());
	      if(test == null) {
	    	  test = new Test(type);
	    	  testMap.put(type.toString(), test);
	         System.out.println("Creating test of type : " + type);
	      }
	      return test;
	   }
}
