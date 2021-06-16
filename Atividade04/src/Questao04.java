import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			String palavra = JOptionPane.showInputDialog("Digite a palavra de acesso");
			if (palavra.equals("Java-2021")) {
				JOptionPane.showMessageDialog(null, "Permissão: aprovada");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Tente novamente "+i+" tentativas");
			}
		}
	}

}
