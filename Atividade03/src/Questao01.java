import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número."));
			int n1 = num -1;
			int n2 = num +1;
//			String x = null;
//			System.out.println(x.strip());
			JOptionPane.showMessageDialog(null, "Os vizinhos são "+n1+" e "+n2);	
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Número inválido");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Deu algum erro!");
			e.printStackTrace();
		}
		
	}

}
