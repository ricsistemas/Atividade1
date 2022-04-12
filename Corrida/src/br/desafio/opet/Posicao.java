package br.desafio.opet;

import java.util.concurrent.atomic.AtomicInteger;

public class Posicao {
	 AtomicInteger value = new AtomicInteger(1);
	 

	 public Posicao(AtomicInteger i) {
	     this.value = i;
	 }

	 public void increment() {
	     value.incrementAndGet();
	 }

	 public void decrement() {
	     value.getAndDecrement();
	 }

	 public AtomicInteger getValue() {
	     return value;
	 }


	 }

