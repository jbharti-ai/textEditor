//check if string has all unique character 
import java.util.*;

class UniqueCharacter
{
	public static void main(String[] args)
	{
		String one = "java";
		UniqueCharacter uc = new UniqueCharacter();
		System.out.println(uc.uniqueCharacter(one));
	}
	public boolean uniqueCharacter(String one)
	{
		//convert  string to array
		char[] arr = one.toCharArray();
		
		//sorted array
		Arrays.sort(arr);
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i] == arr[i-1])
			{
				return false;
			}
		}
		return true;
	}
}