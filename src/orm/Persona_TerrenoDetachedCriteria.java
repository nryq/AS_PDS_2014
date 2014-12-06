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

public class Persona_TerrenoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public Persona_TerrenoDetachedCriteria() {
		super(orm.Persona_Terreno.class, orm.Persona_TerrenoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public Persona_TerrenoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Persona_TerrenoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createId_PersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("id_Persona"));
	}
	
	public TerrenoDetachedCriteria createId_TerrenoCriteria() {
		return new TerrenoDetachedCriteria(createCriteria("id_Terreno"));
	}
	
	public Persona_Terreno uniquePersona_Terreno(PersistentSession session) {
		return (Persona_Terreno) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona_Terreno[] listPersona_Terreno(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona_Terreno[]) list.toArray(new Persona_Terreno[list.size()]);
	}
}

