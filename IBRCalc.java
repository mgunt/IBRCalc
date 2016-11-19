import java.util.*; // Imports Scanner class

public class IBRCalc
{
	public static void main(String[] args) {

		String asterisk = ""; // generates the asterisks for the terminal prompt
		for(int astCount = 0; astCount < 12; astCount++){
			asterisk = asterisk + "*";
		}
		//declaring variables
		String choice;
		double AGI;
		double familySize;
		double discretionaryIncome;
		double payment;
		double povertylevel = 11880;
		double extraPerson = 3920;
		Scanner input = new Scanner(System.in); // creates variable that reads text from the terminal
		do{
			System.out.println("");
			System.out.println(asterisk + " Welcome to the IBRCalc program " + asterisk);
			System.out.println("This program will determine your eligibility for income driven repayment plans and how much your federal student loan payment would be.");
			System.out.println("First, choose what income driven plan you wish to apply for.");
			System.out.println("Press 1 for Income Based Repayment, 2 for Pay as You Earn, 3 for Income Contigent Repayment, and 4 to exit");

			choice = input.next();

			switch(choice){
				case "1":
					System.out.println("You have selected: Income Based Repayment");
					System.out.println("What is your adjusted gross income?");
					AGI = input.nextDouble();
					System.out.println("What is your family size? (Use whole numbers)");
					familySize = input.nextDouble();
					discretionaryIncome = (AGI - 1.5*(povertylevel + (extraPerson * (familySize-1))));
					payment = discretionaryIncome / 12 * .15;
					System.out.println("Your estimated IBR payment would be: " + String.format( "$%.2f", payment ));
					break;
				case "2":
					System.out.println("You have selected: Pay as You Earn");
					System.out.println("What is your adjusted gross income?");
					AGI = input.nextDouble();
					System.out.println("What is your family size?");
					familySize = input.nextDouble();
					discretionaryIncome = (AGI - 1.5*(povertylevel + (extraPerson * (familySize-1))));
					payment = discretionaryIncome / 12 * .1;
					System.out.println("Your estimated PAYE payment would be: " + String.format( "$%.2f", payment ));
					break;
				case "3":
					System.out.println("You have selected: Income Contingent Repayment");
					System.out.println("What is your adjusted gross income?");
					AGI = input.nextDouble();
					System.out.println("What is your family size? (Use whole numbers)");
					familySize = input.nextDouble();
					discretionaryIncome = (AGI - 1.5*(povertylevel + (extraPerson * (familySize-1))));
					payment = discretionaryIncome / 12 * .2;
					System.out.println("Your estimated ICR payment would be: " + String.format( "$%.2f", payment ));
					break;
				case "4":
					System.out.println("Goodbye!");
					System.exit(0);
					break;
				default:
					System.out.println("The input you provided is invalid. Please try again.");
					break;
			}
		}while (choice != "4");
	}
}
