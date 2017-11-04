
public class RubiksCubeRunner
{
	public static void main(String... the_args)
	{
		RubiksCube rubiks_cube = new RubiksCube();
		
		System.out.println("Rubik's Cube");
		System.out.println(rubiks_cube.toString());
		
		rubiks_cube.FC();
		System.out.println("FC");
		System.out.println(rubiks_cube.toString());
		
		rubiks_cube.FCC();
		System.out.println("FCC");
		System.out.println(rubiks_cube.toString());
	}
}
