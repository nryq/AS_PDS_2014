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

public class Persona_RolCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public Persona_RolCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public Persona_RolCriteria(PersistentSession session) {
		this(session.createCriteria(Persona_Rol.class));
	}
	
	public Persona_RolCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createId_PersonaCriteria() {
		return new PersonaCriteria(createCriteria("id_Persona"));
	}
	
	public RolCriteria createId_RolCriteria() {
		return new RolCriteria(createCriteria("id_Rol"));
	}
	
	public Persona_Rol uniquePersona_Rol() {
		return (Persona_Rol) super.uniqueResult();
	}
	
	public Persona_Rol[] listPersona_Rol() {
		java.util.List list = super.list();
		return (Persona_Rol[]) list.toArray(new Persona_Rol[list.size()]);
	}
}

