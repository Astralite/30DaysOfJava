
public class main {

	public static void main(String[] args) {
		
		int[][] maze = {
				{0, 1, 1, 0},
				{1, 1, 1, 1},
				{0, 0, 2, 1}
		};

		for(int[] i: maze) {
			for(int j: i) {
				System.out.println(j);
			}
		}
		
	}

}
