//contains duplicate
class Duplicate
{
	public static void main(String[] args)
	{
		int[] arr = {1,4,1,5,8,5,6,7,9,10};
		Duplicate cp = new Duplicate();
		System.out.println(cp.containsDup(arr));
	}
	public Boolean containsDup(int[] arrays)
	{
		for(int i = 1; i<arrays.length-1; i++)
		{
			for(int j = 0; j<arrays.length-1; j++)
			{
				if(arrays[j] == arrays[i])
				{
					return true;
				}
			}
		}
	return false;
	}
}