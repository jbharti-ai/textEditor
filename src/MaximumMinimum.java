//data structure 
class MaximumMinimum
{
	public static void main(String[] args)
	{
		int[] arrays = {10,2,1,0,8,4,9};
		findMaxMin(arrays);
	}
	public static void findMaxMin(int[] values)
	{
		int max = values[0];
		int min = values[0];
		for(int i = 0; i<values.length-1 ; i++)
		{
			if(max>values[i])
			{
				max = values[i];
			}
			if(min<values[i])
			{
				min = values[i];
			}
		}
		System.out.println("minimum values are :" + min);
		System.out.println("maximum values are :" + max);	
	}
	public static findValues(int[] numbers)
	{
		
	}
}