import java.util.LinkedList;
import java.util.ListIterator;

public class main {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Albert");
		names.push("Alex");
		names.push("Allen");
		
		ListIterator<String> it = names.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		it.previous();
		it.add("Ahmed");
		
		for(String s: names) {
			System.out.println(s);
		}
	}

}
