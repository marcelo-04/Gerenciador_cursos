package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		
	
		
		Set<String> nome = Collections.emptySet();
		Set alunos = null;
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		
		nome.add("Paulo");//o que acontece aqui?
	}

}

