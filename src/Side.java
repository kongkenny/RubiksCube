
public class Side
{
	//    0  1  2
	// 0 [ ][ ][ ]
	// 1 [ ][ ][ ]
	// 2 [ ][ ][ ]
	public int[][] side = new int[3][3];
	
	public Side(int the_side_number)
	{
		for (int i = 0; i < side.length; i++) // row
			for (int j = 0; j < side[i].length; j++) // col
				side[i][j] = the_side_number;
	}
	
	public void rotateFaceCW()
	{
		int temp = side[0][0];
		side[0][0] = side[2][0];
		side[2][0] = side[2][2];
		side[2][2] = side[0][2];
		side[0][2] = temp;
		
		temp = side[0][1];
		side[0][1] = side[1][0];
		side[1][0] = side[2][1];
		side[2][1] = side[1][2];
		side[1][2] = temp;
	}
	
	public void rotateFaceCCW()
	{
		int temp = side[0][0];
		side[0][0] = side[0][2];
		side[0][2] = side[2][2];
		side[2][2] = side[2][0];
		side[2][0] = temp;
		
		temp = side[0][1];
		side[0][1] = side[1][2];
		side[1][2] = side[2][1];
		side[2][1] = side[1][0];
		side[1][0] = temp;
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
