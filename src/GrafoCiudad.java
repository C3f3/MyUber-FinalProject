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
		for(int i=0;i<this.ordenGrafo;i++)
			for(int j=0;j<this.ordenGrafo;j++){
				if(i%2==0){
					if(j<this.rows){
						this.matrizCosto.actualizar(1, i, j);
					}
				}
				else{
					this.matrizCosto.actualizar(1, i, j-1);
				}
				if(j%2==0){
					if(i<this.columms){
						this.matrizCosto.actualizar(1, i, j);
					}
				}
				else{
					this.matrizCosto.actualizar(1, i, j-1);
				}
			}	
	}
	
}


