package questao_07;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private List<Livro> livros;
	private List<Usuario> usuarios;
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.livros = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void adicionarLivro(String ISBN, String titulo) {
		livros.add(new Livro(ISBN, titulo));
	}
	
	public void removerLivro(Livro livro) {
		livros.remove(livro);
	}
	
	public Livro buscarLivro(String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		return null;
	}
	
	public void emprestarLivro(String titulo, Usuario usuario) {
		Livro livro = buscarLivro(titulo);
		if(livro != null && !livro.isEmprestado()) {
			livro.emprestar();
			System.out.println("O livro " + livro.getTitulo() + " foi emprestado para " + usuario.getNome());
		}else {
			System.out.println("Livro não disponivel");
		}
	}
	
	public void devolverLivro(Livro livro) {
		livro.devolver();
		System.out.println("O livro " + livro.getTitulo() + " foi devolvido.");
		
	}
	
	public void listarLivros() {
		System.out.println("Acervo da biblioteca " + this.nome);
		for(Livro livro : livros) {
			System.out.println(" - " + livro);
		}
	}
	
	public void listarUsuarios() {
		System.out.println("Usuários cadastrados: ");
		for(Usuario user : usuarios) {
			System.out.println(" - " + user);
		}
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void adicionarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void removerUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	
}
