package fixacaoexecicioseven;

public class SevenMain {

	public static void main(String[] args) {
		Gerente g1 =  new Gerente();
		g1.setNome("Marciel");
		g1.setIdade(38);
		g1.setSalario(20500.00);
		System.out.println("Olá Gerente " + g1.getNome() +", Esse mês voccê recebe "+ g1.bonificacao());
		
		Supervisor s1 =  new Supervisor();
		s1.setNome("Joaquim");
		s1.setIdade(29);
		s1.setSalario(10500.00);
		System.out.println("Olá Supervisor " + s1.getNome() +", Esse mês voccê recebe "+ s1.bonificacao());
		
		Vendedor v1 =  new Vendedor();
		v1.setNome("Jane");
		v1.setIdade(24);
		v1.setSalario(5500.00);
		System.out.println("Olá Vendedor " + v1.getNome() +", Esse mês voccê recebe "+ v1.bonificacao());
		
		

	}

}
