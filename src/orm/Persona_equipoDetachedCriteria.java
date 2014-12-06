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

public class Persona_equipoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public Persona_equipoDetachedCriteria() {
		super(orm.Persona_equipo.class, orm.Persona_equipoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public Persona_equipoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Persona_equipoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public EquipoDetachedCriteria createEquipoCriteria() {
		return new EquipoDetachedCriteria(createCriteria("equipo"));
	}
	
	public Persona_equipo uniquePersona_equipo(PersistentSession session) {
		return (Persona_equipo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona_equipo[] listPersona_equipo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona_equipo[]) list.toArray(new Persona_equipo[list.size()]);
	}
}

