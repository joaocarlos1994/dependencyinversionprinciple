package br.com.dependencyinversionprinciple;

public interface HandlerEvent {
	
	public String handlerEventLigar(DispositivoOption dispositivoOption);
	public String handlerEventDesligar(DispositivoOption dispositivoOption);
}
