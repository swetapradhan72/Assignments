/**
 * 
/**
 * Accepts a number and modify it as per the requirement 
 * 
 */

import java.util.Scanner;
import java.lang.Math; 
public class ModifyString {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String str=sc.next();
	 System.out.print(modifyNumber(str));
		}
    private static String modifyNumber(String str)
		{
			StringBuilder st = new StringBuilder("");
			char []ch=str.toCharArray();
			int len=str.length();
			int a,b,dif;
			//char c;
			for(int i=0;i<len-1;i++)
			{
				a=(int)(ch[i]);
				b=(int)(ch[i+1]);
				dif=Math.abs(a-b);
				//c=(char)dif;
				st=st.append(dif);
			}
			return st.toString();
		}

	}

