/**
 * The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
 * @author sweta
 *
 */
public class Exercise_3 {
   public static void main(String [] args) {
	   int a=0,b=1,c;
	   int n=10;
	   System.out.println("---------Fibonacci Series--------");
	   for(int i=0;i<=n;i++) {
		   System.out.println(a);
		   c=b;
		   b=a;
		   a=b+c;
	   }
	   
   }
}
