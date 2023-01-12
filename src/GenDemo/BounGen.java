package GenDemo;

public class BounGen<T extends Number> {
	
	T[] nums;
	
	BounGen(T[] o)
	{
		nums=o;
	}
	
	double getAvg()
	{
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
		{
			sum +=nums[i].doubleValue();
		}
		
		return sum/nums.length;
	}
	

}
