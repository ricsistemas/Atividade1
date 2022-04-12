package br.desafio.opet;

import java.util.concurrent.atomic.AtomicInteger;

public class Execute {

	public static void main(String[] args) throws InterruptedException {

		int maxThread = 5;

		Posicao posicao = new Posicao(new AtomicInteger(0));
		CorridaLebre[] corredores = new CorridaLebre[5];

		new CorridaLebre("1", posicao);
		for (int i = 0; i < maxThread; i++) {
			corredores[i] = new CorridaLebre("#" + i, posicao);
			corredores[i].start();
		}
		for (int i = 0; i < maxThread; i++) {
			corredores[i].join();

		}

		System.out.println("**************************************************************");
		for (int i = 0; i < maxThread; i++) {

			String msg = "Thread " + corredores[i].getName() + " Distância = " + corredores[i].getDistancia() + " Saltos = " + corredores[i].getSaltos()
			+ " Chegou :" +corredores[i].getOrdemchegada();
	if (corredores[i].getOrdemchegada()== 1)
		msg += "  ***** Vencedor *****";
	System.out.println(msg);
			

		}
		System.out.println("**************************************************************");
		
	}

}