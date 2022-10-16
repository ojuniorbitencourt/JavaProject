package empresa;

public class Real extends Moeda {
	
	public Real(double valorInserido) {
		super(valorInserido);
	}

	@Override
	public void info() {
		System.out.println("Real: " + valor);
	}
	
	@Override
	public double converter() {
		return this.valor;
	}

	@Override
	public String toString() {
		return "Inserido R$ " + valor + " Reais.";
	}
}
