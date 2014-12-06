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

public class Partida_movimientoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public Partida_movimientoDetachedCriteria() {
		super(orm.Partida_movimiento.class, orm.Partida_movimientoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public Partida_movimientoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Partida_movimientoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public PartidaDetachedCriteria createPartidaCriteria() {
		return new PartidaDetachedCriteria(createCriteria("partida"));
	}
	
	public MovimientoDetachedCriteria createMovimientoCriteria() {
		return new MovimientoDetachedCriteria(createCriteria("movimiento"));
	}
	
	public Partida_movimiento uniquePartida_movimiento(PersistentSession session) {
		return (Partida_movimiento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Partida_movimiento[] listPartida_movimiento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Partida_movimiento[]) list.toArray(new Partida_movimiento[list.size()]);
	}
}

