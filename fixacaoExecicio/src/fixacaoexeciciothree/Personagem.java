package fixacaoexeciciothree;

public class Personagem {
	private String Nome;
	private int Vida;
	private int Mana;
	private float Xp;
	private int Inteligencia;
	private int Forca;
	private int Level;
	static int QtdPersonagem = 0;

	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		this.setNome(nome);
		this.setVida(vida);
		this.setMana(mana);
		this.setXp(xp);
		this.setInteligencia(inteligencia);
		this.setForca(forca);
		this.setLevel(level);
		QtdPersonagem ++;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getVida() {
		return Vida;
	}

	public void setVida(int vida) {
		Vida = vida;
	}

	public int getMana() {
		return Mana;
	}

	public void setMana(int mana) {
		Mana = mana;
	}

	public float getXp() {
		return Xp;
	}

	public void setXp(float xp) {
		Xp = xp;
	}

	public int getInteligencia() {
		return Inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		Inteligencia = inteligencia;
	}

	public int getForca() {
		return Forca;
	}

	public void setForca(int forca) {
		Forca = forca;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	public void lvlUp() {

	}

}
