package questao_07;

public class Quest07 {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Jaime");
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca Minicipal");
		
		biblioteca1.adicionarLivro("8572839046", "O Príncipe de Maquiavel");
		biblioteca1.adicionarUsuario(usuario1);		
		biblioteca1.listarLivros();
		biblioteca1.listarUsuarios();

	}

}
