import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
		int soma = n1 + n2;
		JOptionPane.showMessageDialog(null, "A soma �: "+soma);
	}

}
