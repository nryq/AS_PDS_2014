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

public class Tipo_equip {
	public Tipo_equip() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TIPO_EQUIP_EQUIPAMIENTO) {
			return ORM_equipamiento;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id_tipo;
	
	private int desc_tipo;
	
	private java.util.Set ORM_equipamiento = new java.util.HashSet();
	
	private void setId_tipo(int value) {
		this.id_tipo = value;
	}
	
	public int getId_tipo() {
		return id_tipo;
	}
	
	public int getORMID() {
		return getId_tipo();
	}
	
	public void setDesc_tipo(int value) {
		this.desc_tipo = value;
	}
	
	public int getDesc_tipo() {
		return desc_tipo;
	}
	
	private void setORM_Equipamiento(java.util.Set value) {
		this.ORM_equipamiento = value;
	}
	
	private java.util.Set getORM_Equipamiento() {
		return ORM_equipamiento;
	}
	
	public final orm.EquipamientoSetCollection equipamiento = new orm.EquipamientoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TIPO_EQUIP_EQUIPAMIENTO, orm.ORMConstants.KEY_EQUIPAMIENTO_ID_TIPO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_tipo());
	}
	
}
