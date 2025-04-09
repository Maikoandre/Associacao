package questao_01;
import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private String cnpj;
	private String nome;
	private List<Funcionario> funcionarios;
	
	public Empresa(String cnpj, String nome) {
		this.setCnpj(cnpj);
		this.setNome(nome);
		this.funcionarios = new ArrayList<>();
	}
	
	public void contratarFuncionario(Funcionario funcio) {
		if(funcionarios.contains(funcio)) {
			System.out.println("Funcionario já contratado.");
			return;
		}
		funcionarios.add(funcio);
	}
	
	public void demitirFuncionario(Funcionario funcio) {
		if(!funcionarios.contains(funcio)) {
			System.out.println("Funcionario não faz parte da empresa.");
		}
		funcionarios.remove(funcio);
	}
	
	public void listarFuncionarios() {
		System.out.println("Funcionarios da empresa " + nome);
		for(Funcionario func : funcionarios) {
			System.out.println(func.getNome());
		}
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
