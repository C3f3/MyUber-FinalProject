package contenedores;
import recursos.clsNode;
public class clsColaSLinkedList extends clsColaLinkedList{

	public void meter(Object elemento){
		if (!estaVacia()){
			this.finalC.setNextNode(new clsNode(elemento));
			this.finalC=this.finalC.getNextNode();
			// nuevo nodo es el ultimo.
		}else{
			this.frenteC=this.finalC= new clsNode(elemento);	
		}
	}
		
}
