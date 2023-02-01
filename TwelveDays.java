class TwelveDays
{
	public static void main(String[] args)
	{
		String[] days = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelvth"};
		String[] gifts = {"A Partrige in a pear tree", "two turtle doves", "three french hens", "four calling birds", "five golden rings", "six geese a laying", "seven swans a swimming",
							"eight maids a milking", "nine ladies dancing", "ten lords a leaping", "eleven pipers piping", "twelve drummers drumming"};

		String day;
		String gift;

		for (int i = 0; i < 12; i++) {
			day = days[i];
			System.out.printf("on the %s day of christmas my true love gave to me:%n", day);
			for (int j = i; j > -1; j--) {
				System.out.println(gifts[j]);
			}
		}



	}
}