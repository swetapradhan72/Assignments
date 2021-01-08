/**
 * Calculate sum
 * @author sweta
 *
 */
public class Exercise_5 {
   public static void main(String [] args) {
	 int n=10;
	   int res=calculateSum(n);
	System.out.println(res);
}

   private static int calculateSum(int n) {
	  int sum=0;
	   for(int i=0;i<=n;i++) {
		  if(i%3==0||i%5==0) {
			 sum=sum+i; 
		  }
	  }
	return sum;
}

}
