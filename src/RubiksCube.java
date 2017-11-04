import java.util.Hashtable;
import java.util.Map;

public class RubiksCube
{
	//                         [T(0,0)][T(0,1)][T(0,1)]
	//                         [T(1,0)][T(1,1)][T(1,2)]
	//                         [T(2,0)][T(2,1)][T(2,2)]
	// [L(0,0)][L(0,1)][L(0,2)][F(0,0)][F(0,1)][F(0,2)][R(0,0)][R(0,1)][R(0,2)]
	// [L(1,0)][L(1,1)][L(1,2)][F(1,0)][F(1,1)][F(1,2)][R(1,0)][R(1,1)][R(1,2)]
	// [L(2,0)][L(2,1)][L(2,2)][F(2,0)][F(2,1)][F(2,2)][R(2,0)][R(2,1)][R(2,2)]
	//                         [D(0,0)][D(0,1)][D(0,2)]
	//                         [D(1,0)][D(1,1)][D(1,2)]
	//                         [D(2,0)][D(2,1)][D(2,2)]
	//                         [B(0,0)][B(0,1)][B(0,2)]
	//                         [B(1,0)][B(1,1)][B(1,2)]
	//                         [B(2,0)][B(2,1)][B(2,2)]

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
