import org.omg.CORBA.PUBLIC_MEMBER;

public class ButtonChecker {
	public int button(int[][] data) 
    {
		int result = 0;
		int counter = 0;
		if((data[0][0]>10)&&(data[0][1]>10) && (data[1][0]>10)  && (data[1][1]>10)){
			for (int i = 0; i < 5; i++) { 
				for (int j = 0; j < 7; j++) { 
					if(data[i][j]>10) {
						counter++;
					}
				}
			}
			if(counter>4) {
				System.out.println("press only one button");
			}
			else if (counter==4) {
				result = 1;
			} 
			counter = 0;
		}
		
		else if ((data[0][3]>10)&&(data[0][4]>10) && (data[1][3]>10)  && (data[1][4]>10)) {
			for (int i = 0; i < 5; i++) { 
				for (int j = 0; j < 7; j++) { 
					if(data[i][j]>10) {
						counter++;
					}
				}
			}
			if(counter>4) {
				System.out.println("press only one button");
			}
			else if (counter==4) {
				result = 2;
			} 
			counter = 0;
			
		}
		
		else if ((data[3][0]>10)&&(data[3][1]>10) && (data[4][0]>10)  && (data[4][1]>10)) {
			for (int i = 0; i < 5; i++) { 
				for (int j = 0; j < 7; j++) { 
					if(data[i][j]>10) {
						counter++;
					}
				}
			}
			if(counter>4) {
				System.out.println("press only one button");
			}
			else if (counter==4) {
				result = 3;
			} 
			counter = 0;
			
		}
		else if ((data[2][5]>10)&&(data[3][5]>10) && (data[2][6]>10)  && (data[3][6]>10)) {
			for (int i = 0; i < 5; i++) { 
				for (int j = 0; j < 7; j++) { 
					if(data[i][j]>10) {
						counter++;
					}
				}
			}
			if(counter>4) {
				System.out.println("press only one button");
			}
			else if (counter==4) {
				result = 5;
			} 
			counter = 0;
			
		}
		else if ((data[3][3]>10)&&(data[3][4]>10) && (data[4][3]>10)  && (data[4][4]>10)) {
			for (int i = 0; i < 5; i++) { 
				for (int j = 0; j < 7; j++) { 
					if(data[i][j]>10) {
						counter++;
					}
				}
			}
			if(counter>4) {
				System.out.println("press only one button");
			}
			else if (counter==4) {
				result = 4;
			} 
			counter = 0;
			
		}
	
		return result;
    
    }	
}
