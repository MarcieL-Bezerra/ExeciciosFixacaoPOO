package fixacaoexeciciotwomodel;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	List<Livro> livros = new ArrayList<>();
	List<VideoGame> videoGames = new ArrayList<>();
			
	Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.setLivros(livros);
		this.setVideoGames(videoGames);
		
	}
	
	public void listaLivros() {
		System.out.println("\n-------------------------------------------\n");
		if (livros.size()==0) {
			System.out.println("A loja " + this.getNome() + " não tem livros no estoque");
		}else {
			System.out.println("A loja " + this.getNome() + " possui estes livros para venda");
			for (int i =0; i<livros.size();i++) {
				System.out.print("Titulo: " + livros.get(i).getNome());
				System.out.print(" , preço: " + livros.get(i).getPreco());
				System.out.print(" , quantidade: " + livros.get(i).getQtd() + " em estoque.\n");
				
			}
		}
		
	}
	public void listaVideoGames() {
		System.out.println("\n-------------------------------------------\n");
		if (videoGames.size()==0) {
			System.out.println("A loja " + this.getNome() + " não tem video-games no estoque");
		}else {
			for (int i =0; i<videoGames.size();i++) {
				System.out.print("Titulo: " + videoGames.get(i).getNome());
				System.out.print(" , preço: " + videoGames.get(i).getPreco());
				System.out.print(" , quantidade: " + videoGames.get(i).getQtd() + " em estoque.\n");
				
			}
		}
		
	}
	public double calculaPatrimonio() {
		double patrimonio = 0;
		for (int i =0; i<videoGames.size();i++) {
			patrimonio = patrimonio + videoGames.get(i).getPreco() * videoGames.get(i).getQtd();
		}
		for (int i =0; i<livros.size();i++) {
			patrimonio = patrimonio + livros.get(i).getPreco() * livros.get(i).getQtd();
		}
		
		System.out.println("O patrimonio da loja: " + this.getNome() + " é de R$ " + patrimonio);
		return patrimonio;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	
	
	}


