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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Persona_EntidadDAO {
	public static Persona_Entidad loadPersona_EntidadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_EntidadByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad getPersona_EntidadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPersona_EntidadByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad loadPersona_EntidadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_EntidadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad getPersona_EntidadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPersona_EntidadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad loadPersona_EntidadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona_Entidad) session.load(orm.Persona_Entidad.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad getPersona_EntidadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona_Entidad) session.get(orm.Persona_Entidad.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad loadPersona_EntidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona_Entidad) session.load(orm.Persona_Entidad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad getPersona_EntidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona_Entidad) session.get(orm.Persona_Entidad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Entidad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPersona_Entidad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Entidad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPersona_Entidad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad[] listPersona_EntidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPersona_EntidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad[] listPersona_EntidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPersona_EntidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Entidad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Entidad as Persona_Entidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Entidad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Entidad as Persona_Entidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona_Entidad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad[] listPersona_EntidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersona_Entidad(session, condition, orderBy);
			return (Persona_Entidad[]) list.toArray(new Persona_Entidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad[] listPersona_EntidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersona_Entidad(session, condition, orderBy, lockMode);
			return (Persona_Entidad[]) list.toArray(new Persona_Entidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad loadPersona_EntidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_EntidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad loadPersona_EntidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_EntidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad loadPersona_EntidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Persona_Entidad[] persona_Entidads = listPersona_EntidadByQuery(session, condition, orderBy);
		if (persona_Entidads != null && persona_Entidads.length > 0)
			return persona_Entidads[0];
		else
			return null;
	}
	
	public static Persona_Entidad loadPersona_EntidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Persona_Entidad[] persona_Entidads = listPersona_EntidadByQuery(session, condition, orderBy, lockMode);
		if (persona_Entidads != null && persona_Entidads.length > 0)
			return persona_Entidads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersona_EntidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePersona_EntidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona_EntidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePersona_EntidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona_EntidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Entidad as Persona_Entidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona_EntidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Entidad as Persona_Entidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona_Entidad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad createPersona_Entidad() {
		return new orm.Persona_Entidad();
	}
	
	public static boolean save(orm.Persona_Entidad persona_Entidad) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(persona_Entidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Persona_Entidad persona_Entidad) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(persona_Entidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona_Entidad persona_Entidad)throws PersistentException {
		try {
			if(persona_Entidad.getId_persona() != null) {
				persona_Entidad.getId_persona().persona_Entidad.remove(persona_Entidad);
			}
			
			if(persona_Entidad.getId_movimiento() != null) {
				persona_Entidad.getId_movimiento().persona_Entidad.remove(persona_Entidad);
			}
			
			return delete(persona_Entidad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona_Entidad persona_Entidad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(persona_Entidad.getId_persona() != null) {
				persona_Entidad.getId_persona().persona_Entidad.remove(persona_Entidad);
			}
			
			if(persona_Entidad.getId_movimiento() != null) {
				persona_Entidad.getId_movimiento().persona_Entidad.remove(persona_Entidad);
			}
			
			try {
				session.delete(persona_Entidad);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Persona_Entidad persona_Entidad) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(persona_Entidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Persona_Entidad persona_Entidad) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(persona_Entidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Entidad loadPersona_EntidadByCriteria(Persona_EntidadCriteria persona_EntidadCriteria) {
		Persona_Entidad[] persona_Entidads = listPersona_EntidadByCriteria(persona_EntidadCriteria);
		if(persona_Entidads == null || persona_Entidads.length == 0) {
			return null;
		}
		return persona_Entidads[0];
	}
	
	public static Persona_Entidad[] listPersona_EntidadByCriteria(Persona_EntidadCriteria persona_EntidadCriteria) {
		return persona_EntidadCriteria.listPersona_Entidad();
	}
}
