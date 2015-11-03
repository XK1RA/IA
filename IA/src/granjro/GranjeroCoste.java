package granjro;

import aima.search.framework.StepCostFunction;//encargada del costo del paso de nodo a nodo

public class GranjeroCoste implements StepCostFunction{

	public Double calculateStepCost(Object org, Object des, String arg2) {
		GranjeroEstado origen = (GranjeroEstado) des;
		
		return 1.0;
 	}

}