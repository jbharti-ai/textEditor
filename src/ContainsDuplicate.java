//check if string contains duplicate
import java.util.*;

class ContainsDuplicate
{
	public static void main(String[] args)
	{
		String str = "same";
		ContainsDuplicate con = new ContainsDuplicate();
		System.out.println(con.checkDouble(str));
	}
	public boolean checkDouble(String one)
	{
		//convert string to array char
		char[] arr = one.toCharArray();
		//sort array
		Arrays.sort(arr);
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i]==arr[i-1])
			{
				return false;
			}
		}
		return true;
	}
}