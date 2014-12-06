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

public class Club_Persona {
	public Club_Persona() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CLUB_PERSONA_ID_CLUB) {
			this.id_club = (orm.Club) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CLUB_PERSONA_ID_PERSONA) {
			this.id_Persona = (orm.Persona) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Club id_club;
	
	private orm.Persona id_Persona;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setId_club(orm.Club value) {
		if (id_club != null) {
			id_club.club_Persona.remove(this);
		}
		if (value != null) {
			value.club_Persona.add(this);
		}
	}
	
	public orm.Club getId_club() {
		return id_club;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_club(orm.Club value) {
		this.id_club = value;
	}
	
	private orm.Club getORM_Id_club() {
		return id_club;
	}
	
	public void setId_Persona(orm.Persona value) {
		if (id_Persona != null) {
			id_Persona.club_Persona.remove(this);
		}
		if (value != null) {
			value.club_Persona.add(this);
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
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
