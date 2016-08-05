package br.com.dependencyinversionprinciple;

public class Tablet implements DispositivoOption {

	@Override
	public String ligar() {
		// TODO Auto-generated method stub
		String mensagem = "Ligando Tablet...";
		return mensagem;
	}

	@Override
	public String desligar() {
		// TODO Auto-generated method stub
		String mensagem = "Desligando Tablet...";
		return mensagem;
	}

}
