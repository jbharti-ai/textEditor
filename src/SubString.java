//substrings

class SubString
{
	public static void main(String[] args)
	{
		String str = "javaoneblog";
		SubString sub = new SubString();
		sub.subStrings(str);
	}
	public String subStrings(String str)
	{
		for(int i = 0; i<str.length(); i++)
		{
			for(int j = i+1; j<str.length(); j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	return "0";
	}
}