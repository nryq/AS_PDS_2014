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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Persona_equipoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public Persona_equipoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public Persona_equipoCriteria(PersistentSession session) {
		this(session.createCriteria(Persona_equipo.class));
	}
	
	public Persona_equipoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public EquipoCriteria createEquipoCriteria() {
		return new EquipoCriteria(createCriteria("equipo"));
	}
	
	public Persona_equipo uniquePersona_equipo() {
		return (Persona_equipo) super.uniqueResult();
	}
	
	public Persona_equipo[] listPersona_equipo() {
		java.util.List list = super.list();
		return (Persona_equipo[]) list.toArray(new Persona_equipo[list.size()]);
	}
}

