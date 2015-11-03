package granjro;

import aima.search.framework.*;/**encargado de todo

 *INTERFAZ La clase principal  implementa esta interfaz
*/
public interface Juego{
	
	/**
	 * Se genera un problema para este juego tal y como lo quiere AIMA
	 * @return Problem. el problema a solucionar.
	 * @throws Exception si hay algun problema al generar el juego con los datos de partida
	 */
	public Problem dameJuego() throws Exception;
	

	/**
	 * Dependiendo de la forma del arbol o de la heuristica, se sabe si puede ser resuelto o no
	 * con un determinado cosito.
	 * @param e la estrategia a usar.
	 * @return si es posible encontrar la solucion
	 */
	public boolean esPosibleSolucion(Estrategia e);
}

