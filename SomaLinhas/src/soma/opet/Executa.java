package soma.opet;

public class Executa {

	public static void main(String[] args) {

		int numeros[][] = new int[][] { { 1 }, { 1, 1 }, { 1, 1, 1 }, { 2, 1, 1 }, { 4, 1 } };

		for (int linha = 0; linha <= 4; linha++) {
			Tarefa tarefa = new Tarefa(numeros, linha);
			tarefa.start();
		}

	}

}
