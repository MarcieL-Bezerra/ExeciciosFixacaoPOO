package fixacaoexecicioseven;

public class Gerente extends Funcionario{
	
	
	@Override
	public double bonificacao() {
		double valExtra = 10000.00;
		return getSalario() + valExtra;
	}


	
	
	
	

}
