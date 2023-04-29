import java.util.*;
class ValidAnagram
{
	public static void main(String[] args)
	{
		ValidAnagram anagram = new ValidAnagram();
		String str = "abcd";
		String str1 = "bcda";
		System.out.println(anagram.checkAnagram(str,str1));
	}
	public boolean checkAnagram(String str, String str1)
	{
		char[] ar = str.toCharArray();
		char[] ar1 =str1.toCharArray();
		Arrays.sort(ar);
		Arrays.sort(ar1);
		if(ar.length != ar1.length)
		{
			return false;
		}
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i] != ar1[i])
			{
				return false;
			}
		}
		return true;
	}
}