package fixacaoexeciciotwomodel;

import fixacaoexeciciotwointerfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame() {
		
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQtd(qtd);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setUsado(isUsado);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		if (this.isUsado) {
			System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " usado, R$ " +  (this.getPreco()*0.25));
			return this.getPreco()*0.25;
		}else {
			System.out.println("Imposto " + this.getNome() + " " + this.getModelo() + " R$ " +  (this.getPreco()*0.45));
			return this.getPreco()*0.45;
		}
	}
	
	
	
	

}
