package com.exemplo.laboratorio;

public class Cap6_Lab3 {

	public static void main(String[] args) {
		ClasseAluno joao = new ClasseAluno();
		joao.setNome("joao");
		joao.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("contagem no objeto joao: " + joao.contadorDeAlunos + " \n ");
		ClasseAluno maria = new ClasseAluno();
		maria.setNome("maria");
		maria.contadorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("contagem no objeto maria: " + maria.contadorDeAlunos + " \n ");
		ClasseAluno marcos = new ClasseAluno();
		marcos.setNome("marcos");
		marcos.contadorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println("contagem no objeto marcos: " + marcos.contadorDeAlunos + " \n ");
		System.out.println("Contador acessado diretamente da classe: " + ClasseAluno.contadorDeAlunos);
	}

}