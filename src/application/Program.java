package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de elementos: ");
		int tamanho = sc.nextInt();
		sc.nextLine();
		
		int[] array = new int[tamanho];
		
		System.out.println();
		for (int i = 0; i < tamanho; i++) {
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}
		
		int[] antiarray = new int[tamanho];
		
		System.out.println();
		for (int i = 0; i < tamanho; i++) {
			antiarray[i] = array[(tamanho - 1) - i];
			System.out.print(antiarray[i] + " ");
		}
		
		sc.close();
	}

}
