package fixacaoexeciciotwomodel;

import fixacaoexeciciotwointerfaces.Imposto;

public class Livro extends Produto implements Imposto{
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro() {
		
	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQtd(qtd);
		this.setAutor(autor);
		this.setTema(tema);
		this.setQtdPag(qtdPag);
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		if (this.getTema() == "educativo") {
			System.out.println("Livro educativo não tem imposto: " + this.getNome());
			return this.getPreco();
		}else {
			System.out.println("R$ " + (this.getPreco()*0.1) + " de impostos sobre o livro " + this.getNome());
			return this.getPreco()*0.1;
		}
	}
	
	
	

	
	

	
	
	
	
	
	
	
	

}
