import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota final"));
		
		String status = "";
		if(nota >= 7) {
			status = "aprovado";
		} else if ( nota >= 4 && nota < 7) {
			status = "de recuperação";
		} else {
			status = "reprovado";
		}
		
		JOptionPane.showMessageDialog(null, "O aluno "+nome+" esta "+status+" com a nota "+ nota);
		
	}

}
