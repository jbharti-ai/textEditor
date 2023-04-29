//find smallest and largest number inarray

class MinMaxArray
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,15,5,12,6,9,10};
		MinMaxArray minmax = new MinMaxArray();
		minmax.minmaxFind(arr);
	}
	public void minmaxFind(int[] arr)
	{
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
		for(int i = 0; i<=arr.length-1; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			else if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(min + "  " + max); 
	}
}