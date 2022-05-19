package fixacaoexeciciothree;

import java.util.ArrayList;
import java.util.List;

public class ThreeMain {

	public static void main(String[] args) {
		List<String> mag = new ArrayList<>();
		List<String> habil = new ArrayList<>();
		
		mag.add("fogo");
		habil.add("pula");
		
		Mago m1 = new Mago("Joao", 3, 2,4,5,2, 8, mag);
		Guerreiro g1 = new Guerreiro("Jane", 3, 2,4,5,2, 8, habil);
		
		m1.attack();
		g1.attack();
		
		m1.lvlUp();
		g1.lvlUp();
		
		m1.aprendeMagia("Vento");
		g1.aprendeHabilidade("soco");
		
		System.out.println("Foram criados " + Personagem.QtdPersonagem + " personagens");
		

	}

}
