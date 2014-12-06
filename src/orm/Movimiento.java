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

public class Movimiento {
	public Movimiento() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_MOVIMIENTO_PERSONA_ENTIDAD) {
			return ORM_persona_Entidad;
		}
		else if (key == orm.ORMConstants.KEY_MOVIMIENTO_PARTIDA_MOVIMIENTO) {
			return ORM_partida_movimiento;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private int nombre;
	
	private int destino;
	
	private java.util.Set ORM_persona_Entidad = new java.util.HashSet();
	
	private java.util.Set ORM_partida_movimiento = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(int value) {
		this.nombre = value;
	}
	
	public int getNombre() {
		return nombre;
	}
	
	public void setDestino(int value) {
		this.destino = value;
	}
	
	public int getDestino() {
		return destino;
	}
	
	private void setORM_Persona_Entidad(java.util.Set value) {
		this.ORM_persona_Entidad = value;
	}
	
	private java.util.Set getORM_Persona_Entidad() {
		return ORM_persona_Entidad;
	}
	
	public final orm.Persona_EntidadSetCollection persona_Entidad = new orm.Persona_EntidadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_MOVIMIENTO_PERSONA_ENTIDAD, orm.ORMConstants.KEY_PERSONA_ENTIDAD_ID_MOVIMIENTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Partida_movimiento(java.util.Set value) {
		this.ORM_partida_movimiento = value;
	}
	
	private java.util.Set getORM_Partida_movimiento() {
		return ORM_partida_movimiento;
	}
	
	public final orm.Partida_movimientoSetCollection partida_movimiento = new orm.Partida_movimientoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_MOVIMIENTO_PARTIDA_MOVIMIENTO, orm.ORMConstants.KEY_PARTIDA_MOVIMIENTO_MOVIMIENTO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
