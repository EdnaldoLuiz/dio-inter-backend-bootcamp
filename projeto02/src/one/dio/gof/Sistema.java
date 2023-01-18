package one.dio.gof;

import one.dio.gof.estrategy.Comportamento;
import one.dio.gof.estrategy.ComportamentoAgressivo;
import one.dio.gof.estrategy.ComportamentoDefensivo;
import one.dio.gof.estrategy.ComportamentoNormal;
import one.dio.gof.estrategy.Robo;
import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;

public class Sistema {

	public static void main(String[] args) {
	
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Estrategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo roboMaluco = new Robo();
		roboMaluco.setComportamento(defensivo);
		roboMaluco.moverSe();
		roboMaluco.setComportamento(normal);
		roboMaluco.moverSe();
		roboMaluco.moverSe();
		roboMaluco.setComportamento(agressivo);
		roboMaluco.moverSe();
		roboMaluco.moverSe();
		roboMaluco.moverSe();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Luiz", "23454-323");
		

	}

}
