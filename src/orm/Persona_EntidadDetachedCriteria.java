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

public class Persona_EntidadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public Persona_EntidadDetachedCriteria() {
		super(orm.Persona_Entidad.class, orm.Persona_EntidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public Persona_EntidadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Persona_EntidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createId_personaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("id_persona"));
	}
	
	public MovimientoDetachedCriteria createId_movimientoCriteria() {
		return new MovimientoDetachedCriteria(createCriteria("id_movimiento"));
	}
	
	public Persona_Entidad uniquePersona_Entidad(PersistentSession session) {
		return (Persona_Entidad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona_Entidad[] listPersona_Entidad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona_Entidad[]) list.toArray(new Persona_Entidad[list.size()]);
	}
}

