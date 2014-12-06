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

public class Persona_RolDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public Persona_RolDetachedCriteria() {
		super(orm.Persona_Rol.class, orm.Persona_RolCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public Persona_RolDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Persona_RolCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createId_PersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("id_Persona"));
	}
	
	public RolDetachedCriteria createId_RolCriteria() {
		return new RolDetachedCriteria(createCriteria("id_Rol"));
	}
	
	public Persona_Rol uniquePersona_Rol(PersistentSession session) {
		return (Persona_Rol) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona_Rol[] listPersona_Rol(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona_Rol[]) list.toArray(new Persona_Rol[list.size()]);
	}
}

