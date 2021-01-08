/**
 * Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number
 * @author sweta
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
			int cube=findCube(234);
			System.out.println(cube);

	}

	private static int findCube(int i) {
		int sum=0;
		int r;
		while(i!=0)
		{
			r=i%10;
			sum+=r*r*r;
			i/=10;
		}
		return sum;
	}

}
