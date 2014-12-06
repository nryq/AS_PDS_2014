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

public class RolDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_rol;
	public final StringExpression desc_rol;
	
	public RolDetachedCriteria() {
		super(orm.Rol.class, orm.RolCriteria.class);
		id_rol = new IntegerExpression("id_rol", this.getDetachedCriteria());
		desc_rol = new StringExpression("desc_rol", this.getDetachedCriteria());
	}
	
	public RolDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.RolCriteria.class);
		id_rol = new IntegerExpression("id_rol", this.getDetachedCriteria());
		desc_rol = new StringExpression("desc_rol", this.getDetachedCriteria());
	}
	
	public Persona_RolDetachedCriteria createPersona_RolCriteria() {
		return new Persona_RolDetachedCriteria(createCriteria("ORM_Persona_Rol"));
	}
	
	public Rol uniqueRol(PersistentSession session) {
		return (Rol) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Rol[] listRol(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Rol[]) list.toArray(new Rol[list.size()]);
	}
}

