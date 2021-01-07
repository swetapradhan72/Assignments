import java.util.Arrays;

/**
 * accept an array of String objects and sort in
Alphabetical order

 * @author sweta
 *
 */
public class Exercise_2 {

	public static void main(String[] args) {
		String str[]= {"cat","apple","ball","zebra","ink"};
		System.out.println(sortStrings(str));

	}

	private static String sortStrings(String[] str) {
		Arrays.sort(str);
		String sort_strings="";
		int length=str.length;
		if(length%2==0) {
			sort_strings=split_even(str);
		}
		else {
			sort_strings=split_odd(str);
		}
		
		return sort_strings;
	}

	private static String split_even(String[] str) 
	{
		String odd_string=" ";
		for(int i=0;i<(str.length/2);i++) {
			odd_string+=str[i].toUpperCase()+" ";
		}
		for(int j=(str.length/2);j<(str.length);j++) {
			odd_string+= str[j].toLowerCase()+" ";
		}
		return odd_string;
    }

	private static String split_odd(String[] str) {
		
		String even_string=" ";
		for(int i=0;i<(str.length/2)+1;i++) {
			even_string+=str[i].toUpperCase()+" ";
		}
		for(int j=(str.length/2)+1;j<(str.length);j++) {
			even_string+= str[j].toLowerCase()+" ";
		}
		return even_string;
	}

	

}
