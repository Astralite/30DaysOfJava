import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("src/test.txt"));
		
		while(in.hasNextLine()) {
			System.out.println("line: " + in.nextLine());
		}
	}

}
