
public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(99999999, 99, 2, "Juan", "Perez", "56987658765", "Modelo", "Quillota 980",
				"Valparaiso");

		System.out.println(cliente1.toString());
        
		Usuario usuario1 = new Usuario(99999999, "Jorge Gonzalez", "2 marzo 1986");
        
		System.out.println(usuario1.toString());
        
		Capacitacion capacitacion1 = new Capacitacion("5 de enero", "6pm", "Unab", "4 horas");
        
		System.out.println(capacitacion1.toString());

	}

}
