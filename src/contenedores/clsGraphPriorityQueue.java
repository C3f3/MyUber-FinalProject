package contenedores;
import recursos.clsConnection;
import recursos.clsNode;

public class clsGraphPriorityQueue extends clsColaPrioridad {
	
	
	public boolean esMenor(Object objA, Object objB){
		boolean response=false;
				
		if (((clsConnection)objA).getConnectionCost()<((clsConnection)objB).getConnectionCost()){
			response=true;
		}
		return response;
	}

	public boolean esMayor(Object objA, Object objB){
		boolean response=false;

		if (((clsConnection)objA).getConnectionCost()>((clsConnection)objB).getConnectionCost()){
			response=true;
		}	
		return response;
	}
	
	public boolean iguales(Object objA, Object objB){
		boolean response=false;
	
		if (((clsConnection)objA).getVertexI()==((clsConnection)objB).getVertexI() && ((clsConnection)objA).getVertexJ()==((clsConnection)objB).getVertexJ() && ((clsConnection)objA).getConnectionCost()==((clsConnection)objB).getConnectionCost()){
			response=true;
		}
		return response;
	}
	
	
	void muestra(){
		clsNode temp; clsConnection conexion;		
		if (!estaVacia()){
			temp=this.frenteC;
			while (temp!=null){
				conexion=(clsConnection)temp.getNodeInfo();
				System.out.println("Conexion " + conexion.getVertexI() + " - " + conexion.getVertexJ() + ":" + conexion.getConnectionCost());
				temp=temp.getNextNode();
			}			
		}else{
			System.out.println("Error muestra. Cola vacia");
		}		
	}	
}
