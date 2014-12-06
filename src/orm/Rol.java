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

public class Rol {
	public Rol() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ROL_PERSONA_ROL) {
			return ORM_persona_Rol;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id_rol;
	
	private String desc_rol;
	
	private java.util.Set ORM_persona_Rol = new java.util.HashSet();
	
	private void setId_rol(int value) {
		this.id_rol = value;
	}
	
	public int getId_rol() {
		return id_rol;
	}
	
	public int getORMID() {
		return getId_rol();
	}
	
	public void setDesc_rol(String value) {
		this.desc_rol = value;
	}
	
	public String getDesc_rol() {
		return desc_rol;
	}
	
	private void setORM_Persona_Rol(java.util.Set value) {
		this.ORM_persona_Rol = value;
	}
	
	private java.util.Set getORM_Persona_Rol() {
		return ORM_persona_Rol;
	}
	
	public final orm.Persona_RolSetCollection persona_Rol = new orm.Persona_RolSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ROL_PERSONA_ROL, orm.ORMConstants.KEY_PERSONA_ROL_ID_ROL, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_rol());
	}
	
}
