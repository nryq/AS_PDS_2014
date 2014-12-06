package domain;

import orm.Persona;

public class ClubVO {
	
	private orm.Persona jefe;
	private String nombre;
	private String localidad;
	private String descripcion;
	private boolean reclutando;
	
	public ClubVO() {
		super();
	}

	public ClubVO(Persona jefe, String nombre, String localidad,
			String descripcion) {
		super();
		this.jefe = jefe;
		this.nombre = nombre;
		this.localidad = localidad;
		this.descripcion = descripcion;
		this.reclutando=false;
	}

	public orm.Persona getJefe() {
		return jefe;
	}

	public void setJefe(orm.Persona jefe) {
		this.jefe = jefe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isReclutando() {
		return reclutando;
	}

	public void setReclutando(boolean reclutando) {
		this.reclutando = reclutando;
	}
	
}
