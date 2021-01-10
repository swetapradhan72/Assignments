/**
 * Generate the mirror image of a String and add it to the existing string
 * 
 */
	import java.util.Scanner;
	public class Mirror {

		public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String str=scanner.next();
	    System.out.print(getImage(str));
		}
		private static String getImage(String str)
		{
			StringBuilder st = new StringBuilder(str);
		     st.reverse();
			String res=st.toString();
			return str+"|"+res;
			
		}

}
