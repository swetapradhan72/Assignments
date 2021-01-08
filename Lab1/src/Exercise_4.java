/**
 * Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
 * @author sweta
 *
 */

public class Exercise_4 {
	public static void main(String[] args) {
		int n =15;
		 for(int i=2;i<=n;i++)
		 {
		 	if(isPrime(i))
		 	{
		 		System.out.println(i);
		 	}
		 }
		
	}

	public static boolean isPrime(int num)
	{
		boolean result=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				result=false;
		}
		return result;
	}
}
