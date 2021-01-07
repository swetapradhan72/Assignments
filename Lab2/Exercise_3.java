/**
 * Return the resulting array after reversing the numbers and sorting it 
 * @author sweta
 *
 */
public class Exercise_3 {

	public static void main(String[] args) {
		int[] arr= {11,88,99,65,78};
		int[] rev=new int[5];
		int l=arr.length;
		for(int i=0;i<5;i++) {
			rev[l-1]=arr[i];
			l=l-1;
		}
		for(int i=0;i<rev.length;i++) {
			System.out.println(rev[i]);
		}
		
		
            
	}

}
