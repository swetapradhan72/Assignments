/**
 * Get the second smallest element in the array
 * @author sweta
 *
 */
public class Exercise_1 {

	public static void main(String[] args) {
		int[] arr={10,50,30,60,79};
		int a=getSecondSmallest(arr);
		System.out.println(a);

	}

	private static int getSecondSmallest(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}

}
