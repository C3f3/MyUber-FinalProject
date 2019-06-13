
public class Ciudad {
	private int r;
	private int c;
	private Manzana[] cantsCuadras;
	public Ciudad(int r, int c, Manzana[] cantsCuadras) {
		this.r = r;
		this.c = c;
		this.cantsCuadras=new  Manzana[r*c]; 
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
	public Object getCantsCuadras() {
		return cantsCuadras;
	}
	
	
	
	
	
}
