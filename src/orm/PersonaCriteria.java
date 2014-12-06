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

public class PersonaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression correo;
	public final StringExpression clave;
	public final StringExpression descripcion;
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		correo = new StringExpression("correo", this);
		clave = new StringExpression("clave", this);
		descripcion = new StringExpression("descripcion", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PuntajeCriteria createPuntajeCriteria() {
		return new PuntajeCriteria(createCriteria("puntaje"));
	}
	
	public Persona_RolCriteria createPersona_RolCriteria() {
		return new Persona_RolCriteria(createCriteria("ORM_Persona_Rol"));
	}
	
	public Persona_EquipamientoCriteria createPersona_EquipamientoCriteria() {
		return new Persona_EquipamientoCriteria(createCriteria("ORM_Persona_Equipamiento"));
	}
	
	public Persona_TerrenoCriteria createPersona_TerrenoCriteria() {
		return new Persona_TerrenoCriteria(createCriteria("ORM_Persona_Terreno"));
	}
	
	public ClubCriteria createClubCriteria() {
		return new ClubCriteria(createCriteria("club"));
	}
	
	public Club_PersonaCriteria createClub_PersonaCriteria() {
		return new Club_PersonaCriteria(createCriteria("ORM_Club_Persona"));
	}
	
	public Persona_equipoCriteria createPersona_equipoCriteria() {
		return new Persona_equipoCriteria(createCriteria("ORM_Persona_equipo"));
	}
	
	public Persona_EntidadCriteria createPersona_EntidadCriteria() {
		return new Persona_EntidadCriteria(createCriteria("ORM_Persona_Entidad"));
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

