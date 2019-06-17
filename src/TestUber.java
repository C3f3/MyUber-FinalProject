
public class TestUber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrafoCiudad miCiudad=new GrafoCiudad(3,3);
		miCiudad.cargarGrafo();
		System.out.println("Mostrando Matriz");
		miCiudad.muestraGrafo();
		System.out.println("########################");
		miCiudad.muestraFloyd();
		miCiudad.muestraCaminoFloyd(5, 6);
		
	}

}
