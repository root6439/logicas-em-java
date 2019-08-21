package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de linhas da matriz: ");
		int lines = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Número de colunas: ");
		int columns = sc.nextInt();
		sc.nextLine();
		
		double[][] matriz = new double[lines][columns];
		
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < columns; j++) {
				matriz[i][j] = i + j + 0.5; 
			}
		}

		System.out.println();
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(matriz[i][j] + " "); 
			}
			System.out.println();
		}
		
		System.out.print("Multiplicar números da matriz por: ");
		double escalar = sc.nextDouble();
		sc.nextLine();
		
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < columns; j++) {
				matriz[i][j] *= escalar; 
			}
		}
		
		System.out.println();
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(matriz[i][j] + " "); 
			}
			System.out.println();
		}
		
		sc.close();
	}

}
