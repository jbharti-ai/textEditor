import java.util.*;

class ValidParanthesis
{
	public static void main(String[] args)
	{
		ValidParanthesis paranthesis = new ValidParanthesis();
		String str = "{}()[]";
		paranthesis.checkParanthesis(str);
	}
	public void checkParanthesis(String str)
	{
		Stack<Character> symbol = new Stack<>();
		for(char ch : str.toCharArray())
		{
			if(ch =='(' || ch == '{' || ch == '[')
			{
				symbol.push(ch);
			}
			else if(ch == ')' && !symbol.isEmpty() && symbol.peek() == '(')
			{
				symbol.pop();
			}
			else if(ch == '}' && !symbol.isEmpty() && symbol.peek() == '{')
			{
				symbol.pop();
			}
			else if(ch == ']' && !symbol.isEmpty() && symbol.peek() == '[')
			{
				symbol.pop();
			}
			else{
				System.out.println("false");
			}
		}
	System.out.println("true");
	}
}