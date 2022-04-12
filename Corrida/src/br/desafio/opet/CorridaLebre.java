package br.desafio.opet;

public class CorridaLebre extends Thread {

	private Posicao posicao;
	private int distancia = 0;
	private int saltos = 0;
	private int ordemchegada;
	

	private boolean chegou = false;

	public CorridaLebre(String name, Posicao posicao) {
		super(name);
		this.posicao = posicao;

	}

	public boolean Pule() {

		if (chegou)
			return false;

		int min = 1;
		int max = 3;
		int numAleatorio = (int) (Math.random() * max + 1 - min) + min;
		distancia += numAleatorio;
		setSaltos(getSaltos() + 1);
		if (distancia > 19) {
			chegou = true;
			posicao.increment();
			
			String msg = "Thread " + getName() + " Distância = " + getDistancia() + " Saltos = " + getSaltos()
					+ " Chegou :" + posicao.getValue();
				if (posicao.value.get() == 1)
			
			{
				msg += "  ***** Vencedor *****";
			}
			System.out.println(msg);
			setOrdemchegada(posicao.value.get());

			return distancia > 19;

		}
		return true;
	}

	public void run() {

		while (Pule()) {

			try {
				sleep(50);
				System.out.println("Thread " + getName() + " Descansando");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread " + getName() + " Pulou á " + getDistancia());
		}

	}

	int getDistancia() {
		// TODO Auto-generated method stub
		return distancia;
	}

	public int getSaltos() {
		return saltos;
	}

	public void setSaltos(int saltos) {
		this.saltos = saltos;
	}

	public int getOrdemchegada() {
		return ordemchegada;
	}

	public void setOrdemchegada(int ordemchegada) {
		this.ordemchegada = ordemchegada;
	}

}