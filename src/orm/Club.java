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

public class Club {
	public Club() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CLUB_CLUB_PERSONA) {
			return ORM_club_Persona;
		}
		else if (key == orm.ORMConstants.KEY_CLUB_EQUIPO) {
			return ORM_equipo;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombre;
	
	private orm.Persona id_jefe;
	
	private String localidad;
	
	private String descripcion;
	
	private Byte reclutamiento;
	
	private java.util.Set ORM_club_Persona = new java.util.HashSet();
	
	private java.util.Set ORM_equipo = new java.util.HashSet();
	
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
	
	public void setLocalidad(String value) {
		this.localidad = value;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setReclutamiento(byte value) {
		setReclutamiento(new Byte(value));
	}
	
	public void setReclutamiento(Byte value) {
		this.reclutamiento = value;
	}
	
	public Byte getReclutamiento() {
		return reclutamiento;
	}
	
	public void setId_jefe(orm.Persona value) {
		if (this.id_jefe != value) {
			orm.Persona lid_jefe = this.id_jefe;
			this.id_jefe = value;
			if (value != null) {
				id_jefe.setClub(this);
			}
			else {
				lid_jefe.setClub(null);
			}
		}
	}
	
	public orm.Persona getId_jefe() {
		return id_jefe;
	}
	
	private void setORM_Club_Persona(java.util.Set value) {
		this.ORM_club_Persona = value;
	}
	
	private java.util.Set getORM_Club_Persona() {
		return ORM_club_Persona;
	}
	
	public final orm.Club_PersonaSetCollection club_Persona = new orm.Club_PersonaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLUB_CLUB_PERSONA, orm.ORMConstants.KEY_CLUB_PERSONA_ID_CLUB, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Equipo(java.util.Set value) {
		this.ORM_equipo = value;
	}
	
	private java.util.Set getORM_Equipo() {
		return ORM_equipo;
	}
	
	public final orm.EquipoSetCollection equipo = new orm.EquipoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLUB_EQUIPO, orm.ORMConstants.KEY_EQUIPO_CLUB, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
