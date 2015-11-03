package granjro;

//NO QUIERE LEER LA LIB AIMA

import aima.search.framework.Problem;


import granjro.*;

/**
 * 
 * Un granjero tiene que pasar una col o lechuga, una cabra u obeja y un lobo al otro lado del rio:
 * el granjero es el unico que puede conducir la barca
 * en la barca solo caben dos tripulanes (la col es muy grande y cuenta como uno)
 * la oveja se comera la col si el granjero no esta presente
 * el lobo se comera a la oveja si el granjero no esta presente
 * 
 */
public class Granjero implements Juego {

public Problem dameJuego() throws Exception {
	
	return new Problem (new GranjeroEstado(false,false,false,false),
			           new GranjeroSucesor(), 
			           new GranjeroGoalTest(), 
			           new GranjeroCoste(),
						new GranjeroHeuristica());
	}

	public boolean esPosibleSolucion(Estrategia e) {
		if (e == Estrategia.PrimeroProfundidad)  // este contiene ciclos
			return false;
		else 
			return true;
	}
	public String toString(){
		return "Granjero";
	}
}