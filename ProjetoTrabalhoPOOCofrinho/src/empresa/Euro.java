package empresa;

public class Euro extends Moeda {
	
	public Euro(double valorInserido) {
		super(valorInserido);
	}

	@Override
	public void info() {
		System.out.println("Euro: " + valor);
	}
	
	@Override
	public double converter() {
		double total = valor*5;
		return total;
	}

	@Override
	public String toString() {
		return "Inserido $ " + valor + " Euros. Equivale a R$ " + converter() + " Reais.";
	}
}
