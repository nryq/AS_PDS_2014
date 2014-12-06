package domain;

import orm.Persona;
import orm.Terreno;

public class TerrenoPersonaVO {
	
	private orm.Terreno terreno;
	private orm.Persona persona;
	
	public TerrenoPersonaVO() {
		super();
	}
	public TerrenoPersonaVO(Terreno terreno, Persona persona) {
		super();
		this.terreno = terreno;
		this.persona = persona;
	}
	public orm.Terreno getTerreno() {
		return terreno;
	}
	public void setTerreno(orm.Terreno terreno) {
		this.terreno = terreno;
	}
	public orm.Persona getPersona() {
		return persona;
	}
	public void setPersona(orm.Persona persona) {
		this.persona = persona;
	}
	
	

}
