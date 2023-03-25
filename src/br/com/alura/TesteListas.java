package br.com.alura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteListas {

	public static void main(String[] args) {
		
		System.out.println("**** ArrayList vs LindedList ****");
		
		List<Integer> numerosArrayList = new ArrayList<>();
		List<Integer> numerosLinkedList = new LinkedList<>();
		int quantidadeElementos = 1000000;
		
		long tempoArrayList = insereElementosNo(numerosArrayList, quantidadeElementos);
		long tempoLinkedList = insereElementosNo(numerosLinkedList, quantidadeElementos);
		
		System.out.println("Inserção na ArrayList demorou "+ tempoArrayList);
		System.out.println("Inserção na LinkedList demorou "+ tempoLinkedList);
		
		tempoArrayList = removePrimeiroElementos(numerosArrayList);
		tempoLinkedList = removePrimeiroElementos(numerosLinkedList);
	}
	/**
	 * Removendo 100  elementos sempre na primeira posição
	 */
	private static long removePrimeiroElementos(List<Integer> numero) {
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 100; i++) {
			numero.remove(0); //Removendo sempre o primeiro elemento
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	private static long insereElementosNo(List<Integer> numero, int quantidade) {
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < quantidade; i++) {
			numero.add(i);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
}
