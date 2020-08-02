import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

// Day 5

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("students.txt"));
		
		LinkedList<String> students = new LinkedList<String>();
		
		while(in.hasNextLine()) {
			students.add(in.nextLine());
		}
		
		// "pop" elements from the linked list (last in first out)
		while(!students.isEmpty()) {
			System.out.println(students.removeLast());
		}
	}

}
