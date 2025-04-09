package questao_01;

public class Quest01 {

	public static void main(String[] args) {
		Empresa empresa1 = new Empresa("09.827.972/0001-29", "Dog Rações LTDA");
		Empresa empresa2 = new Empresa("22.381.284/0001-46", "Importador Amanda SA");
		
		Funcionario funcionario1 = new Funcionario(900, "Jaime");
		Funcionario funcionario2 = new Funcionario(345, "Ana");
		Funcionario funcionario3 = new Funcionario(386, "Lucas");
		
		empresa1.contratarFuncionario(funcionario1);
		empresa1.contratarFuncionario(funcionario2);
		empresa2.contratarFuncionario(funcionario3);
		
		empresa1.listarFuncionarios();
		empresa1.demitirFuncionario(funcionario2);
		empresa1.listarFuncionarios();
		
		
	}

}
