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

public class Puntaje {
	public Puntaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PUNTAJE_PERSONA) {
			return ORM_persona;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private Integer bajas;
	
	private Integer muertes;
	
	private Integer partidas;
	
	private Integer victorias;
	
	private Integer derrotas;
	
	private java.util.Set ORM_persona = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setBajas(int value) {
		setBajas(new Integer(value));
	}
	
	public void setBajas(Integer value) {
		this.bajas = value;
	}
	
	public Integer getBajas() {
		return bajas;
	}
	
	public void setMuertes(int value) {
		setMuertes(new Integer(value));
	}
	
	public void setMuertes(Integer value) {
		this.muertes = value;
	}
	
	public Integer getMuertes() {
		return muertes;
	}
	
	public void setPartidas(int value) {
		setPartidas(new Integer(value));
	}
	
	public void setPartidas(Integer value) {
		this.partidas = value;
	}
	
	public Integer getPartidas() {
		return partidas;
	}
	
	public void setVictorias(int value) {
		setVictorias(new Integer(value));
	}
	
	public void setVictorias(Integer value) {
		this.victorias = value;
	}
	
	public Integer getVictorias() {
		return victorias;
	}
	
	public void setDerrotas(int value) {
		setDerrotas(new Integer(value));
	}
	
	public void setDerrotas(Integer value) {
		this.derrotas = value;
	}
	
	public Integer getDerrotas() {
		return derrotas;
	}
	
	private void setORM_Persona(java.util.Set value) {
		this.ORM_persona = value;
	}
	
	private java.util.Set getORM_Persona() {
		return ORM_persona;
	}
	
	public final orm.PersonaSetCollection persona = new orm.PersonaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PUNTAJE_PERSONA, orm.ORMConstants.KEY_PERSONA_PUNTAJE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
