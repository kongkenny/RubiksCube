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
	}
	
	public String toString()
	{
		String result = "";
		Set<String> set = sides.keySet();
		for (Iterator<String> i = set.iterator(); i.hasNext();)
		{
			String side = i.next();
			result += side + "\n" + sides.get(side).toString() + "\n";
		}
		return result;
	}
}
