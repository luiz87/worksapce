package senai.org.exemplo;

public class ExecutaExemplo {

	public static void main(String[] args) {
		// Criar o objeto do tipo da classe Carro
		Carro objCarro = new Carro();
		System.out.println(objCarro.marca);
		objCarro.buzina();
		System.out.println(objCarro.getModelo());
		
	}

}
