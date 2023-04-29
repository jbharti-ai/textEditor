//print all the permutations of string
//using recursion

class AllPermutation
{
	public static void main(String[] args)
	{
		String str = "abba";
		AllPermutation per = new AllPermutation();
		per.printPermut(str,"");
	}
	public void printPermut(String str, String ans)
	{
		if(str.length()==0)
		{
			System.out.print(ans + " ");
			return;
		}
		for(int i = 0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			String ros = str.substring(0,i) + str.substring(i+1);
			printPermut(ros,ans+ch);
		}
	}
}