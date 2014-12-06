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

public class Club_PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public Club_PersonaDetachedCriteria() {
		super(orm.Club_Persona.class, orm.Club_PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public Club_PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Club_PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public ClubDetachedCriteria createId_clubCriteria() {
		return new ClubDetachedCriteria(createCriteria("id_club"));
	}
	
	public PersonaDetachedCriteria createId_PersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("id_Persona"));
	}
	
	public Club_Persona uniqueClub_Persona(PersistentSession session) {
		return (Club_Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Club_Persona[] listClub_Persona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Club_Persona[]) list.toArray(new Club_Persona[list.size()]);
	}
}

