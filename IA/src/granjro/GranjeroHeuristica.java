package granjro;

import aima.search.framework.HeuristicFunction;

public class GranjeroHeuristica implements HeuristicFunction{

	public double getHeuristicValue(Object s) {
		GranjeroEstado estado = (GranjeroEstado)s;
		
		double count = 0.0;
		if (!estado.cabra)
			count += 1.0;
		if (!estado.col)
			count += 1.0;
		if (!estado.lobo)
			count += 1.0;
		if (estado.barca)
			count += 0.5;
		return count;//devuelve el valor de la funcion heu.. (h´)
	}
}
