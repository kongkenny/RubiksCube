
public class RubiksCube
{
	private Side[] sides;
	
	public RubiksCube()
	{
		sides = new Side[6];
		sides[0] = new Side(1);
		sides[1] = new Side(2);
		sides[2] = new Side(3);
		sides[3] = new Side(4);
		sides[4] = new Side(5);
		sides[5] = new Side(6);
	}
	
	public String toString()
	{
		String result = "";
		for (int i = 0; i < sides.length; i++)
			result += sides[i].toString() + "\n";
		return result;
	}
}
