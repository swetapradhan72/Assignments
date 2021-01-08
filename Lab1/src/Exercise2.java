/**
 * Exercise 2: Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
 * @author sweta
 *
 */
public class Exercise2 {
     public static void main (String [] args) {
    	 String l1="Red";
    	 String l2="Yellow";
    	 String l3="Green";
    	 String command=null;
    	 
    	 command= showCommand("Red");
    	 System.out.println(command);;
     }

	private static String showCommand(String l1) {
    	String str=new String(); 
    		if(l1=="Red") {
    			str="STOP";
    		}
    		else if(l1=="Yellow") {
    			str="Wait";
    		}
    		else if(l1=="Green") {
    			str="Go";
    		}
    	
		return str;
	}
}
