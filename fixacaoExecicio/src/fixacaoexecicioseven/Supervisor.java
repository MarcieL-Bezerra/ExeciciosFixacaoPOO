package fixacaoexecicioseven;

public class Supervisor extends Funcionario {

	@Override
	public double bonificacao() {
		double valExtra = 5000.00;
		return getSalario() + valExtra;
	}

}
