package br.com.dependencyinversionprinciple2;

import java.util.ArrayList;
import java.util.Collection;

public class Pessoa {
	
	private final Collection<Dispositivo> listDispositivo;

	public Pessoa() {
		super();
		this.listDispositivo = new ArrayList<>();
	}

	public Collection<Dispositivo> getDispositivo() {
		return listDispositivo;
	}
	
	public void adicionarDispositivo(Dispositivo dispositivo){
		this.listDispositivo.add(dispositivo);
	}
	
}
