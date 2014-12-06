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

public class Club_PersonaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public Club_PersonaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public Club_PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Club_Persona.class));
	}
	
	public Club_PersonaCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public ClubCriteria createId_clubCriteria() {
		return new ClubCriteria(createCriteria("id_club"));
	}
	
	public PersonaCriteria createId_PersonaCriteria() {
		return new PersonaCriteria(createCriteria("id_Persona"));
	}
	
	public Club_Persona uniqueClub_Persona() {
		return (Club_Persona) super.uniqueResult();
	}
	
	public Club_Persona[] listClub_Persona() {
		java.util.List list = super.list();
		return (Club_Persona[]) list.toArray(new Club_Persona[list.size()]);
	}
}

