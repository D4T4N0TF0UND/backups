import java.util.Scanner;

class ElfNameArray
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int monthIndex = -1;

		String[] firstNames = {"Sparkle", "Jingle", "Happy", "Snowy", "Tinsel", "Jolly", "Bumble", "Cosmo", "Twizzle", "JoJo", "Pinky", "Twirly", "Zippy", 
								"Noel", "Swirly", "Dizzy", "Minty", "Cranberry", "Crinkle", "Poppy", "Tookie", "Merry", "Tinker", "Pepper", "Glitter", "Wiggles"};
		String[] month = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
		String[] lastNames = {"Sugarberry", "McGiggles", "Muffin Tin", "Pickle Pants", "Plumbottom", "Snickerdoodle", "Cinnabuns", "Snazzyhead", "Monkey berry", "Twinkle Toes", "Ginger pants", "Bright Buttons"};

		String nameInput;
		String monthInput;

		String elfFirstName;
		String elfLastName;

		Boolean toContinue = false;

		System.out.println(firstNames[0]);
		System.out.println(firstNames[firstNames.length - 1]);

		for (String tempString : month) {
			System.out.println(tempString);
		}

		System.out.println("this program takes the first letter of your name birth month, and outputs your elf name");

		System.out.println("please enter your firstname");
		nameInput = in.nextLine();
		while (nameInput.length() == 0) {
			System.out.println("please enter a name");
		}


		while (toContinue == false) {
			System.out.println("please enter your birth month in all caps, eg JAN");
			monthInput = in.nextLine();
			monthIndex = -1;

			for (String tempString : month) {
				monthIndex++;
				if (monthInput.equalsIgnoreCase(tempString) == true) {
					toContinue = true;
					break;
				}
			}
			
		}


		elfFirstName = firstNames[((int) nameInput.charAt(0)) - 65];
		elfLastName = lastNames[monthIndex];
		System.out.println("your elf name is " + elfFirstName + " " + elfLastName);
		

		
	}
}