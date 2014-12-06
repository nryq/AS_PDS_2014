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

public class Partida_equipoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public Partida_equipoDetachedCriteria() {
		super(orm.Partida_equipo.class, orm.Partida_equipoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public Partida_equipoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Partida_equipoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public PartidaDetachedCriteria createPartidaCriteria() {
		return new PartidaDetachedCriteria(createCriteria("partida"));
	}
	
	public EquipoDetachedCriteria createEquipoCriteria() {
		return new EquipoDetachedCriteria(createCriteria("equipo"));
	}
	
	public Partida_equipo uniquePartida_equipo(PersistentSession session) {
		return (Partida_equipo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Partida_equipo[] listPartida_equipo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Partida_equipo[]) list.toArray(new Partida_equipo[list.size()]);
	}
}

