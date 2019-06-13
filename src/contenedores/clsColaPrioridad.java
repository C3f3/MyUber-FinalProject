package contenedores;
import recursos.clsNode;

public abstract class clsColaPrioridad extends clsColaLinkedList{
	public abstract boolean esMenor(Object objA, Object objB);
	public abstract boolean esMayor(Object objA, Object objB);
	public abstract boolean iguales(Object objA, Object objB);

	public void meter(Object elemento){
		clsNode node;
		node = new clsNode(elemento);
		if (estaVacia()){
			this.frenteC=this.finalC= new clsNode(elemento);
		} else{
			if (esMenor(elemento, this.frenteC.getNodeInfo())){
				node.setNextNode(this.frenteC);
				this.frenteC=node;

			}else{
				clsNode temp = this.frenteC;
				boolean flag=false;
				while (temp.getNextNode()!=null && !flag){
					if (esMayor(elemento,temp.getNextNode().getNodeInfo())){
						temp=temp.getNextNode();
					}else{
						flag=true;
					}
				}
				node.setNextNode(temp.getNextNode());
				temp.setNextNode(node);				
			}
		}
	}	
}
