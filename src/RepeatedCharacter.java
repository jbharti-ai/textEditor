//find the  first non repeated character in string

class RepeatedCharacter
{
	public static void main(String[] args)
	{
		String str = "welcomehere";
		RepeatedCharacter run = new RepeatedCharacter();
		System.out.println(run.firstNonRepeated(str));
	}
	public int firstNonRepeated(String str)
	{
		//change into char array
		char ch;
		for(char i : str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.println(i);
				break;
			}
		}
	return 0;
	}
	
}