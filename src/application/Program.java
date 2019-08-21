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
		
		int[][] matriz = new int[lines][columns];

		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < columns; j++) {
				matriz[i][j] = i + j; 
			}
		}

		System.out.println();
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(matriz[i][j] + " "); 
			}
			System.out.println();
		}
		
		int[][] transposta = new int[columns][lines];
		
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < lines; j++) {
				transposta[i][j] = matriz[j][i]; 
			}
		}
		
		System.out.println();
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < lines; j++) {
				System.out.print(transposta[i][j] + " "); 
			}
			System.out.println();
		}
		
		sc.close();
	}

}
