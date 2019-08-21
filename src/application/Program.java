package application;

public class Program {

	public static void main(String[] args) {

		int[][] matriz1 = {{1, 0, -1}, {3, 2, 5}};
		int[][] matriz2 = {{1, 0, -1, 1}, {0, 0, 0, 2}, {2, 1, 0, 3}};
		int[][] matriz3 = new int[matriz1.length][matriz2[0].length];
		int aux = 0;
		
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz2[0].length; j++) {
				while(aux < matriz1[0].length && aux < matriz2.length) {
					matriz3[i][j] += matriz1[i][aux] * matriz2[aux][j];
					aux++;
				}
				aux = 0;
			}
		}
		
		System.out.println();
		for(int i = 0; i < matriz3.length; i++) {
			for(int j = 0; j < matriz3[0].length; j++) {
				System.out.print(matriz3[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
