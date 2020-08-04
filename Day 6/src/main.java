import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Albert");
		names.push("Alex");
		names.push("Allen");
		
		while (names.size()>0) {
			System.out.println(names.pop());
		}
	}

}
