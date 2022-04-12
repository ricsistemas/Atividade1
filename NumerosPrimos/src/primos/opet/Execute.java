package primos.opet;

public class Execute {

	public static void main(String[] args) {
	 
		int vl_inicial =1000;
		int vl_final=2000;
		int incremento = 1000;
		for(int i=0;i<=10;i++ ) {
			Thread tarefa = new Tarefa(vl_final,vl_inicial);
			tarefa.start();
			vl_inicial+=incremento;
			vl_final+=incremento;
		
		}
		
	}

}
