package contenedores;
import recursos.clsNode;
import recursos.OperacionesCL1;
public abstract class clsColaLinkedList implements OperacionesCL1{
	protected clsNode frenteC, finalC;
	
	public clsColaLinkedList(){
		limpiar();
	}

	public boolean estaVacia(){
		return (this.frenteC==null);} 


	public abstract void meter(Object elemento);
	
	public Object sacar(){
		Object elemento = null;
		if (!estaVacia()){
			elemento=this.frenteC.getNodeInfo();
			this.frenteC=this.frenteC.getNextNode();
			if (estaVacia()){
				this.finalC=null; 
			}
		}else{
			System.out.println("Error sacar. Cola vacia");
		}
		return elemento;
	}
	
	public void limpiar(){
		this.frenteC=this.finalC=null;
	}	
	
}
