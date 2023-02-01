class TenGreenBottles
{
	public static void main(String[] args)
	{
		int number = 1000;

		for (int i = number; i > 0; i--) {
			System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n Take one down and pass it around, %d bottles of beer on the wall.%n", i, i, i-1);
		}
	}
}