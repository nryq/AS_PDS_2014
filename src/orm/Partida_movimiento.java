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

public class Partida_movimiento {
	public Partida_movimiento() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PARTIDA_MOVIMIENTO_PARTIDA) {
			this.partida = (orm.Partida) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PARTIDA_MOVIMIENTO_MOVIMIENTO) {
			this.movimiento = (orm.Movimiento) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Partida partida;
	
	private orm.Movimiento movimiento;
	
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
			partida.partida_movimiento.remove(this);
		}
		if (value != null) {
			value.partida_movimiento.add(this);
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
	
	public void setMovimiento(orm.Movimiento value) {
		if (movimiento != null) {
			movimiento.partida_movimiento.remove(this);
		}
		if (value != null) {
			value.partida_movimiento.add(this);
		}
	}
	
	public orm.Movimiento getMovimiento() {
		return movimiento;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Movimiento(orm.Movimiento value) {
		this.movimiento = value;
	}
	
	private orm.Movimiento getORM_Movimiento() {
		return movimiento;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
