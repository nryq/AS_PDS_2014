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

public class PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression correo;
	public final StringExpression clave;
	public final StringExpression descripcion;
	
	public PersonaDetachedCriteria() {
		super(orm.Persona.class, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		clave = new StringExpression("clave", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		clave = new StringExpression("clave", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
	}
	
	public PuntajeDetachedCriteria createPuntajeCriteria() {
		return new PuntajeDetachedCriteria(createCriteria("puntaje"));
	}
	
	public Persona_RolDetachedCriteria createPersona_RolCriteria() {
		return new Persona_RolDetachedCriteria(createCriteria("ORM_Persona_Rol"));
	}
	
	public Persona_EquipamientoDetachedCriteria createPersona_EquipamientoCriteria() {
		return new Persona_EquipamientoDetachedCriteria(createCriteria("ORM_Persona_Equipamiento"));
	}
	
	public Persona_TerrenoDetachedCriteria createPersona_TerrenoCriteria() {
		return new Persona_TerrenoDetachedCriteria(createCriteria("ORM_Persona_Terreno"));
	}
	
	public ClubDetachedCriteria createClubCriteria() {
		return new ClubDetachedCriteria(createCriteria("club"));
	}
	
	public Club_PersonaDetachedCriteria createClub_PersonaCriteria() {
		return new Club_PersonaDetachedCriteria(createCriteria("ORM_Club_Persona"));
	}
	
	public Persona_equipoDetachedCriteria createPersona_equipoCriteria() {
		return new Persona_equipoDetachedCriteria(createCriteria("ORM_Persona_equipo"));
	}
	
	public Persona_EntidadDetachedCriteria createPersona_EntidadCriteria() {
		return new Persona_EntidadDetachedCriteria(createCriteria("ORM_Persona_Entidad"));
	}
	
	public Persona uniquePersona(PersistentSession session) {
		return (Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona[] listPersona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

