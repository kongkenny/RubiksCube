<<<<<<< HEAD
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
		
=======
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RubiksCube
{
	private HashMap<String, Side> sides;
	private int[] strip;
	
	public RubiksCube()
	{
		sides = new HashMap<String, Side>();
		sides.put("U", new Side(0));
		sides.put("F", new Side(1));
		sides.put("R", new Side(2));
		sides.put("B", new Side(3));
		sides.put("L", new Side(4));
		sides.put("D", new Side(5));
		
		strip = new int[3];
	}
	
	public void U()
	{
		int temp = -1;
	}
	
	public void Ui()
	{
		int temp = -1;
	}
	
	public void D()
	{
		int temp = -1;
	}
	
	public void Di()
	{
		int temp = -1;
	}
	
	public void F()
	{
		int temp = -1;
	}
	
	public void Fi()
	{
		int temp = -1;
	}
	
	public void B()
	{
		int temp = -1;
	}
	
	public void Bi()
	{
		int temp = -1;
	}
	
	public void L()
	{
		int temp = -1;
	}
	
	public void Li()
	{
		int temp = -1;
	}
	
	public void R()
	{
		int temp = -1;
	}
	
	public void Ri()
	{
		int temp = -1;
>>>>>>> 04a69d4c3ed4c28d518c300d6344ae436b41c537
	}
	
	public String toString()
	{
		String result = "";
<<<<<<< HEAD
		for (String key : sides.keySet())
		{
			result += key + "\n";
			result += sides.get(key) + "\n";
=======
		Set<String> set = sides.keySet();
		for (Iterator<String> i = set.iterator(); i.hasNext();)
		{
			String side = i.next();
			result += side + "\n" + sides.get(side).toString() + "\n";
>>>>>>> 04a69d4c3ed4c28d518c300d6344ae436b41c537
		}
		return result;
	}
}
