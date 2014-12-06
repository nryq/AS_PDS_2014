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

public class Persona_EquipamientoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public Persona_EquipamientoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public Persona_EquipamientoCriteria(PersistentSession session) {
		this(session.createCriteria(Persona_Equipamiento.class));
	}
	
	public Persona_EquipamientoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createId_PersonaCriteria() {
		return new PersonaCriteria(createCriteria("id_Persona"));
	}
	
	public EquipamientoCriteria createId_EquipamientoCriteria() {
		return new EquipamientoCriteria(createCriteria("id_Equipamiento"));
	}
	
	public Persona_Equipamiento uniquePersona_Equipamiento() {
		return (Persona_Equipamiento) super.uniqueResult();
	}
	
	public Persona_Equipamiento[] listPersona_Equipamiento() {
		java.util.List list = super.list();
		return (Persona_Equipamiento[]) list.toArray(new Persona_Equipamiento[list.size()]);
	}
}

