import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero"));
		
		String msg = "O maior n�mero � ";
		if(n1 > n2) {
			msg = msg + n1;
		} else if(n2 > n1) {
			msg = msg + n2;
		} else {
			msg = "Os n�mero s�o iguais";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
