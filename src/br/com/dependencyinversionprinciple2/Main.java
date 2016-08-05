package br.com.dependencyinversionprinciple2;

import java.awt.List;
import java.util.ArrayList;

import br.com.dependencyinversionprinciple.Button;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tablet tablet = new Tablet();
		Telefone telefone = new Telefone();
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.adicionarDispositivo(telefone);
		pessoa.adicionarDispositivo(tablet);
		
		
		for (Dispositivo dispositivo : pessoa.getDispositivo()) {
			dispositivo.ligar();
			dispositivo.desligar();
		}
		
		
	}

}
