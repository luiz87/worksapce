import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float conta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta"));
		float garcom = conta * 0.1f;
		float total = conta + garcom;
		JOptionPane.showInternalMessageDialog(null, "10% do Garçom: "+garcom +"\nValor Final: "+total);
	}

}
