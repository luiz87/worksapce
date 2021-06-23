package senai.org.br;

public class Exemplo01 {

	public static void main(String[] args) {
		int[] n = { 7, 42, 9, 6, 5, 3, 10, 2, 1, 4 };
		int aux = 0;
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ",");
		}

		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] > n[j]) {
					aux = n[i];
					n[i] = n[j];
					n[j] = aux;
				}
			}
		}
		System.out.println("");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ",");
		}

	}

}
