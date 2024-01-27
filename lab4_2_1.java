// Harekam Kohli
// SBU ID- 115148763
// CSE-114import java.util.*;

import java.util.*;
public class lab4_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a credit card number: ");
		String n = input.next();
		
		if ((n.length() == 15) && n.charAt(0) == '3') {
			System.out.println("American Express");
		}
		else if(n.length()==16 && n.charAt(0)=='4') {
			System.out.println("Visa");
		}
		else if(n.length()==16 && n.charAt(0)=='5') {
			System.out.println("MasterCard");
		}
		else if(n.length()==16 && n.charAt(0)=='6') {
			System.out.println("Discover");
		}
		else if(n.length()==17 && n.charAt(0)=='8' && n.charAt(15)=='9' && n.charAt(16)=='2') {
			System.out.println("WildCard");
		}		
		else
			System.out.println("Error");
	}

}
