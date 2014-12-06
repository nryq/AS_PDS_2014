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

public class Tipo_equipDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_tipo;
	public final IntegerExpression desc_tipo;
	
	public Tipo_equipDetachedCriteria() {
		super(orm.Tipo_equip.class, orm.Tipo_equipCriteria.class);
		id_tipo = new IntegerExpression("id_tipo", this.getDetachedCriteria());
		desc_tipo = new IntegerExpression("desc_tipo", this.getDetachedCriteria());
	}
	
	public Tipo_equipDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Tipo_equipCriteria.class);
		id_tipo = new IntegerExpression("id_tipo", this.getDetachedCriteria());
		desc_tipo = new IntegerExpression("desc_tipo", this.getDetachedCriteria());
	}
	
	public EquipamientoDetachedCriteria createEquipamientoCriteria() {
		return new EquipamientoDetachedCriteria(createCriteria("ORM_Equipamiento"));
	}
	
	public Tipo_equip uniqueTipo_equip(PersistentSession session) {
		return (Tipo_equip) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipo_equip[] listTipo_equip(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipo_equip[]) list.toArray(new Tipo_equip[list.size()]);
	}
}

