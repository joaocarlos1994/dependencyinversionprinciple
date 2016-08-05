package br.com.dependencyinversionprinciple;

public class Celular implements DispositivoOption {
	

	@Override
	public String ligar() {
		String mensagem = "Ligando celular";
		return mensagem;
	}

	@Override
	public String desligar() {
		String mensagem = "Desligando celular";
		return mensagem;
	}

}
