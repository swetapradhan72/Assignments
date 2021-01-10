/**
 * Replace consonants in a string
 * @author sweta
 *
 */

	import java.util.Scanner;
	public class ReplaceConsonant {
		public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    alterString(str);
		}
	    private static String alterString(String str)
	    {
	    	StringBuilder stt = new StringBuilder("");
	    	char c;
	        char[] ch = str.toCharArray(); 
	        int len=ch.length;
	        for(int i=0;i<len;i++)
	        {
	        	if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u' && str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' && str.charAt(i)!='O' && str.charAt(i)!='U')
	        	{
	        		c=(char)(ch[i]+1);
	        		System.out.print(c);
	        	}
	        	else 
	        	{
	        		c=ch[i];
	        		System.out.print(c);
	        	}
	        	stt=stt.append(c);
	        }
	    	return stt.toString();
	    }
	}
