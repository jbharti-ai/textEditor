//Reverse s String without inbult functions

class Reverse
{
	public static void main(String[] args)
	{
		String str = "java";
		Reverse rev = new Reverse();
		rev.reverseString(str);
	}
	public int reverseString(String str)
	{
		char ch;
		String arr = "";
		for(int i = 0; i<=str.length()-1;i++)
		{
			ch = str.charAt(i);
			arr = ch + arr;
		}
		System.out.println(arr);
	return 0;
	}
}