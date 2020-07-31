import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declare and Initialize userInput variable 
		String userInput = "";
		
		Scanner in = new Scanner(System.in);
		// Request user input until user input matches "Hello"
		do {
			System.out.println("run");
			
			System.out.println("Enter some text: ");
			userInput = in.nextLine();
		} while (!userInput.equals("Hello"));
		in.close();
	}

}
