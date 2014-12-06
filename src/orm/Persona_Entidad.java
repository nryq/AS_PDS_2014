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

public class Persona_Entidad {
	public Persona_Entidad() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_ENTIDAD_ID_PERSONA) {
			this.id_persona = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PERSONA_ENTIDAD_ID_MOVIMIENTO) {
			this.id_movimiento = (orm.Movimiento) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Persona id_persona;
	
	private orm.Movimiento id_movimiento;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setId_persona(orm.Persona value) {
		if (id_persona != null) {
			id_persona.persona_Entidad.remove(this);
		}
		if (value != null) {
			value.persona_Entidad.add(this);
		}
	}
	
	public orm.Persona getId_persona() {
		return id_persona;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_persona(orm.Persona value) {
		this.id_persona = value;
	}
	
	private orm.Persona getORM_Id_persona() {
		return id_persona;
	}
	
	public void setId_movimiento(orm.Movimiento value) {
		if (id_movimiento != null) {
			id_movimiento.persona_Entidad.remove(this);
		}
		if (value != null) {
			value.persona_Entidad.add(this);
		}
	}
	
	public orm.Movimiento getId_movimiento() {
		return id_movimiento;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_movimiento(orm.Movimiento value) {
		this.id_movimiento = value;
	}
	
	private orm.Movimiento getORM_Id_movimiento() {
		return id_movimiento;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
