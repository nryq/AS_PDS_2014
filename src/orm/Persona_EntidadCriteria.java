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

public class Persona_EntidadCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public Persona_EntidadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public Persona_EntidadCriteria(PersistentSession session) {
		this(session.createCriteria(Persona_Entidad.class));
	}
	
	public Persona_EntidadCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createId_personaCriteria() {
		return new PersonaCriteria(createCriteria("id_persona"));
	}
	
	public MovimientoCriteria createId_movimientoCriteria() {
		return new MovimientoCriteria(createCriteria("id_movimiento"));
	}
	
	public Persona_Entidad uniquePersona_Entidad() {
		return (Persona_Entidad) super.uniqueResult();
	}
	
	public Persona_Entidad[] listPersona_Entidad() {
		java.util.List list = super.list();
		return (Persona_Entidad[]) list.toArray(new Persona_Entidad[list.size()]);
	}
}

