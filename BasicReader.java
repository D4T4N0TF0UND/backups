import java.util.*;
import java.io.*;

class BasicReader
{
	public static void main(String[] args)
	{
		int lineCount = 0;
		String tempString;
		ArrayList<String> stringsList = new ArrayList<String>();
		String fileName;
		Scanner in = new Scanner(System.in);

		System.out.println("enter a file name");
		fileName = in.nextLine();

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			while (true) {
				tempString = br.readLine();

				if (tempString.equals("EOF")) {
					br.close();
					break;
				}

				System.out.println(tempString);
				lineCount++;
				stringsList.add(tempString);

			}
			System.out.println(lineCount);
			System.out.println(stringsList);
		}
		catch(Exception e) {
			System.out.println("read error");
		}
		
		
	}
}