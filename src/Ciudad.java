
public class Ciudad {
	private int r;
	private int c;
	private Square [][] cuadras;
	private GrafoCiudad miCiudad;
	
	public Ciudad(int r, int c) {
		this.r = r;
		this.c = c;
		this.cuadras=new  Square[r][c];
		this.miCiudad=new GrafoCiudad(r,c);
	}
	public GrafoCiudad getGrafo() {
		return this.miCiudad;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void mostrarCuidad() {
		construirCiudad();
		miCiudad.muestraGrafo();
		posicionDeInicio(50,50);
		
	}
	private void construirCiudad() {
		int distanciax=0;
    	int distanciay=0;
		for(int i=0;i<this.r;i++){
    		for(int j=0;j<this.c;j++){
    			cuadras[i][j]=new Square();
    			cuadras[i][j].moveVertical(distanciay);
    			cuadras[i][j].moveHorizontal(distanciax);
    			cuadras[i][j].changeSize(20);
    			
    			cuadras[i][j].changeColor("green");
    			cuadras[i][j].makeVisible();
    			distanciax=distanciax+40;
    			
    		}
    		distanciay=distanciay+40;
    		distanciax=0;
    	}
		
		this.miCiudad.cargarGrafo();
		miCiudad.muestraFloyd();
		
	}
	public void posicionDeInicio(int x, int y) {
		
		Triangle persona=new Triangle();
   	 	persona.changeColor("red");
        persona.moveHorizontal(x);
        persona.moveVertical(y);
        persona.changeSize(10,10);
        persona.makeVisible();
	}
	
	public void muestraRecorrido(int ini, int fin) {
		this.miCiudad.muestraCaminoFloyd(ini,fin);
	}
	

	
}
