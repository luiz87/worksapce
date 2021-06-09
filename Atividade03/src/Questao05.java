import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas tabalhado"));
		Float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora"));
		Float salario = valorHora * horas;
		JOptionPane.showInternalMessageDialog(null, "O salário do funcionário é: "+salario);
	}

}
