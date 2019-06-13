
public class Calle {
	private int id;
	private String sentido;

	public Calle(int id,String sentido) {
		super();
		this.id = id;
		this.sentido=sentido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}
	
	
}
