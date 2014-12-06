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

public class Partida_equipo {
	public Partida_equipo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PARTIDA_EQUIPO_PARTIDA) {
			this.partida = (orm.Partida) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PARTIDA_EQUIPO_EQUIPO) {
			this.equipo = (orm.Equipo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Partida partida;
	
	private orm.Equipo equipo;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPartida(orm.Partida value) {
		if (partida != null) {
			partida.partida_equipo.remove(this);
		}
		if (value != null) {
			value.partida_equipo.add(this);
		}
	}
	
	public orm.Partida getPartida() {
		return partida;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Partida(orm.Partida value) {
		this.partida = value;
	}
	
	private orm.Partida getORM_Partida() {
		return partida;
	}
	
	public void setEquipo(orm.Equipo value) {
		if (equipo != null) {
			equipo.partida_equipo.remove(this);
		}
		if (value != null) {
			value.partida_equipo.add(this);
		}
	}
	
	public orm.Equipo getEquipo() {
		return equipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Equipo(orm.Equipo value) {
		this.equipo = value;
	}
	
	private orm.Equipo getORM_Equipo() {
		return equipo;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
