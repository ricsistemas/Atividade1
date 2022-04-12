package soma.opet;

public class Tarefa extends Thread{
private int matrix[][];
private int linha;
	public Tarefa(int m[][],int l ) {
		this.matrix =m;
		this.linha = l;
	}
		
private int GetSoma() {
	  int valorsoma = 0;
      for (int i = 0; i < matrix[linha].length; i++) {
    	  valorsoma+=matrix[linha][i];
      }	
return valorsoma;	
	
}
	
public void run() {
	
   System.out.println(this.getName()+ " linha:" + linha + " Soma: "+GetSoma()+   "\n");
   }
}	
	
	
	
