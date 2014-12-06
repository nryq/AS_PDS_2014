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

public class Partida {
	public Partida() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PARTIDA_PARTIDA_EQUIPO) {
			return ORM_partida_equipo;
		}
		else if (key == orm.ORMConstants.KEY_PARTIDA_PARTIDA_MOVIMIENTO) {
			return ORM_partida_movimiento;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PARTIDA_ID_EQUIPO_GANADOR) {
			this.id_equipo_ganador = (orm.Equipo) owner;
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
	
	private String lugar;
	
	private String fecha_hr;
	
	private orm.Equipo id_equipo_ganador;
	
	private java.util.Set ORM_partida_equipo = new java.util.HashSet();
	
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
	
	public void setLugar(String value) {
		this.lugar = value;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setFecha_hr(String value) {
		this.fecha_hr = value;
	}
	
	public String getFecha_hr() {
		return fecha_hr;
	}
	
	public void setId_equipo_ganador(orm.Equipo value) {
		if (id_equipo_ganador != null) {
			id_equipo_ganador.partida.remove(this);
		}
		if (value != null) {
			value.partida.add(this);
		}
	}
	
	public orm.Equipo getId_equipo_ganador() {
		return id_equipo_ganador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_equipo_ganador(orm.Equipo value) {
		this.id_equipo_ganador = value;
	}
	
	private orm.Equipo getORM_Id_equipo_ganador() {
		return id_equipo_ganador;
	}
	
	private void setORM_Partida_equipo(java.util.Set value) {
		this.ORM_partida_equipo = value;
	}
	
	private java.util.Set getORM_Partida_equipo() {
		return ORM_partida_equipo;
	}
	
	public final orm.Partida_equipoSetCollection partida_equipo = new orm.Partida_equipoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PARTIDA_PARTIDA_EQUIPO, orm.ORMConstants.KEY_PARTIDA_EQUIPO_PARTIDA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Partida_movimiento(java.util.Set value) {
		this.ORM_partida_movimiento = value;
	}
	
	private java.util.Set getORM_Partida_movimiento() {
		return ORM_partida_movimiento;
	}
	
	public final orm.Partida_movimientoSetCollection partida_movimiento = new orm.Partida_movimientoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PARTIDA_PARTIDA_MOVIMIENTO, orm.ORMConstants.KEY_PARTIDA_MOVIMIENTO_PARTIDA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
