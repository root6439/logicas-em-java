package application;

public class Program {

	public static void main(String[] args) {

		int[] vetor = {3, 4, 0, 3, 5, 0, 0, 2, 4, 6};
				
		int[] histograma = new int[vetor.length];
		
		organizaVetor(vetor);
		
		for(int i = 0; i < histograma.length; i++) {
			if(existeNoVetor(i, vetor)) {
				histograma[i] = 1;
			} else {
				histograma[i] = 0;
			}
		}
		for(int i = 0; i < vetor.length; i++) {
			for(int j = i + 1; j < vetor.length; j++) {
				if(vetor[i] == vetor[j] && histograma[i] >= 1) {
					histograma[i]++;
				}
			}
		}
				
		for(int num : vetor) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num : histograma) {
			System.out.print(num + " ");
		}
	}
	
	public static boolean existeNoVetor(int numero, int vetor[]) {
		boolean existe = false;
		for(int i = 0; i < vetor.length; i++) {
			if(numero == vetor[i]) {
				existe = true;
			}
		}
		return existe;
	}
	public static void organizaVetor(int vetor[]) {
		int aux;
		for(int i = 0; i<vetor.length; i++){
	        for(int j = 0; j < vetor.length - 1; j++){
	            if(vetor[j] > vetor[j + 1]){
	                aux = vetor[j];
	                vetor[j] = vetor[j+1];
	                vetor[j+1] = aux;
	            }
	        }
	    }
	}
	
}
