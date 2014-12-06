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

public class MovimientoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression nombre;
	public final IntegerExpression destino;
	
	public MovimientoDetachedCriteria() {
		super(orm.Movimiento.class, orm.MovimientoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new IntegerExpression("nombre", this.getDetachedCriteria());
		destino = new IntegerExpression("destino", this.getDetachedCriteria());
	}
	
	public MovimientoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MovimientoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new IntegerExpression("nombre", this.getDetachedCriteria());
		destino = new IntegerExpression("destino", this.getDetachedCriteria());
	}
	
	public Persona_EntidadDetachedCriteria createPersona_EntidadCriteria() {
		return new Persona_EntidadDetachedCriteria(createCriteria("ORM_Persona_Entidad"));
	}
	
	public Partida_movimientoDetachedCriteria createPartida_movimientoCriteria() {
		return new Partida_movimientoDetachedCriteria(createCriteria("ORM_Partida_movimiento"));
	}
	
	public Movimiento uniqueMovimiento(PersistentSession session) {
		return (Movimiento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Movimiento[] listMovimiento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Movimiento[]) list.toArray(new Movimiento[list.size()]);
	}
}

