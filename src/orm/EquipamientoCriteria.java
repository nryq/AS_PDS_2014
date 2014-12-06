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

public class EquipamientoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression material;
	
	public EquipamientoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		material = new StringExpression("material", this);
	}
	
	public EquipamientoCriteria(PersistentSession session) {
		this(session.createCriteria(Equipamiento.class));
	}
	
	public EquipamientoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public Tipo_equipCriteria createId_tipoCriteria() {
		return new Tipo_equipCriteria(createCriteria("id_tipo"));
	}
	
	public Persona_EquipamientoCriteria createPersona_EquipamientoCriteria() {
		return new Persona_EquipamientoCriteria(createCriteria("ORM_Persona_Equipamiento"));
	}
	
	public Equipamiento uniqueEquipamiento() {
		return (Equipamiento) super.uniqueResult();
	}
	
	public Equipamiento[] listEquipamiento() {
		java.util.List list = super.list();
		return (Equipamiento[]) list.toArray(new Equipamiento[list.size()]);
	}
}

