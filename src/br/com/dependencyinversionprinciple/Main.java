package br.com.dependencyinversionprinciple;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Button button = new Button();
		Sensor sensor = new Sensor();
		
		Celular celular = new Celular();
		Tablet tablet = new Tablet();
		
		System.out.println(pessoa.handlerEventLigar(celular));
		System.out.println(sensor.handlerEventDesligar(celular));

		System.out.println("\n");
		
		System.out.println(pessoa.handlerEventLigar(tablet));
		System.out.println(sensor.handlerEventDesligar(tablet));
		
	}

}
