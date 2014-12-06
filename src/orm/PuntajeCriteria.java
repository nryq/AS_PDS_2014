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

public class PuntajeCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression bajas;
	public final IntegerExpression muertes;
	public final IntegerExpression partidas;
	public final IntegerExpression victorias;
	public final IntegerExpression derrotas;
	
	public PuntajeCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		bajas = new IntegerExpression("bajas", this);
		muertes = new IntegerExpression("muertes", this);
		partidas = new IntegerExpression("partidas", this);
		victorias = new IntegerExpression("victorias", this);
		derrotas = new IntegerExpression("derrotas", this);
	}
	
	public PuntajeCriteria(PersistentSession session) {
		this(session.createCriteria(Puntaje.class));
	}
	
	public PuntajeCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("ORM_Persona"));
	}
	
	public Puntaje uniquePuntaje() {
		return (Puntaje) super.uniqueResult();
	}
	
	public Puntaje[] listPuntaje() {
		java.util.List list = super.list();
		return (Puntaje[]) list.toArray(new Puntaje[list.size()]);
	}
}

