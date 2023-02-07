
public class Cliente {
	/*- RUT: corresponde a un número menor a 99.999.999
	- Nombres
	- Apellidos
	- Teléfono
	- AFP
	- Sistema de salud: 1 (Fonasa) o 2 (Isapre)
	- Dirección
	- Comuna
	- Edad*/

	private int rut, edad, sistemaSalud;
	private String nombre, apellido, telefono, afp, direccion, comuna;

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", edad=" + edad + ", sistemaSalud=" + sistemaSalud + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", telefono=" + telefono + ", afp=" + afp + ", direccion=" + direccion
				+ ", comuna=" + comuna + "]";
	}

	/**
	 * @param rut
	 * @param edad
	 * @param sistemaSalud
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 * @param afp
	 * @param direccion
	 * @param comuna
	 */
	public Cliente(int rut, int edad, int sistemaSalud, String nombre, String apellido, String telefono, String afp,
			String direccion, String comuna) {
		super();
		this.rut = rut;
		this.edad = edad;
		this.sistemaSalud = sistemaSalud;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	/**
	 * 
	 */
	public Cliente() {
		super();
	}

}
