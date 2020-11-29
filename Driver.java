import java.util.ArrayList;

/**
 * 
 */

/**
 * @author hluka
 *
 */
public class Driver {
	public static void main(String[] args) {
		//System.out.println("hello world");
		int [][] input = { 
				{4,3,3,4,5,6,7},
				{6,8,6,8,5,7,8},
		        {5,6,2,8,9,7,6},					
		        {5,6,2,80,90,7,6},
		        {5,6,2,80,90,7,6},	
		};
		
//		for (int i = 0; i < 5; i++) { 
//            for (int j = 0; j < 7; j++) { 
//                System.out.print(input[i][j] + " "); 
//            } 
//  
//            System.out.println(); 
//        } 
		ButtonChecker buttonChecker = new ButtonChecker();
		System.out.println("Button No" + buttonChecker.button(input)+ " is pressed");
	}
}
