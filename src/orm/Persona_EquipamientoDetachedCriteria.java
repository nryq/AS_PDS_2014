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

public class Persona_EquipamientoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public Persona_EquipamientoDetachedCriteria() {
		super(orm.Persona_Equipamiento.class, orm.Persona_EquipamientoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public Persona_EquipamientoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Persona_EquipamientoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createId_PersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("id_Persona"));
	}
	
	public EquipamientoDetachedCriteria createId_EquipamientoCriteria() {
		return new EquipamientoDetachedCriteria(createCriteria("id_Equipamiento"));
	}
	
	public Persona_Equipamiento uniquePersona_Equipamiento(PersistentSession session) {
		return (Persona_Equipamiento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona_Equipamiento[] listPersona_Equipamiento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona_Equipamiento[]) list.toArray(new Persona_Equipamiento[list.size()]);
	}
}

