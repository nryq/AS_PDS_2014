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

public class RolCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_rol;
	public final StringExpression desc_rol;
	
	public RolCriteria(Criteria criteria) {
		super(criteria);
		id_rol = new IntegerExpression("id_rol", this);
		desc_rol = new StringExpression("desc_rol", this);
	}
	
	public RolCriteria(PersistentSession session) {
		this(session.createCriteria(Rol.class));
	}
	
	public RolCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public Persona_RolCriteria createPersona_RolCriteria() {
		return new Persona_RolCriteria(createCriteria("ORM_Persona_Rol"));
	}
	
	public Rol uniqueRol() {
		return (Rol) super.uniqueResult();
	}
	
	public Rol[] listRol() {
		java.util.List list = super.list();
		return (Rol[]) list.toArray(new Rol[list.size()]);
	}
}

