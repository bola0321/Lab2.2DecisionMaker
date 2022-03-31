import java.util.Scanner;

public class decisionMaker {

	public static void main(String[] args) {
		// ask user for number 1-100
		// output based on user number
		// ask user to loop program
		
		
		
		//TODO: finish loop and figure out the darn scnr.close

		Scanner scnr = new Scanner(System.in);
		int userNum;
		boolean cont = true;
		do {	
			System.out.print("Enter a number between 1 and 100: ");
			userNum = scnr.nextInt();
			if (userNum % 2 == 1 && userNum > 60) {
				System.out.println("Odd and over 60.");
			} else if (userNum % 2 == 0 && userNum < 25) {
				System.out.println("Even and less than 25");
			} else if (userNum % 2 == 0 && userNum > 60) {
				System.out.println(userNum + " and Even.");
			} else if (userNum % 2 == 1) {
				System.out.println(userNum + " and Odd.");
			} else {
				System.out.println("Even.");
			}
			
			scnr.close();
		}while (cont == true);
	}

}
