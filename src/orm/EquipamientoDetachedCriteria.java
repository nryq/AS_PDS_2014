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

public class EquipamientoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression material;
	
	public EquipamientoDetachedCriteria() {
		super(orm.Equipamiento.class, orm.EquipamientoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		material = new StringExpression("material", this.getDetachedCriteria());
	}
	
	public EquipamientoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EquipamientoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		material = new StringExpression("material", this.getDetachedCriteria());
	}
	
	public Tipo_equipDetachedCriteria createId_tipoCriteria() {
		return new Tipo_equipDetachedCriteria(createCriteria("id_tipo"));
	}
	
	public Persona_EquipamientoDetachedCriteria createPersona_EquipamientoCriteria() {
		return new Persona_EquipamientoDetachedCriteria(createCriteria("ORM_Persona_Equipamiento"));
	}
	
	public Equipamiento uniqueEquipamiento(PersistentSession session) {
		return (Equipamiento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Equipamiento[] listEquipamiento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Equipamiento[]) list.toArray(new Equipamiento[list.size()]);
	}
}

