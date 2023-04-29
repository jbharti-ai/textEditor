class ValidPalindrome
{
	public static void main(String[] args)
	{
		ValidPalindrome palindrome = new ValidPalindrome();
		String str = "php";
		palindrome.checkPalindrome(str);
	}
	public void checkPalindrome(String str)
	{
		String str1 = str;
		String str2 = "";
		for(int i = 0; i<str.length(); i++)
		{ 
			char ch = str.charAt(i);
			str2 = str2 + ch;
		}
		if(str1.equals(str2))
		{
			System.out.println("valid palindrome");
		}
		else
		{
			System.out.println("Not ValidPalindrome");
		}
	}
}