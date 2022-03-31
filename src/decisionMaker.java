import java.util.Scanner;

public class decisionMaker {

	public static void main(String[] args) {
		// ask user for number 1-100
		// output based on user number
		// ask user to loop program

		Scanner scnr = new Scanner(System.in);
		int userNum;
		boolean cont = true;
		String yesNo;
		
		//Intro program, get user input, and logic
		System.out.println("Welcome to the Decision Maker by Bolanle Aduroja." );
		do {
			System.out.print("\n" + "Enter a number between 1 and 100: ");
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

			// ask user to continue
			do {
				System.out.print("\n" + "Continue? (y/n): ");
				yesNo = scnr.next().trim().toLowerCase();

			} while (!yesNo.equals("n") && !yesNo.equals("y"));

			if (yesNo.equals("n")) {
				cont = false;
				System.out.println("\n" + "Thank you for using the Decision Maker.");

			}

		} while (cont == true);

		scnr.close();
	}

}
