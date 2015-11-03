package granjro;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import granjro.Granjero;

import aima.search.framework.Successor;
import aima.search.framework.SuccessorFunction;

public class GranjeroSucesor implements SuccessorFunction {

	public List getSuccessors(Object e) {
		
		GranjeroEstado estado =(GranjeroEstado) e;
		
        List<Successor> successores = new ArrayList<Successor>();
        GranjeroEstado nuevo;
        String operador = "";
	 	 
		nuevo = new GranjeroEstado(!estado.barca, estado.cabra, estado.lobo, estado.col);
		if (nuevo.isValid()){
            operador = "Cruza Barca";
			successores.add(new Successor(operador ,nuevo));}

		if (estado.barca == estado.cabra){
			nuevo =   new GranjeroEstado(!estado.barca, !estado.cabra, estado.lobo, estado.col);
			if (nuevo.isValid()){
				operador = "Cruza Cabra";
                successores.add(new Successor(operador ,nuevo));}
		}
		if (estado.barca ==  estado.lobo){
			nuevo =   new GranjeroEstado(!estado.barca, estado.cabra, !estado.lobo, estado.col);
			if (nuevo.isValid()){
				operador = "Cruza Lobo";
				successores.add(new Successor(operador ,nuevo));}
		}
		if (estado.barca ==  estado.col){
			nuevo =   new GranjeroEstado(!estado.barca, estado.cabra, estado.lobo, !estado.col);
			if (nuevo.isValid()){
				operador = "Cruza Col";
				successores.add(new Successor(operador ,nuevo));}
		}
      return successores;
   }

}