package granjro;

import aima.search.framework.GoalTest;//llamar de la lib aima las funciones de si es el estado final

public class GranjeroGoalTest implements GoalTest{

	public boolean isGoalState(Object s) {
		GranjeroEstado e = (GranjeroEstado)s;
		return ((e.barca)&&(e.cabra)&&(e.col)&&(e.lobo));
	}

}
