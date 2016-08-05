package br.com.dependencyinversionprinciple;

public class Sensor implements HandlerEvent {

	@Override
	public String handlerEventLigar(DispositivoOption dispositivoOption) {
		String mensagem = dispositivoOption.ligar();
		return mensagem;
	}

	@Override
	public String handlerEventDesligar(DispositivoOption dispositivoOption) {
		String mensagem = dispositivoOption.desligar();
		return mensagem;
	}

}
