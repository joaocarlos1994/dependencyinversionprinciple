package br.com.dependencyinversionprinciple2;

public class Tablet implements Dispositivo {

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.print("Ligando o tablet.\n");

	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.print("Desligar o tablet.\n");
	}

	@Override
	public void reiniciar() {
		// TODO Auto-generated method stub
		System.out.print("Reiniciando o tablet.\n");

	}

}
