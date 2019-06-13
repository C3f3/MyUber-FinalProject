
public class Manzana{
	private  Esquina EsqSupIzq,EsqSupDer,EsqInfDer,EsqInfIzq;
	private int id;
	
	
	
	public Manzana(int id,Esquina esqSupIzq, Esquina esqSupDer, Esquina esqInfDer, Esquina esqInfIzq ) {
		super();
		EsqSupIzq = esqSupIzq;
		EsqSupDer = esqSupDer;
		EsqInfDer = esqInfDer;
		EsqInfIzq = esqInfIzq;
		this.id = id;
	}
	public Esquina getEsqSupIzq() {
		return EsqSupIzq;
	}
	public void setEsqSupIzq(Esquina esqSupIzq) {
		EsqSupIzq = esqSupIzq;
	}
	public Esquina getEsqSupDer() {
		return EsqSupDer;
	}
	public void setEsqSupDer(Esquina esqSupDer) {
		EsqSupDer = esqSupDer;
	}
	public Esquina getEsqInfDer() {
		return EsqInfDer;
	}
	public void setEsqInfDer(Esquina esqInfDer) {
		EsqInfDer = esqInfDer;
	}
	public Esquina getEsqInfIzq() {
		return EsqInfIzq;
	}
	public void setEsqInfIzq(Esquina esqInfIzq) {
		EsqInfIzq = esqInfIzq;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
