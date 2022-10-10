package empresa;

public class Dolar extends Moeda{

	public Dolar(double valorInserido) {
		super(valorInserido);
	}

	@Override
	public void info() {
		System.out.println("Dolar: " + valor);
	}
	
	@Override
	public double converter() {
		double total = valor*5; //return this.valor * 5; Ao invés de criar a variável total.
		return total;
	}

	@Override
	public String toString() {
		return "Inserido $ " + valor + " Dolares. Equivale a R$ " + converter() + " Reais.";
	}
}
