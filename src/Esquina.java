
public class Esquina {
	private Calle calle1,calle2;
	private int x,y;

	public Esquina(int x,int y,Calle calle1,Calle calle2) {
		this.x=x;
		this.y=y;
		this.calle1=calle1;
		this.calle2=calle2;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Calle getCalle1() {
		return calle1;
	}

	public void setCalle1(Calle calle1) {
		this.calle1 = calle1;
	}

	public Calle getCalle2() {
		return calle2;
	}

	public void setCalle2(Calle calle2) {
		this.calle2 = calle2;
	}
	

}

