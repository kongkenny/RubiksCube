
public class Side
{
	public int[][] side = new int[3][3];
	
	public Side(int the_side_number)
	{
		for (int i = 0; i < side.length; i++)
			for (int j = 0; j < side[i].length; j++)
				side[i][j] = the_side_number;
	}
	
	public String toString()
	{
		String result = "";
		for (int i = 0; i < side.length; i++)
		{
			for (int j = 0; j < side[i].length; j++)
			{
				result += "[" + side[i][j] + "]";	
			}
			result += "\n";
		}
		return result;
	}
}
