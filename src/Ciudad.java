
public class Ciudad {
	private int r;
	private int c;
	private Manzana[][] cantsCuadras;
	public Ciudad(int r, int c, Manzana[] cantsCuadras) {
		this.r = r;
		this.c = c;
		this.cantsCuadras=new  Manzana[r][c]; 
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
	private void ConstruirCiudad(Manzana[][] cuadras){
		Calle csup, cinf, cder, cizq;
		
		Esquina e1,e2,e3,e4;
		
		int contcl=1;
		int contcd=1;
	
		for(int i=0;i<this.cantsCuadras.length;i++){
			for(int j=0;j<this.cantsCuadras.length;i++){
				if(i==0 && j==0){
					
					csup=new Calle(contcl,"derecha");
					contcl=contcl+1;
					cder=new Calle(contcl,"inferior");
					contcl=contcl+1;
					cinf=new Calle(contcl,"izquierda");
					contcl=contcl+1;
					cizq=new Calle(contcl,"superior");
					contcl=contcl+1;
					
					e1=new Esquina(i,j,csup,cizq);
					e2=new Esquina(i,j+1,csup,cder);
					e3=new Esquina(i+1,j+1,cinf,cder);
					e4=new Esquina(i+1,j,cinf,cizq);
					
					cuadras[i][j]=new Manzana(contcd,e1,e2,e3,e4);
					contcd=contcd+1;
				}
				else{
					if(i==0){
						e1=cuadras[i][j-1].getEsqSupDer();
						e4=cuadras[i][j-1].getEsqInfDer();
						
						/*creo la esquina superior derecha*/
						if(cuadras[i][j-1].getEsqSupIzq().getCalleV().getSentido()=="inferior"){
							cder=new Calle(contcl,"superior");
						}
						else
							cder=new Calle(contcl,"inferior");
						e2=new Esquina(i,j+1,cuadras[i][j-1].getEsqSupDer().getCalleH(),cder);
						contcl=contcl+1;
						
						/*creo la esquina inferior derecha*/
						e3=new Esquina(i+1,j+1,e2.getCalleV(),e4.getCalleH());
						
						cuadras[i][j]=new Manzana(contcd,e1,e2,e3,e4);
						contcd=contcd+1;
					}
					else{
						if(j==0){
							e1=cuadras[i-1][j].getEsqInfIzq();
							e2=cuadras[i-1][j].getEsqInfDer();
							if(cuadras[i-1][j].getEsqSupDer().getCalleH().getSentido()=="derecha")
								cinf=new Calle(contcl,"izquierda");
							else
								cinf=new Calle(contcl,"derecha");
							e3=new Esquina(i,j+1,cuadras[i][j-1].getEsqSupDer().getCalleH(),cder);
							
						}
					}
				}
			}
		}
	}
	
	
	
	
}
