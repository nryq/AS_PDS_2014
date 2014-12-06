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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TerrenoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final IntegerExpression valor;
	public final StringExpression descripcion;
	public final StringExpression condiciones;
	
	public TerrenoDetachedCriteria() {
		super(orm.Terreno.class, orm.TerrenoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		valor = new IntegerExpression("valor", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		condiciones = new StringExpression("condiciones", this.getDetachedCriteria());
	}
	
	public TerrenoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.TerrenoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		valor = new IntegerExpression("valor", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		condiciones = new StringExpression("condiciones", this.getDetachedCriteria());
	}
	
	public Persona_TerrenoDetachedCriteria createPersona_TerrenoCriteria() {
		return new Persona_TerrenoDetachedCriteria(createCriteria("ORM_Persona_Terreno"));
	}
	
	public Terreno uniqueTerreno(PersistentSession session) {
		return (Terreno) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Terreno[] listTerreno(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Terreno[]) list.toArray(new Terreno[list.size()]);
	}
}

