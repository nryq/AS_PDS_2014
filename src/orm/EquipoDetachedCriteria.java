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

public class EquipoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	
	public EquipoDetachedCriteria() {
		super(orm.Equipo.class, orm.EquipoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
	}
	
	public EquipoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EquipoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
	}
	
	public ClubDetachedCriteria createClubCriteria() {
		return new ClubDetachedCriteria(createCriteria("club"));
	}
	
	public PartidaDetachedCriteria createPartidaCriteria() {
		return new PartidaDetachedCriteria(createCriteria("ORM_Partida"));
	}
	
	public Persona_equipoDetachedCriteria createPersona_equipoCriteria() {
		return new Persona_equipoDetachedCriteria(createCriteria("ORM_Persona_equipo"));
	}
	
	public Partida_equipoDetachedCriteria createPartida_equipoCriteria() {
		return new Partida_equipoDetachedCriteria(createCriteria("ORM_Partida_equipo"));
	}
	
	public Equipo uniqueEquipo(PersistentSession session) {
		return (Equipo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Equipo[] listEquipo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Equipo[]) list.toArray(new Equipo[list.size()]);
	}
}

