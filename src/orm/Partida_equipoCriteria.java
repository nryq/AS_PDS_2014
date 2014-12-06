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

public class Partida_equipoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public Partida_equipoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public Partida_equipoCriteria(PersistentSession session) {
		this(session.createCriteria(Partida_equipo.class));
	}
	
	public Partida_equipoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PartidaCriteria createPartidaCriteria() {
		return new PartidaCriteria(createCriteria("partida"));
	}
	
	public EquipoCriteria createEquipoCriteria() {
		return new EquipoCriteria(createCriteria("equipo"));
	}
	
	public Partida_equipo uniquePartida_equipo() {
		return (Partida_equipo) super.uniqueResult();
	}
	
	public Partida_equipo[] listPartida_equipo() {
		java.util.List list = super.list();
		return (Partida_equipo[]) list.toArray(new Partida_equipo[list.size()]);
	}
}

