package questao_02;

public class ObraDeArte {
	private String nome;
	private String artista;
	private int anoCriacao;
	
	public ObraDeArte(String nome, String artista, int anoCriacao) {
		this.nome = nome;
		this.artista = artista;
		this.anoCriacao = anoCriacao;
	}

	public String getNome() {
		return nome;
	}

	public String getArtista() {
		return artista;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}
}
