package domain;

import orm.Persona;
import orm.Rol;

public class PersonaRolVO {
	
	private orm.Rol id_rol;
	private orm.Persona id_persona;
	
	public PersonaRolVO(Rol id_rol, Persona id_persona) {
		super();
		this.id_rol = id_rol;
		this.id_persona = id_persona;
	}
	public PersonaRolVO() {
		super();
	}
	public orm.Rol getId_rol() {
		return id_rol;
	}
	public void setId_rol(orm.Rol id_rol) {
		this.id_rol = id_rol;
	}
	public orm.Persona getId_persona() {
		return id_persona;
	}
	public void setId_persona(orm.Persona id_persona) {
		this.id_persona = id_persona;
	}

}
