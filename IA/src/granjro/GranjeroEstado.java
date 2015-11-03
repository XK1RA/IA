package granjro;

public class GranjeroEstado {

	public boolean barca;
	public boolean cabra;
	public boolean lobo;
	public boolean col;

	public GranjeroEstado(boolean b, boolean cab, boolean lob, boolean c){
		barca = b;
		cabra = cab;
		lobo = lob;
		col = c;
	}
	
	 public boolean isValid(){
		 if ((cabra == lobo) && (barca != cabra))
			return false;
		 if ((cabra == col) && (barca != cabra))
			return false;
		 return true;
	}
	 
		public String getDescripcion() {
			String izq = "[";
			String der = " [";

			if (!barca)
				izq += "barca ";
			else
				der += "barca ";

			if (!cabra)
				izq += "cabra ";
			else
				der += "cabra ";

			if (!lobo)
				izq += "lobo ";
			else
				der += "lobo ";

			if (!col)
				izq += "col ";
			else
				der += "col ";

			izq = izq + "]" + der +"]";

			return izq;
		}

		public String toString(){
			return getDescripcion();
		}
		
		
		public boolean equals(GranjeroEstado e){
			return (this.barca == e.barca) && (this.cabra==e.cabra) &&
				   (this.col == e.col)     && (this.lobo==e.lobo);
		}
}
//http://www.cs.upc.edu/~luigi/MTI/AI-2008-fall/lab/lab-2-solving-problems-by-searching-(us).pdf