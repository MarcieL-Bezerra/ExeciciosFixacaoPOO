package fixacaoexeciciothree;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> Magia;

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level,List<String> Magia) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.setMagia(Magia);

	}

	public List<String> getMagia() {
		return Magia;
	}

	public void setMagia(List<String> magia) {
		Magia = magia;
	}

	@Override
	public void lvlUp() {
		this.setMana(this.getMana() + 1);
		this.setInteligencia(this.getInteligencia() + 1);
		System.out.println("Subiu de nível mana agora é " + this.getMana() + " e inteligência agora é " + this.getInteligencia());
	}

	public void attack() {
		Random gerado = new Random();
		System.out.println("Ataque: " + (this.getInteligencia()*this.getLevel() + gerado.nextInt(300)));

	}

	public void aprendeMagia(String magia) {
		this.Magia.add(magia);
		System.out.println(this.getMagia());

	}
}
