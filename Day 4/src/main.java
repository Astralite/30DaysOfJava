import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a size for array");
		
		int size = in.nextInt();
		int[] grades = new int[size];
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println(i + ". Grade: ");
			grades[i] = in.nextInt();
		}
		
		in.close();
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Grade #" + i + ": " + grades[i]);
		}
	}

}
