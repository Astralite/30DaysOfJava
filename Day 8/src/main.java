import java.util.Iterator;
import java.util.LinkedList;

public class main {
	
	static class Explorer {
		LinkedList<int[]> path = new LinkedList<int[]>();
		
		public Explorer(int[] startPos) {
			path.push(startPos);
		}
	}

	public static void main(String[] args) {
		
		int[][] maze = {
				{0, 1, 1, 0},
				{1, 1, 1, 1},
				{0, 0, 2, 1}
		};
		
		Explorer mouse = new Explorer(new int[] {0, 1});
		
		mouse.path.push(new int[] {1, 1});
		mouse.path.push(new int[] {1, 2});
		mouse.path.push(new int[] {2, 2});
		
		while(!mouse.path.isEmpty()) {
			int[] location = mouse.path.pop();
			System.out.println(location[0] + " " + location[1]);
		}
		
//		for(int[] i: maze) {
//			for(int j: i) {
//				System.out.println(j);
//			}
//		}
		
	}

}
