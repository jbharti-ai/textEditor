class MaxMin
{
	public static void main(String[] argss)
	{
		int[] arr = {2,6,7,3,1,4};
		maxNMin(arr);
	}
	public static int maxNMin(int[] nums)
	{
		int max = nums[0];
		int min = nums[0];
		for(int i = 0 ; i < nums.length -1 ; i++)
		{
			if(max < nums[i])
			{
				max = nums[i];
			}
			else if(min > nums[i])
			{
				min = nums[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	return 0;
	}
}
