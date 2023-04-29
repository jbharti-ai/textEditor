//check if two String is anagram 
import java.util.*;

class Anagram
{
	public static void main(String[] args)
	{
		String one = "geekylove";
		String two = "anotherlove";
		Anagram anagm = new Anagram();
		System.out.println(anagm.checkAnagram(one,two));
	}
	public boolean checkAnagram(String one, String two)
	{
		one = one.toLowerCase();
		two = two.toLowerCase();
		
		//checking length
		if(one.length() == two.length())
		{
			//convert strings to char array
			char[] str1 = one.toCharArray();
			char[] str2 = two.toCharArray();
			
			//sort the array
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			//if sorted char array are same
			boolean res = Arrays.equals(str1,str2);
			if(res)
			{
				return true;
			}
		}
	
	return false;
	}
}