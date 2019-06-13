
public class Esquina {
	private Calle callev,calleh;
	private int x,y;

	public Esquina(int x,int y,Calle callev,Calle calleh) {
		this.x=x;
		this.y=y;
		this.callev=callev;
		this.calleh=calleh;
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

	public Calle getCalleV() {
		return this.callev;
	}

	public void setCalleV(Calle callev) {
		this.callev = callev;
	}

	public Calle getCalleH() {
		return calleh;
	}

	public void setCalleH(Calle calle2) {
		this.calleh = calle2;
	}
	

}

