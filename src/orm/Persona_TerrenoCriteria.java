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

public class Persona_TerrenoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public Persona_TerrenoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public Persona_TerrenoCriteria(PersistentSession session) {
		this(session.createCriteria(Persona_Terreno.class));
	}
	
	public Persona_TerrenoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createId_PersonaCriteria() {
		return new PersonaCriteria(createCriteria("id_Persona"));
	}
	
	public TerrenoCriteria createId_TerrenoCriteria() {
		return new TerrenoCriteria(createCriteria("id_Terreno"));
	}
	
	public Persona_Terreno uniquePersona_Terreno() {
		return (Persona_Terreno) super.uniqueResult();
	}
	
	public Persona_Terreno[] listPersona_Terreno() {
		java.util.List list = super.list();
		return (Persona_Terreno[]) list.toArray(new Persona_Terreno[list.size()]);
	}
}

