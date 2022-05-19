package fixacaoexeciciofour;

import java.util.ArrayList;
import java.util.List;

public class MainPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);
		int maisIdade;
		
	List<Pessoa> pessoas = new ArrayList<>();
	
	pessoas.add(p1);
	pessoas.add(p2);
	pessoas.add(p3);
	pessoas.add(p4);
	
	
	
	maisIdade = pessoas.get(0).getIdade();
	for (int i = 0; i < pessoas.size(); i++) {
		if (pessoas.get(i).getIdade() > maisIdade) {
				maisIdade = pessoas.get(i).getIdade();
				System.out.println("A pessoa mais velha é " + pessoas.get(i).getNome() + " com a idade de " + pessoas.get(i).getIdade());
				
				}
		
		}
	
	}
}
