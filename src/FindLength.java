//find length of string without using inbuilt function
class FindLength
{
	public static void main(String[] args)
	{
		String str = "gaming";
		FindLength len = new FindLength();
		len.findLength(str);
	}
	public int findLength(String str)
	{
		int counter = 0;
		int i = 0;
		while(str(i)!=0)
		{
			counter++;
			i++;
		}
		return counter;
	}
}