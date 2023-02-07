
public class Usuario {
	/*
	 * Nombre - Fecha de nacimiento - RUN
	 */
	private int rut;
	private String nombre, fechaNacimiento;

	/**
	 * 
	 */
	public Usuario() {
		super();
	}

	/**
	 * @param rut
	 * @param nombre
	 * @param fechaNacimiento
	 */
	public Usuario(int rut, String nombre, String fechaNacimiento) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Usuario [rut=" + rut + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
