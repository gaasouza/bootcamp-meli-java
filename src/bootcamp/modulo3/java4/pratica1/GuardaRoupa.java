package bootcamp.modulo3.java4.pratica1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

	private Map<Integer, List<Vestuario>> dicionario = new HashMap<Integer, List<Vestuario>>();
	private Integer id;

	public GuardaRoupa() {
	}

	public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
		id = listaDeVestuario.hashCode();
		dicionario.put(id, listaDeVestuario);

		return id;
	}

	public void mostrarVestuarios() {
		System.out.println("Mostrando todos os itens dentro do guarda-roupa:");
		
		if(dicionario.isEmpty())
			System.out.println("Não há roupas no guarda-roupa.");

		Iterator<Map.Entry<Integer, List<Vestuario>>> i = dicionario.entrySet().iterator();

		while (i.hasNext()) {
			Map.Entry<Integer, List<Vestuario>> item = i.next();

			System.out.println("Código: " + item.getKey());

			item.getValue().forEach(v -> System.out.println(v.getModelo() + " - " + v.getMarca()));
		}
		System.out.println("");
	}

	public List<Vestuario> devolverVestuarios(Integer id) {
		List<Vestuario> listaDeVesturario = dicionario.get(id);
		dicionario.remove(id);
		return listaDeVesturario;
	}

}