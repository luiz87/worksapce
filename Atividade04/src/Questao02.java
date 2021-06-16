import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número"));
		
		String msg = "O maior número é ";
		if(n1 > n2) {
			msg = msg + n1;
		} else if(n2 > n1) {
			msg = msg + n2;
		} else {
			msg = "Os número são iguais";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
