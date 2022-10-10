package empresa;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	
	private List<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda c) {
		listaMoedas.add(c);
	}
	
	public void remover(Moeda c) {
		listaMoedas.remove(c);
	}
	
	public void listar() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio!");
			System.out.println("---------------");
			System.out.println("Adicione uma moeda.");
			return;
		}
		
		for(Moeda c : listaMoedas) {
			System.out.println(c);
		}
	}
	
	public double valorConvertido(){ 
		double total = 0;
		for(Moeda moeda : listaMoedas) {
			total += moeda.converter();
		}
		return total;
	}	
}
