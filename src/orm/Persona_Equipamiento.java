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

public class Persona_Equipamiento {
	public Persona_Equipamiento() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_EQUIPAMIENTO_ID_PERSONA) {
			this.id_Persona = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PERSONA_EQUIPAMIENTO_ID_EQUIPAMIENTO) {
			this.id_Equipamiento = (orm.Equipamiento) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Persona id_Persona;
	
	private orm.Equipamiento id_Equipamiento;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setId_Persona(orm.Persona value) {
		if (id_Persona != null) {
			id_Persona.persona_Equipamiento.remove(this);
		}
		if (value != null) {
			value.persona_Equipamiento.add(this);
		}
	}
	
	public orm.Persona getId_Persona() {
		return id_Persona;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_Persona(orm.Persona value) {
		this.id_Persona = value;
	}
	
	private orm.Persona getORM_Id_Persona() {
		return id_Persona;
	}
	
	public void setId_Equipamiento(orm.Equipamiento value) {
		if (id_Equipamiento != null) {
			id_Equipamiento.persona_Equipamiento.remove(this);
		}
		if (value != null) {
			value.persona_Equipamiento.add(this);
		}
	}
	
	public orm.Equipamiento getId_Equipamiento() {
		return id_Equipamiento;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_Equipamiento(orm.Equipamiento value) {
		this.id_Equipamiento = value;
	}
	
	private orm.Equipamiento getORM_Id_Equipamiento() {
		return id_Equipamiento;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
