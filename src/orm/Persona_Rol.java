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

public class Persona_Rol {
	public Persona_Rol() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_ROL_ID_PERSONA) {
			this.id_Persona = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PERSONA_ROL_ID_ROL) {
			this.id_Rol = (orm.Rol) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Persona id_Persona;
	
	private orm.Rol id_Rol;
	
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
			id_Persona.persona_Rol.remove(this);
		}
		if (value != null) {
			value.persona_Rol.add(this);
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
	
	public void setId_Rol(orm.Rol value) {
		if (id_Rol != null) {
			id_Rol.persona_Rol.remove(this);
		}
		if (value != null) {
			value.persona_Rol.add(this);
		}
	}
	
	public orm.Rol getId_Rol() {
		return id_Rol;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_Rol(orm.Rol value) {
		this.id_Rol = value;
	}
	
	private orm.Rol getORM_Id_Rol() {
		return id_Rol;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
