/**
 * The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses
 *
 */
public class Exercise_3_1 {

	public static void main(String[] args) {
		int terms=10;
		for(int i=0;i<terms;i++) {
			System.out.println(fibonacciSeries(i));
		}

	}

	private static int fibonacciSeries(int n) {
		if(n<=1) {
			return n;
		}
		else
		{
			return (fibonacciSeries(n-1)+fibonacciSeries(n-2));
		}
		
	}

}
