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

public class MovimientoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression nombre;
	public final IntegerExpression destino;
	
	public MovimientoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new IntegerExpression("nombre", this);
		destino = new IntegerExpression("destino", this);
	}
	
	public MovimientoCriteria(PersistentSession session) {
		this(session.createCriteria(Movimiento.class));
	}
	
	public MovimientoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public Persona_EntidadCriteria createPersona_EntidadCriteria() {
		return new Persona_EntidadCriteria(createCriteria("ORM_Persona_Entidad"));
	}
	
	public Partida_movimientoCriteria createPartida_movimientoCriteria() {
		return new Partida_movimientoCriteria(createCriteria("ORM_Partida_movimiento"));
	}
	
	public Movimiento uniqueMovimiento() {
		return (Movimiento) super.uniqueResult();
	}
	
	public Movimiento[] listMovimiento() {
		java.util.List list = super.list();
		return (Movimiento[]) list.toArray(new Movimiento[list.size()]);
	}
}

