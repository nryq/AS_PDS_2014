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

public class ClubDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression localidad;
	public final StringExpression descripcion;
	
	public ClubDetachedCriteria() {
		super(orm.Club.class, orm.ClubCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		localidad = new StringExpression("localidad", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
	}
	
	public ClubDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ClubCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		localidad = new StringExpression("localidad", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createId_jefeCriteria() {
		return new PersonaDetachedCriteria(createCriteria("id_jefe"));
	}
	
	public Club_PersonaDetachedCriteria createClub_PersonaCriteria() {
		return new Club_PersonaDetachedCriteria(createCriteria("ORM_Club_Persona"));
	}
	
	public EquipoDetachedCriteria createEquipoCriteria() {
		return new EquipoDetachedCriteria(createCriteria("ORM_Equipo"));
	}
	
	public Club uniqueClub(PersistentSession session) {
		return (Club) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Club[] listClub(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Club[]) list.toArray(new Club[list.size()]);
	}
}

