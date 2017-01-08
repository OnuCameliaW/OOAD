package proiectOOAD;
 
public class FlyWeightDemo {
	public FlyWeightDemo(){
		for(int i=1;i<=10;i++)
		{
			Test t = (Test)FLyWeightFactory.getTest(getRandomTypeCategory(i));
			t.setTestId(i);
			t.setTestName(TypeCategory.JobOffer.toString());
			t.setTestDescription("Test  as a "+getRandomTypeCategory(i).toString());
			t.makeTest(); 
		}
	}
	private static TypeCategory getRandomTypeCategory(int i) {
		if(i%4==0)
			return TypeCategory.Technical;
		else if(i%4==1)
			return TypeCategory.Practical;
		else if(i%4==2)
			return TypeCategory.Personality;
		else if(i%4==3)
			return TypeCategory.JobOffer;
		return TypeCategory.JobOffer;
	   }
     
      
}
