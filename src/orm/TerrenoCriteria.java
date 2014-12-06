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

public class TerrenoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final IntegerExpression valor;
	public final StringExpression descripcion;
	public final StringExpression condiciones;
	
	public TerrenoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		direccion = new StringExpression("direccion", this);
		valor = new IntegerExpression("valor", this);
		descripcion = new StringExpression("descripcion", this);
		condiciones = new StringExpression("condiciones", this);
	}
	
	public TerrenoCriteria(PersistentSession session) {
		this(session.createCriteria(Terreno.class));
	}
	
	public TerrenoCriteria() throws PersistentException {
		this(orm.ProyectoPDSsemestre2PersistentManager.instance().getSession());
	}
	
	public Persona_TerrenoCriteria createPersona_TerrenoCriteria() {
		return new Persona_TerrenoCriteria(createCriteria("ORM_Persona_Terreno"));
	}
	
	public Terreno uniqueTerreno() {
		return (Terreno) super.uniqueResult();
	}
	
	public Terreno[] listTerreno() {
		java.util.List list = super.list();
		return (Terreno[]) list.toArray(new Terreno[list.size()]);
	}
}

