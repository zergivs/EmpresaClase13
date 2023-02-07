
public class Capacitacion {
	/*
	 * Identificador: número interno de la capacitación manejado por la empresa -
	 * RUT cliente - Día - Hora - Lugar - Duración - Cantidad de asistentes
	 */
	private String dia, hora, lugar, duracion;

	/**
	 * 
	 */
	public Capacitacion() {
		super();
	}

	/**
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 */
	public Capacitacion(String dia, String hora, String lugar, String duracion) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Capacitacion [dia=" + dia + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + "]";
	}

}
