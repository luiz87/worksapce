package senai.org.exemplo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		
		LocalDate diaAtual = LocalDate.now();
		System.out.println(diaAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println(horaAtual);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(diaAtual.format(dtf));
		
		Cao objCao = new Cao();
		Gato objGato = new Gato();
//		Animal objAnimal = new Animal();
		
		objCao.somAnimal();
		objGato.somAnimal();
		objGato.dormindo();
//		objAnimal.somAnimal();
	}

}
