package domain;

import orm.Club;

public class EquipoVO {
	
	private String Nombre;
	private orm.Club id_club;
	
	public EquipoVO() {
		super();
	}

	public EquipoVO(String nombre, Club id_club) {
		super();
		Nombre = nombre;
		this.id_club = id_club;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public orm.Club getId_club() {
		return id_club;
	}

	public void setId_club(orm.Club id_club) {
		this.id_club = id_club;
	}

}
