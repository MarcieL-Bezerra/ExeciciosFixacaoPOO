package fixacaoexecicioseven;

public class Vendedor extends Funcionario {

	@Override
	public double bonificacao() {
		double valExtra = 3000.00;
		return getSalario() + valExtra;
	}

}
