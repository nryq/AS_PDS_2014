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

public class Partida_movimientoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public Partida_movimientoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public Partida_movimientoCriteria(PersistentSession session) {
		this(session.createCriteria(Partida_movimiento.class));
	}
	
	public Partida_movimientoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PartidaCriteria createPartidaCriteria() {
		return new PartidaCriteria(createCriteria("partida"));
	}
	
	public MovimientoCriteria createMovimientoCriteria() {
		return new MovimientoCriteria(createCriteria("movimiento"));
	}
	
	public Partida_movimiento uniquePartida_movimiento() {
		return (Partida_movimiento) super.uniqueResult();
	}
	
	public Partida_movimiento[] listPartida_movimiento() {
		java.util.List list = super.list();
		return (Partida_movimiento[]) list.toArray(new Partida_movimiento[list.size()]);
	}
}

