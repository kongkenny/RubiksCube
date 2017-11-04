import java.util.Hashtable;
import java.util.Map;

public class RubiksCube
{
	private final String F = "F";
	private final String L = "L";
	private final String R = "R";
	private final String B = "B";
	private final String U = "U";
	private final String D = "D";
	
	private Map<String, Side> sides;
	
	public RubiksCube()
	{
		sides = new Hashtable<String, Side>();
		sides.put(F, new Side(1));
		sides.put(L, new Side(2));
		sides.put(R, new Side(3));
		sides.put(B, new Side(4));
		sides.put(U, new Side(5));
		sides.put(D, new Side(6));
	}
	
	public void FC()
	{
		int[] temp = sides.get(U).side[2];
		sides.get(U).side[2] = sides.get(L).side[2];
		sides.get(L).side[2] = sides.get(D).side[2];
		sides.get(D).side[2] = sides.get(R).side[2];
		sides.get(R).side[2] = temp;
		sides.get(F).rotateFaceCW();
	}
	
	public void FCC()
	{
		int[] temp = sides.get(U).side[2];
		sides.get(U).side[2] = sides.get(R).side[2];
		sides.get(R).side[2] = sides.get(D).side[2];
		sides.get(D).side[2] = sides.get(L).side[2];
		sides.get(L).side[2] = temp;
		sides.get(F).rotateFaceCCW();
	}
	
	public void LC()
	{
		
	}
	
	public void LCC()
	{
		
	}
	
	public void RC()
	{
		
	}
	
	public void RCC()
	{
		
	}
	
	public void BC()
	{
		int[] temp = sides.get(U).side[0];
		sides.get(U).side[0] = sides.get(L).side[0];
		sides.get(L).side[0] = sides.get(D).side[0];
		sides.get(D).side[0] = sides.get(R).side[0];
		sides.get(R).side[0] = temp;
		sides.get(B).rotateFaceCW();
	}
	
	public void BCC()
	{
		int[] temp = sides.get(U).side[0];
		sides.get(U).side[0] = sides.get(R).side[0];
		sides.get(R).side[0] = sides.get(D).side[0];
		sides.get(D).side[0] = sides.get(L).side[0];
		sides.get(L).side[0] = temp;
		sides.get(B).rotateFaceCCW();
	}
	
	public void UC()
	{
		
	}
	
	public void UCC()
	{
		
	}
	
	public void DC()
	{
		
	}
	
	public void DCC()
	{
		
	}
	
	public String toString()
	{
		String result = "";
		for (String key : sides.keySet())
		{
			result += key + "\n";
			result += sides.get(key) + "\n";
		}
		return result;
	}
}
