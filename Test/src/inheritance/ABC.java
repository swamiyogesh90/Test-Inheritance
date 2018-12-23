package inheritance;

public class ABC {
	
	static class P {
		
		P(){
			System.out.println("Yogesh");
		}
	}
	
	static class Q extends P {
		
		Q(){
			System.out.println("Swami");
		}
	}
	
	public static void main(String[] args) {
		Q q = new Q();
		
		int row = 3;
		int column = 5;
		int array[][] = new int[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = i*j;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
