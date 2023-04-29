class ReverseAraay
{
	public int arrReverse(int[] arr)
	{
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		return 0;
	}
	public void reverse(int[] aray)
	{
		int temp ;
		int start = 0;
		int end = aray.length-1;
		while(start<end)
		{	
			temp = aray[start];
			aray[start] = aray[end];
			aray[end] = temp;
			start++;
			end--;
		}
		System.out.println(" values for different methods");
		for(int ar : aray)
		{
			System.out.print(ar);
		}
	
	}
	public static  void main(String[] args)
	{
		int[] values = {2,4,5,7,8,9,1,2};
		ReverseAraay ra = new ReverseAraay();
		ra.arrReverse(values);
		ra.reverse(values);
	}
}