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

public class Equipamiento {
	public Equipamiento() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_EQUIPAMIENTO_PERSONA_EQUIPAMIENTO) {
			return ORM_persona_Equipamiento;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_EQUIPAMIENTO_ID_TIPO) {
			this.id_tipo = (orm.Tipo_equip) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Tipo_equip id_tipo;
	
	private String nombre;
	
	private String material;
	
	private java.util.Set ORM_persona_Equipamiento = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setMaterial(String value) {
		this.material = value;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setId_tipo(orm.Tipo_equip value) {
		if (id_tipo != null) {
			id_tipo.equipamiento.remove(this);
		}
		if (value != null) {
			value.equipamiento.add(this);
		}
	}
	
	public orm.Tipo_equip getId_tipo() {
		return id_tipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_tipo(orm.Tipo_equip value) {
		this.id_tipo = value;
	}
	
	private orm.Tipo_equip getORM_Id_tipo() {
		return id_tipo;
	}
	
	private void setORM_Persona_Equipamiento(java.util.Set value) {
		this.ORM_persona_Equipamiento = value;
	}
	
	private java.util.Set getORM_Persona_Equipamiento() {
		return ORM_persona_Equipamiento;
	}
	
	public final orm.Persona_EquipamientoSetCollection persona_Equipamiento = new orm.Persona_EquipamientoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_EQUIPAMIENTO_PERSONA_EQUIPAMIENTO, orm.ORMConstants.KEY_PERSONA_EQUIPAMIENTO_ID_EQUIPAMIENTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
