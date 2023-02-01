import java.util.*;

class RockPaperScissors 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int userChoice = -1;
		String tempInput;
		int cpuChoice;
		String[] validMoves = {"rock", "paper", "scissors", "exit"};
		int playerIndex;


		while (true) {


			//get user input and ensure it is a valid move:
			
			System.out.println("input your move: [0]: rock, [1]: paper, [2]: scissors, [3]: exit");
			tempInput = in.nextLine();
			while (userChoice == -1) {
				try {
					userChoice = Integer.parseInt(tempInput);
				}
				catch (Exception e) {
					System.out.println("not a valid input");
					tempInput = in.nextLine();
				}
			}	


			//exit if needed

			if (userChoice >= 3) {
				return;
			}


			//generate random AI choice

			cpuChoice = (int)(Math.random() * 3);
			System.out.println(cpuChoice);

			//calculate game result

			if ((userChoice == (cpuChoice + 1)) || (userChoice == (cpuChoice - 2))) {
				System.out.println("Player Wins!  You Chose " + userChoice + " and computer chose " + cpuChoice);
			}
			else if (userChoice == cpuChoice) {
				System.out.println("Draw!, you both picked " + userChoice);
			}
			else {
				System.out.println("Cpu Wins!");
			}
			


			//reset userChoice for validation on next loop

			userChoice = -1;
		}
	}
}