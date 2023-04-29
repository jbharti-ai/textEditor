//Missing Number in a given integer array 1 to 100
import java.util.*;
import java.io.*; 
class MissingNumberArray
{
	public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
 
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;
 
        // Function call
        findMissing(arr, n);
    }
	/*public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		/*System.out.println("enter the number of values :");
		int numbers = scan.nextInt();
		int[] arr = new int[numbers];
		System.out.println("values to be enter");
		for(int i = 0;i<numbers; i++)
		{
			arr[i] = scan.nextInt();
		}
		int[] arr = {1,2,3,4,6,7,9,10};
		findMissingNumber(arr);
	}
	public static void findMissingNumber(int[] arr)
	{
		for(int i = 0; i<arr.length-1; i++)
		{
			int index = Math.abs(arr[i]);
			if(arr[index-1]>0)
			{
				arr[index-1] *= -1;
			}
		}
		List<Integer>ans = new ArrayList<>();
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				ans.add(i+1);
			}
		}
	}*/
	
}