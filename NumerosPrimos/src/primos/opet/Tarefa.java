package primos.opet;

public class Tarefa extends Thread {
	private int fim;
	private int inicio;
	public Tarefa(int fim, int inicio) {
		this.fim = fim;
		this.inicio = inicio;
	}
	
	
	public  boolean isPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
         }
        return true; 
	}

	
	public void run() {
		for (int i = inicio; i < fim; i++) {
	
	     if (isPrimo(i)) {		
			
			System.out.println(this.getName()+" primo: "+i+ "\n");
	     }
		
	
		
		}
	}

}
	

