package br.com.dependencyinversionprinciple2;

public class Telefone implements Dispositivo {

	@Override
	public void ligar() {
		System.out.print("Ligando o telefone.\n");
	}

	@Override
	public void desligar() {
		System.out.print("Desligando o telefone.\n");
		// TODO Auto-generated method stub
	}

	@Override
	public void reiniciar() {
		System.out.print("Reiniciando o telefone.\n");
		// TODO Auto-generated method stub
	}

}
