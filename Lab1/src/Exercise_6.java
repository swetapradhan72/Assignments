/**
 * Calculate the difference
 * @author sweta
 *
 */
public class Exercise_6 {

	public static void main(String[] args) {
		int num=10;
		int res=calculateDiff(num);
		System.out.println(res);

	}

	private static int calculateDiff(int n) {
		int sum=0,sum1=0,diff=0;
		for(int i=1;i<=n;i++) {
			sum+=i*i;
			sum1+=i;
		}
		int sum2=sum1*sum1;
		 diff=sum-sum2;
		return diff;
	}

}
