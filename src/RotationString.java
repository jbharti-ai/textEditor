//check if one string is rotation of another string
class RotationString
{
	public static void main(String[] args)
	{
		String one = "ABCD";
		String two = "CDAB";
		RotationString rs = new RotationString();
		System.out.println(rs.checkStringRotation(one,two));
	}
	public boolean checkStringRotation(String one, String two)
	{
		if(one.length() == two.length() && (one+two).contains(two))
		{
			return true;
		}
		return false;
	}
}