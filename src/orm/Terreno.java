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

public class Terreno {
	public Terreno() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TERRENO_PERSONA_TERRENO) {
			return ORM_persona_Terreno;
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
	
	private String direccion;
	
	private int valor;
	
	private String descripcion;
	
	private String condiciones;
	
	private java.util.Set ORM_persona_Terreno = new java.util.HashSet();
	
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
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setValor(int value) {
		this.valor = value;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setCondiciones(String value) {
		this.condiciones = value;
	}
	
	public String getCondiciones() {
		return condiciones;
	}
	
	private void setORM_Persona_Terreno(java.util.Set value) {
		this.ORM_persona_Terreno = value;
	}
	
	private java.util.Set getORM_Persona_Terreno() {
		return ORM_persona_Terreno;
	}
	
	public final orm.Persona_TerrenoSetCollection persona_Terreno = new orm.Persona_TerrenoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TERRENO_PERSONA_TERRENO, orm.ORMConstants.KEY_PERSONA_TERRENO_ID_TERRENO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
