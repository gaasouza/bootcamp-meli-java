package bootcamp.modulo3.java4.pratica1;

import java.util.Arrays;
import java.util.List;

public class Programa {
	public static void main(String[] args) {

		GuardaRoupa guardaRoupa = new GuardaRoupa();

		Vestuario v1 = new Vestuario("Nike", "Jordan");
		Vestuario v2 = new Vestuario("Adidas", "Super-Stars");
		Vestuario v3 = new Vestuario("Piticas", "Camisa Marvel");
		Vestuario v4 = new Vestuario("Hering", "Calça Jeans");

		List<Vestuario> listaDeVesturios = Arrays.asList(v1, v2, v3, v4);
		
		System.out.println("Guardando roupas...");
		Integer identificador = guardaRoupa.guardarVestuarios(listaDeVesturios);
		System.out.println("Código identificador das roupas: " + identificador);
		System.out.println("");
		
		guardaRoupa.mostrarVestuarios();
		
		System.out.println("Retirando roupas do guarda-roupa: ");
		listaDeVesturios = guardaRoupa.devolverVestuarios(identificador);
		
		if(listaDeVesturios.equals(null) || listaDeVesturios.isEmpty()) {
			System.out.println("Não há roupas no guarda-roupa de acordo com o Identificador informado.");
		}
		else {
			System.out.println("Roupas retiradas: ");
			listaDeVesturios.forEach(v -> System.out.println(v.getModelo() + " - " + v.getMarca()));
		}		
		
		System.out.println("");
		guardaRoupa.mostrarVestuarios();

	}
}
