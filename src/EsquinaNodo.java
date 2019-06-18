
public class EsquinaNodo {
	private int x;
	private int y;
	private static int id=0;
	
	public EsquinaNodo(int x, int y){
		this.x=x;
		this.y=y;
		EsquinaNodo.id++;
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

	public static int getId() {
		return id;
	}
	
	
	
}
