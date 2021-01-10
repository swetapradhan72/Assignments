/**
 * displays the number of characters, lines and words in a text
 * @author sweta
 *
 */

public class DisplayChars {

		public static void main(String[] args) {
	    String str="java tddd \new maven ";
	    String []words=str.split("[ ,.]+");
	    String []lines=str.split("[\r\n]");
	    System.out.println("No of characters = "+str.length());
	    System.out.println("No of lines = "+lines.length);
	    System.out.println("No of words = "+words.length);
		}

	}
	
