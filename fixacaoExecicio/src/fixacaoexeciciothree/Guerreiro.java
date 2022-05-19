package fixacaoexeciciothree;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	private List<String> Habilidade;

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> Habilidade) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.setHabilidade(Habilidade);

	}

	public List<String> getHabilidade() {
		return Habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		Habilidade = habilidade;
	}

	@Override
	public void lvlUp() {
		this.setVida(this.getVida() + 1);
		this.setForca(this.getForca() + 1);		
		System.out.println("Subiu de nível vida agora é " + this.getVida() + " e força agora é " + this.getForca());
	}

	public void attack() {
		Random gerado = new Random();
		System.out.println("Ataque: " + (this.getForca()*this.getLevel() + gerado.nextInt(300)));

	}

	public void aprendeHabilidade(String habilidade) {
		this.Habilidade.add(habilidade);
		System.out.println(this.getHabilidade());

	}

}
