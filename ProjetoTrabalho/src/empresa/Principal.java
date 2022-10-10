package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("Menu");
		System.out.println("1. Adicionar");
		System.out.println("2. Remover");
		System.out.println("3. Listar");
		System.out.println("4. Total Depositado");
		System.out.println("0. Encerrar");
		opcao = teclado.nextInt();
		
		double tipoMoeda;
		double valorInserido;
		Moeda m;
		
		while(opcao!=0) {
			switch(opcao) {
			case 1: //Método para adicionar moedas.
				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Escolha o tipo da moeda:");
					System.out.println("1. Dolar");
					System.out.println("2. Euro");
					System.out.println("3. Real");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("Digite o valor:");
				valorInserido = teclado.nextDouble();
				 m = null;
				 if(tipoMoeda == 1) {
					 m = new Dolar(valorInserido);
				 }
				 if(tipoMoeda == 2) {
					 m = new Euro(valorInserido);
				 }
				 if(tipoMoeda == 3) {
					 m = new Real(valorInserido);
				 }
				 cofrinho.adicionar(m);
				
				break;
			case 2: //Método para remover moedas.
				 tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Escolha o tipo da moeda:");
					System.out.println("1. Dolar");
					System.out.println("2. Euro");
					System.out.println("3. Real");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("Digite o valor:");
				valorInserido = teclado.nextDouble();
				 m = null;
				 if(tipoMoeda == 1) {
					 m = new Dolar(valorInserido);
				 }
				 if(tipoMoeda == 2) {
					 m = new Euro(valorInserido);
				 }
				 if(tipoMoeda == 3) {
					 m = new Real(valorInserido);
				 }
				 cofrinho.remover(m);
				
				break;
			case 3: //Método para listar moedas.
				cofrinho.listar();
				break;
			case 4: //Calcular valor total convertido para real.
				System.out.println("Total convertido para real: R$ " + cofrinho.valorConvertido());
				break;
			default:
				System.out.println("Opcao invalida!");
			}
			
			System.out.println("Menu");
			System.out.println("1. Adicionar");
			System.out.println("2. Remover");
			System.out.println("3. Listar");
			System.out.println("4. Total Depositado");
			System.out.println("0. Encerrar");
			opcao = teclado.nextInt();
		}
		System.out.println("Sistema finalizado!");
	}
}