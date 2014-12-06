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

public class Persona_Terreno {
	public Persona_Terreno() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_TERRENO_ID_PERSONA) {
			this.id_Persona = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PERSONA_TERRENO_ID_TERRENO) {
			this.id_Terreno = (orm.Terreno) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Persona id_Persona;
	
	private orm.Terreno id_Terreno;
	
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
			id_Persona.persona_Terreno.remove(this);
		}
		if (value != null) {
			value.persona_Terreno.add(this);
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
	
	public void setId_Terreno(orm.Terreno value) {
		if (id_Terreno != null) {
			id_Terreno.persona_Terreno.remove(this);
		}
		if (value != null) {
			value.persona_Terreno.add(this);
		}
	}
	
	public orm.Terreno getId_Terreno() {
		return id_Terreno;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_Terreno(orm.Terreno value) {
		this.id_Terreno = value;
	}
	
	private orm.Terreno getORM_Id_Terreno() {
		return id_Terreno;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
