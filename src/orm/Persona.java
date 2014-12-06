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

public class Persona {
	public Persona() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_PERSONA_ROL) {
			return ORM_persona_Rol;
		}
		else if (key == orm.ORMConstants.KEY_PERSONA_PERSONA_EQUIPAMIENTO) {
			return ORM_persona_Equipamiento;
		}
		else if (key == orm.ORMConstants.KEY_PERSONA_PERSONA_TERRENO) {
			return ORM_persona_Terreno;
		}
		else if (key == orm.ORMConstants.KEY_PERSONA_CLUB_PERSONA) {
			return ORM_club_Persona;
		}
		else if (key == orm.ORMConstants.KEY_PERSONA_PERSONA_EQUIPO) {
			return ORM_persona_equipo;
		}
		else if (key == orm.ORMConstants.KEY_PERSONA_PERSONA_ENTIDAD) {
			return ORM_persona_Entidad;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_PUNTAJE) {
			this.puntaje = (orm.Puntaje) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_PERSONA_CLUB) {
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
	
	private String correo;
	
	private String clave;
	
	private String descripcion;
	
	private orm.Puntaje puntaje;
	
	private java.util.Set ORM_persona_Rol = new java.util.HashSet();
	
	private java.util.Set ORM_persona_Equipamiento = new java.util.HashSet();
	
	private java.util.Set ORM_persona_Terreno = new java.util.HashSet();
	
	private orm.Club club;
	
	private java.util.Set ORM_club_Persona = new java.util.HashSet();
	
	private java.util.Set ORM_persona_equipo = new java.util.HashSet();
	
	private java.util.Set ORM_persona_Entidad = new java.util.HashSet();
	
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
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setClave(String value) {
		this.clave = value;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setPuntaje(orm.Puntaje value) {
		if (puntaje != null) {
			puntaje.persona.remove(this);
		}
		if (value != null) {
			value.persona.add(this);
		}
	}
	
	public orm.Puntaje getPuntaje() {
		return puntaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Puntaje(orm.Puntaje value) {
		this.puntaje = value;
	}
	
	private orm.Puntaje getORM_Puntaje() {
		return puntaje;
	}
	
	private void setORM_Persona_Rol(java.util.Set value) {
		this.ORM_persona_Rol = value;
	}
	
	private java.util.Set getORM_Persona_Rol() {
		return ORM_persona_Rol;
	}
	
	public final orm.Persona_RolSetCollection persona_Rol = new orm.Persona_RolSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_PERSONA_ROL, orm.ORMConstants.KEY_PERSONA_ROL_ID_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Persona_Equipamiento(java.util.Set value) {
		this.ORM_persona_Equipamiento = value;
	}
	
	private java.util.Set getORM_Persona_Equipamiento() {
		return ORM_persona_Equipamiento;
	}
	
	public final orm.Persona_EquipamientoSetCollection persona_Equipamiento = new orm.Persona_EquipamientoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_PERSONA_EQUIPAMIENTO, orm.ORMConstants.KEY_PERSONA_EQUIPAMIENTO_ID_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Persona_Terreno(java.util.Set value) {
		this.ORM_persona_Terreno = value;
	}
	
	private java.util.Set getORM_Persona_Terreno() {
		return ORM_persona_Terreno;
	}
	
	public final orm.Persona_TerrenoSetCollection persona_Terreno = new orm.Persona_TerrenoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_PERSONA_TERRENO, orm.ORMConstants.KEY_PERSONA_TERRENO_ID_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setClub(orm.Club value) {
		if (this.club != value) {
			orm.Club lclub = this.club;
			this.club = value;
			if (value != null) {
				club.setId_jefe(this);
			}
			else {
				lclub.setId_jefe(null);
			}
		}
	}
	
	public orm.Club getClub() {
		return club;
	}
	
	private void setORM_Club_Persona(java.util.Set value) {
		this.ORM_club_Persona = value;
	}
	
	private java.util.Set getORM_Club_Persona() {
		return ORM_club_Persona;
	}
	
	public final orm.Club_PersonaSetCollection club_Persona = new orm.Club_PersonaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_CLUB_PERSONA, orm.ORMConstants.KEY_CLUB_PERSONA_ID_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Persona_equipo(java.util.Set value) {
		this.ORM_persona_equipo = value;
	}
	
	private java.util.Set getORM_Persona_equipo() {
		return ORM_persona_equipo;
	}
	
	public final orm.Persona_equipoSetCollection persona_equipo = new orm.Persona_equipoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_PERSONA_EQUIPO, orm.ORMConstants.KEY_PERSONA_EQUIPO_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Persona_Entidad(java.util.Set value) {
		this.ORM_persona_Entidad = value;
	}
	
	private java.util.Set getORM_Persona_Entidad() {
		return ORM_persona_Entidad;
	}
	
	public final orm.Persona_EntidadSetCollection persona_Entidad = new orm.Persona_EntidadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_PERSONA_ENTIDAD, orm.ORMConstants.KEY_PERSONA_ENTIDAD_ID_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
