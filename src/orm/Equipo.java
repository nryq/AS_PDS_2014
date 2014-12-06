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

public class Equipo {
	public Equipo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_EQUIPO_PARTIDA) {
			return ORM_partida;
		}
		else if (key == orm.ORMConstants.KEY_EQUIPO_PERSONA_EQUIPO) {
			return ORM_persona_equipo;
		}
		else if (key == orm.ORMConstants.KEY_EQUIPO_PARTIDA_EQUIPO) {
			return ORM_partida_equipo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_EQUIPO_CLUB) {
			this.club = (orm.Club) owner;
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
	
	private String nombre;
	
	private orm.Club club;
	
	private java.util.Set ORM_partida = new java.util.HashSet();
	
	private java.util.Set ORM_persona_equipo = new java.util.HashSet();
	
	private java.util.Set ORM_partida_equipo = new java.util.HashSet();
	
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
	
	public void setClub(orm.Club value) {
		if (club != null) {
			club.equipo.remove(this);
		}
		if (value != null) {
			value.equipo.add(this);
		}
	}
	
	public orm.Club getClub() {
		return club;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Club(orm.Club value) {
		this.club = value;
	}
	
	private orm.Club getORM_Club() {
		return club;
	}
	
	private void setORM_Partida(java.util.Set value) {
		this.ORM_partida = value;
	}
	
	private java.util.Set getORM_Partida() {
		return ORM_partida;
	}
	
	public final orm.PartidaSetCollection partida = new orm.PartidaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_EQUIPO_PARTIDA, orm.ORMConstants.KEY_PARTIDA_ID_EQUIPO_GANADOR, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Persona_equipo(java.util.Set value) {
		this.ORM_persona_equipo = value;
	}
	
	private java.util.Set getORM_Persona_equipo() {
		return ORM_persona_equipo;
	}
	
	public final orm.Persona_equipoSetCollection persona_equipo = new orm.Persona_equipoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_EQUIPO_PERSONA_EQUIPO, orm.ORMConstants.KEY_PERSONA_EQUIPO_EQUIPO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Partida_equipo(java.util.Set value) {
		this.ORM_partida_equipo = value;
	}
	
	private java.util.Set getORM_Partida_equipo() {
		return ORM_partida_equipo;
	}
	
	public final orm.Partida_equipoSetCollection partida_equipo = new orm.Partida_equipoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_EQUIPO_PARTIDA_EQUIPO, orm.ORMConstants.KEY_PARTIDA_EQUIPO_EQUIPO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
