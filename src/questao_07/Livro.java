package questao_07;

public class Livro {
	private String ISBN;
	private String titulo;
	
	private boolean emprestado;
	
	public Livro(String ISBN, String titulo) {
		this.setISBN(ISBN);
		this.setTitulo(titulo);
		this.emprestado = false;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean isEmprestado() {
		return emprestado;
	}
	
	public void emprestar() {
		this.emprestado = true;
	}
	
	public void devolver() {
		this.emprestado = false;
	}
	@Override
	public String toString() {
		return titulo + "(ISBN: " + ISBN + ")" + (emprestado ? "[Emprestado]" : "[Disponível]");
	}
	
}
