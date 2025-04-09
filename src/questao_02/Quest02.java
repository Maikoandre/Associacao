package questao_02;

public class Quest02 {

	public static void main(String[] args) {
		ObraDeArte obra1 = new ObraDeArte("Monalisa", "Leonardo da Vinci", 1503);
		Exposicao exposicao1 = new Exposicao("Pinturas Italianas");
		Museu museu1 = new Museu("Louvre");
		
		exposicao1.setObrasDeArte(obra1);
		museu1.setExposicao(exposicao1);
		museu1.listarExposicoes(exposicao1);
	}

}
