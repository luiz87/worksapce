import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 01"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 02"));
		int media = (n1 + n2)/2;
		JOptionPane.showMessageDialog(null, "A média é: "+media);
	}

}
