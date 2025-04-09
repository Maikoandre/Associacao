package questao_05;

public class Quest05 {
	public static void main(String[] args) {
		Medico medico1 = new Medico("José", "Acupuntura");
		Departamento departamento1 = new Departamento("Apoio Terapêutico");
		Hospital hospital1 = new Hospital("Gertúlio Vargas");
		
		departamento1.adicionarMedico(medico1);
		hospital1.adicionarDepartamento(departamento1);
		hospital1.exibirDepartamentos();
	}
}
