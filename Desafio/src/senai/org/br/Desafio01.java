package senai.org.br;

import javax.swing.JOptionPane;

public class Desafio01 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 01 número!"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 01 número!"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 01 número!"));

		int aux = 0;
		if (n1 > n2) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}

		if (n1 > n3) {
			aux = n1;
			n1 = n3;
			n3 = aux;
		}

		if (n2 > n3) {
			aux = n2;
			n2 = n3;
			n3 = aux;
		}
		JOptionPane.showMessageDialog(null, "Numeros ordenados: " + n1 + ", " + n2 + ", " + n3);

	}

}
