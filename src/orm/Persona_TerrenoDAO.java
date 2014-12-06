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

public class Persona_TerrenoDAO {
	public static Persona_Terreno loadPersona_TerrenoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_TerrenoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno getPersona_TerrenoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPersona_TerrenoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno loadPersona_TerrenoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_TerrenoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno getPersona_TerrenoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPersona_TerrenoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno loadPersona_TerrenoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona_Terreno) session.load(orm.Persona_Terreno.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno getPersona_TerrenoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona_Terreno) session.get(orm.Persona_Terreno.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno loadPersona_TerrenoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona_Terreno) session.load(orm.Persona_Terreno.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno getPersona_TerrenoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona_Terreno) session.get(orm.Persona_Terreno.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Terreno(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPersona_Terreno(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Terreno(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPersona_Terreno(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno[] listPersona_TerrenoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPersona_TerrenoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno[] listPersona_TerrenoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPersona_TerrenoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Terreno(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Terreno as Persona_Terreno");
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
	
	public static List queryPersona_Terreno(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Terreno as Persona_Terreno");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona_Terreno", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno[] listPersona_TerrenoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersona_Terreno(session, condition, orderBy);
			return (Persona_Terreno[]) list.toArray(new Persona_Terreno[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno[] listPersona_TerrenoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersona_Terreno(session, condition, orderBy, lockMode);
			return (Persona_Terreno[]) list.toArray(new Persona_Terreno[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno loadPersona_TerrenoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_TerrenoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno loadPersona_TerrenoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_TerrenoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno loadPersona_TerrenoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Persona_Terreno[] persona_Terrenos = listPersona_TerrenoByQuery(session, condition, orderBy);
		if (persona_Terrenos != null && persona_Terrenos.length > 0)
			return persona_Terrenos[0];
		else
			return null;
	}
	
	public static Persona_Terreno loadPersona_TerrenoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Persona_Terreno[] persona_Terrenos = listPersona_TerrenoByQuery(session, condition, orderBy, lockMode);
		if (persona_Terrenos != null && persona_Terrenos.length > 0)
			return persona_Terrenos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersona_TerrenoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePersona_TerrenoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona_TerrenoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePersona_TerrenoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona_TerrenoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Terreno as Persona_Terreno");
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
	
	public static java.util.Iterator iteratePersona_TerrenoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Terreno as Persona_Terreno");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona_Terreno", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno createPersona_Terreno() {
		return new orm.Persona_Terreno();
	}
	
	public static boolean save(orm.Persona_Terreno persona_Terreno) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(persona_Terreno);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Persona_Terreno persona_Terreno) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(persona_Terreno);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona_Terreno persona_Terreno)throws PersistentException {
		try {
			if(persona_Terreno.getId_Persona() != null) {
				persona_Terreno.getId_Persona().persona_Terreno.remove(persona_Terreno);
			}
			
			if(persona_Terreno.getId_Terreno() != null) {
				persona_Terreno.getId_Terreno().persona_Terreno.remove(persona_Terreno);
			}
			
			return delete(persona_Terreno);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona_Terreno persona_Terreno, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(persona_Terreno.getId_Persona() != null) {
				persona_Terreno.getId_Persona().persona_Terreno.remove(persona_Terreno);
			}
			
			if(persona_Terreno.getId_Terreno() != null) {
				persona_Terreno.getId_Terreno().persona_Terreno.remove(persona_Terreno);
			}
			
			try {
				session.delete(persona_Terreno);
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
	
	public static boolean refresh(orm.Persona_Terreno persona_Terreno) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(persona_Terreno);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Persona_Terreno persona_Terreno) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(persona_Terreno);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Terreno loadPersona_TerrenoByCriteria(Persona_TerrenoCriteria persona_TerrenoCriteria) {
		Persona_Terreno[] persona_Terrenos = listPersona_TerrenoByCriteria(persona_TerrenoCriteria);
		if(persona_Terrenos == null || persona_Terrenos.length == 0) {
			return null;
		}
		return persona_Terrenos[0];
	}
	
	public static Persona_Terreno[] listPersona_TerrenoByCriteria(Persona_TerrenoCriteria persona_TerrenoCriteria) {
		return persona_TerrenoCriteria.listPersona_Terreno();
	}
}
