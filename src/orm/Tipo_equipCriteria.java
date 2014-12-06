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

public class Tipo_equipCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_tipo;
	public final IntegerExpression desc_tipo;
	
	public Tipo_equipCriteria(Criteria criteria) {
		super(criteria);
		id_tipo = new IntegerExpression("id_tipo", this);
		desc_tipo = new IntegerExpression("desc_tipo", this);
	}
	
	public Tipo_equipCriteria(PersistentSession session) {
		this(session.createCriteria(Tipo_equip.class));
	}
	
	public Tipo_equipCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public EquipamientoCriteria createEquipamientoCriteria() {
		return new EquipamientoCriteria(createCriteria("ORM_Equipamiento"));
	}
	
	public Tipo_equip uniqueTipo_equip() {
		return (Tipo_equip) super.uniqueResult();
	}
	
	public Tipo_equip[] listTipo_equip() {
		java.util.List list = super.list();
		return (Tipo_equip[]) list.toArray(new Tipo_equip[list.size()]);
	}
}

