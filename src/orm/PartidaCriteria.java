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

public class PartidaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression lugar;
	public final StringExpression fecha_hr;
	
	public PartidaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		lugar = new StringExpression("lugar", this);
		fecha_hr = new StringExpression("fecha_hr", this);
	}
	
	public PartidaCriteria(PersistentSession session) {
		this(session.createCriteria(Partida.class));
	}
	
	public PartidaCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public EquipoCriteria createId_equipo_ganadorCriteria() {
		return new EquipoCriteria(createCriteria("id_equipo_ganador"));
	}
	
	public Partida_equipoCriteria createPartida_equipoCriteria() {
		return new Partida_equipoCriteria(createCriteria("ORM_Partida_equipo"));
	}
	
	public Partida_movimientoCriteria createPartida_movimientoCriteria() {
		return new Partida_movimientoCriteria(createCriteria("ORM_Partida_movimiento"));
	}
	
	public Partida uniquePartida() {
		return (Partida) super.uniqueResult();
	}
	
	public Partida[] listPartida() {
		java.util.List list = super.list();
		return (Partida[]) list.toArray(new Partida[list.size()]);
	}
}

