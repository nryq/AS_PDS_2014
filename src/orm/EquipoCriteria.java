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

public class EquipoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	
	public EquipoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
	}
	
	public EquipoCriteria(PersistentSession session) {
		this(session.createCriteria(Equipo.class));
	}
	
	public EquipoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public ClubCriteria createClubCriteria() {
		return new ClubCriteria(createCriteria("club"));
	}
	
	public PartidaCriteria createPartidaCriteria() {
		return new PartidaCriteria(createCriteria("ORM_Partida"));
	}
	
	public Persona_equipoCriteria createPersona_equipoCriteria() {
		return new Persona_equipoCriteria(createCriteria("ORM_Persona_equipo"));
	}
	
	public Partida_equipoCriteria createPartida_equipoCriteria() {
		return new Partida_equipoCriteria(createCriteria("ORM_Partida_equipo"));
	}
	
	public Equipo uniqueEquipo() {
		return (Equipo) super.uniqueResult();
	}
	
	public Equipo[] listEquipo() {
		java.util.List list = super.list();
		return (Equipo[]) list.toArray(new Equipo[list.size()]);
	}
}

