
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int i = test(6);
		if (i > 5) {
			System.out.println("Bigger - Hello");
		} else {
			System.out.println("Smaller - World");
		}
		System.out.println(i);
	}

	private static int test(int num) {
		int myVar = num + 1;
		return myVar;
	}

	
}
