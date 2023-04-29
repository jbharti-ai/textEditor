//it should have sorted arry to perform the binnary search
//best case time complexity (O(log n))

class BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int num = 30;
		int num2 = 70;
		//instance of class
		BinarySearch search = new BinarySearch();
		//calling method
		System.out.println("the num is at the index " + search.findNumber(arr,num));
	}
	public int findNumber(int[] arr, int num)
	{
		int low = 0, high = arr.length-1;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			if(arr[mid]==num)
			{
				return mid;
			}
			else if(arr[mid]<num)
			{
				low += 1;
			}
			else if(arr[mid]>num)
			{
				high -= 1;
			}
		}
		return 0;
		
	}
}