import grafoDirigido.*;;

public class GrafoCiudad extends clsGrafoDirigido{
	private int rows, columms;
	public GrafoCiudad(int r, int c){
		super((r+1)*(c+1));
		this.rows=r;
		this.columms=c;
	}
	
	@Override
	public void cargarGrafo(){
		int [][] aux=new int [this.rows][this.columms];
		load_aux(aux);
		//inicializamos matriz de costo
		for(int i=0;i<this.getOrden();i++)
			for(int j=0;j<this.ordenGrafo;j++)
				this.matrizCosto.actualizar(infinito, i, j);
		
		load_prin(aux);
	}
	//enumera nodos
	private void load_aux(int[][] a) {
		int c=0;
		for(int i=0;i<this.rows;i++) {
			for(int j=0;j<this.columms;j++) {
				a[i][j]=c;
				c++;
			}
		}
	}
	//asigna costos a la matriz de adyacencia
	private void load_prin(int [][]aux){
		for(int i=0;i<this.rows;i++) {
			if(i%2==0) {
				for(int j=0;j<this.columms;j++) {
						if(j<this.columms-1)
							this.matrizCosto.actualizar(new Double(1), aux[i][j], aux[i][j+1]);
							//princ[aux[i][j]][aux[i][j+1]]=1;
						if(j%2!=0) {
							if(i!=this.rows-1)
								this.matrizCosto.actualizar(new Double(1), aux[i][j], aux[i+1][j]);
								/*princ[(aux[i][j])][(aux[i+1][j])]=1;*/
						}else
							if(i!=0)
								this.matrizCosto.actualizar(new Double(1), aux[i][j], aux[i-1][j]);
								//princ[aux[i][j]][aux[i-1][j]]=1;
				}
			}else {
				for(int j=this.columms-1;j>-1;j--) {
					if(j>0)
						this.matrizCosto.actualizar(new Double(1), aux[i][j], aux[i][j-1]);
						//princ[aux[i][j]][aux[i][j-1]]=1;
					if(j%2!=0) {
						if(i!=this.rows-1)
							this.matrizCosto.actualizar(new Double(1), aux[i][j], aux[i+1][j]);
							//princ[(aux[i][j])][(aux[i+1][j])]=1;
					}else
						if(i!=0)
							this.matrizCosto.actualizar(new Double(1), aux[i][j], aux[i-1][j]);
							//princ[aux[i][j]][aux[i-1][j]]=1;
				}
			}
		}
	}
	
}


