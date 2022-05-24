package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato eduardo = new Gato();
		eduardo.setCor("Branquelo");
		eduardo.setIdade(26);
		eduardo.setNome("Vc ja sabe");
		System.out.println(eduardo);
	}
}
