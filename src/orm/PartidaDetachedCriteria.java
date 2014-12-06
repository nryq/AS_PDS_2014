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

public class PartidaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression lugar;
	public final StringExpression fecha_hr;
	
	public PartidaDetachedCriteria() {
		super(orm.Partida.class, orm.PartidaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		lugar = new StringExpression("lugar", this.getDetachedCriteria());
		fecha_hr = new StringExpression("fecha_hr", this.getDetachedCriteria());
	}
	
	public PartidaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PartidaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		lugar = new StringExpression("lugar", this.getDetachedCriteria());
		fecha_hr = new StringExpression("fecha_hr", this.getDetachedCriteria());
	}
	
	public EquipoDetachedCriteria createId_equipo_ganadorCriteria() {
		return new EquipoDetachedCriteria(createCriteria("id_equipo_ganador"));
	}
	
	public Partida_equipoDetachedCriteria createPartida_equipoCriteria() {
		return new Partida_equipoDetachedCriteria(createCriteria("ORM_Partida_equipo"));
	}
	
	public Partida_movimientoDetachedCriteria createPartida_movimientoCriteria() {
		return new Partida_movimientoDetachedCriteria(createCriteria("ORM_Partida_movimiento"));
	}
	
	public Partida uniquePartida(PersistentSession session) {
		return (Partida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Partida[] listPartida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Partida[]) list.toArray(new Partida[list.size()]);
	}
}

