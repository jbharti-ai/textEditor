//maximum subarray
class MaximumSubarray
{
	public static void main(String[] args)
	{
		int[] array = {-3,-4,5,-1,2,-4,6,-1};
		MaximumSubarray ms = new MaximumSubarray();
		ms.maxSubarray(array);
		ms.maximumSubarray(array);
		//System.out.println(ms.maximumSubarray(array));
	}
	
	//simple approach
	public void maxSubarray(int[] nums)
	{
		int maxsum = Integer.MIN_VALUE;
		for(int i = 0; i<nums.length-1; i++)
		{
			int currval = 0;
			for(int j = i; j<nums.length-1; j++)
			{
				currval += nums[j];
				if(currval>maxsum)
				{
					maxsum = currval;
				}
			}
		}
	}
	
	//kadane`s algorithm
	public int maximumSubarray(int[] arr)
	{
		int currsum = 0;
		int maxsum = Integer.MIN_VALUE;
		for(int i = 0; i<=arr.length-1; i++)
		{
			currsum += arr[i];
			if(currsum>maxsum)
			{
				maxsum = currsum;
				System.out.println(maxsum);
			}
			if(currsum<0)
			{
				currsum = 0;
			}
		}
	return maxsum; 
	}
}