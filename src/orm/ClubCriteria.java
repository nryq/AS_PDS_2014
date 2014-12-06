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

public class ClubCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression localidad;
	public final StringExpression descripcion;
	
	public ClubCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		localidad = new StringExpression("localidad", this);
		descripcion = new StringExpression("descripcion", this);
	}
	
	public ClubCriteria(PersistentSession session) {
		this(session.createCriteria(Club.class));
	}
	
	public ClubCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createId_jefeCriteria() {
		return new PersonaCriteria(createCriteria("id_jefe"));
	}
	
	public Club_PersonaCriteria createClub_PersonaCriteria() {
		return new Club_PersonaCriteria(createCriteria("ORM_Club_Persona"));
	}
	
	public EquipoCriteria createEquipoCriteria() {
		return new EquipoCriteria(createCriteria("ORM_Equipo"));
	}
	
	public Club uniqueClub() {
		return (Club) super.uniqueResult();
	}
	
	public Club[] listClub() {
		java.util.List list = super.list();
		return (Club[]) list.toArray(new Club[list.size()]);
	}
}

