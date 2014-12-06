package domain;

import orm.Persona;
import orm.Puntaje;

public class PersonaPuntajeVO {
	
	private orm.Persona id_persona;
	private orm.Puntaje id_puntaje;
	public PersonaPuntajeVO(Persona id_persona, Puntaje id_puntaje) {
		super();
		this.id_persona = id_persona;
		this.id_puntaje = id_puntaje;
	}
	public PersonaPuntajeVO() {
		super();
	}
	public orm.Persona getId_persona() {
		return id_persona;
	}
	public void setId_persona(orm.Persona id_persona) {
		this.id_persona = id_persona;
	}
	public orm.Puntaje getId_puntaje() {
		return id_puntaje;
	}
	public void setId_puntaje(orm.Puntaje id_puntaje) {
		this.id_puntaje = id_puntaje;
	}

}
