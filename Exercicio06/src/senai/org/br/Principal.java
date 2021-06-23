package senai.org.br;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		boolean repetir = true;
		do {
			try {
				Pessoa p1 = new Pessoa();
				p1.setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
				DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				p1.setDataNascimento(LocalDate.parse(
						JOptionPane.showInputDialog("Digite sua Data de Nascimento no formato DD/MM/AAAA:"),
						formatoData));
				p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura:").replace(",", ".")));
				JOptionPane.showMessageDialog(null, p1.dados());
				repetir = false;
			} catch (NumberFormatException e) {				
				System.err.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Valor numerico invalido!");
			} catch (DateTimeParseException e) {
				System.err.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Data de Nascimento invalida!");
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Algo deu errado");
			}
		} while (repetir);

//		Pessoa dadosPessoa = new Pessoa(nome, dataNasc, altura);

	}

}
