/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package orm;

public class Persona_equipo {
	public Persona_equipo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_EQUIPO_PERSONA) {
			this.persona = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PERSONA_EQUIPO_EQUIPO) {
			this.equipo = (orm.Equipo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Persona persona;
	
	private orm.Equipo equipo;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPersona(orm.Persona value) {
		if (persona != null) {
			persona.persona_equipo.remove(this);
		}
		if (value != null) {
			value.persona_equipo.add(this);
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Persona(orm.Persona value) {
		this.persona = value;
	}
	
	private orm.Persona getORM_Persona() {
		return persona;
	}
	
	public void setEquipo(orm.Equipo value) {
		if (equipo != null) {
			equipo.persona_equipo.remove(this);
		}
		if (value != null) {
			value.persona_equipo.add(this);
		}
	}
	
	public orm.Equipo getEquipo() {
		return equipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Equipo(orm.Equipo value) {
		this.equipo = value;
	}
	
	private orm.Equipo getORM_Equipo() {
		return equipo;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
