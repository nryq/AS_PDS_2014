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

public class PuntajeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression bajas;
	public final IntegerExpression muertes;
	public final IntegerExpression partidas;
	public final IntegerExpression victorias;
	public final IntegerExpression derrotas;
	
	public PuntajeDetachedCriteria() {
		super(orm.Puntaje.class, orm.PuntajeCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		bajas = new IntegerExpression("bajas", this.getDetachedCriteria());
		muertes = new IntegerExpression("muertes", this.getDetachedCriteria());
		partidas = new IntegerExpression("partidas", this.getDetachedCriteria());
		victorias = new IntegerExpression("victorias", this.getDetachedCriteria());
		derrotas = new IntegerExpression("derrotas", this.getDetachedCriteria());
	}
	
	public PuntajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PuntajeCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		bajas = new IntegerExpression("bajas", this.getDetachedCriteria());
		muertes = new IntegerExpression("muertes", this.getDetachedCriteria());
		partidas = new IntegerExpression("partidas", this.getDetachedCriteria());
		victorias = new IntegerExpression("victorias", this.getDetachedCriteria());
		derrotas = new IntegerExpression("derrotas", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("ORM_Persona"));
	}
	
	public Puntaje uniquePuntaje(PersistentSession session) {
		return (Puntaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Puntaje[] listPuntaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Puntaje[]) list.toArray(new Puntaje[list.size()]);
	}
}

