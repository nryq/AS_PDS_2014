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

public class Persona_EquipamientoDAO {
	public static Persona_Equipamiento loadPersona_EquipamientoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_EquipamientoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento getPersona_EquipamientoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPersona_EquipamientoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento loadPersona_EquipamientoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_EquipamientoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento getPersona_EquipamientoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPersona_EquipamientoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento loadPersona_EquipamientoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona_Equipamiento) session.load(orm.Persona_Equipamiento.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento getPersona_EquipamientoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona_Equipamiento) session.get(orm.Persona_Equipamiento.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento loadPersona_EquipamientoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona_Equipamiento) session.load(orm.Persona_Equipamiento.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento getPersona_EquipamientoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona_Equipamiento) session.get(orm.Persona_Equipamiento.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Equipamiento(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPersona_Equipamiento(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Equipamiento(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPersona_Equipamiento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento[] listPersona_EquipamientoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPersona_EquipamientoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento[] listPersona_EquipamientoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPersona_EquipamientoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona_Equipamiento(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Equipamiento as Persona_Equipamiento");
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
	
	public static List queryPersona_Equipamiento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Equipamiento as Persona_Equipamiento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona_Equipamiento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento[] listPersona_EquipamientoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersona_Equipamiento(session, condition, orderBy);
			return (Persona_Equipamiento[]) list.toArray(new Persona_Equipamiento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento[] listPersona_EquipamientoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersona_Equipamiento(session, condition, orderBy, lockMode);
			return (Persona_Equipamiento[]) list.toArray(new Persona_Equipamiento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento loadPersona_EquipamientoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_EquipamientoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento loadPersona_EquipamientoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersona_EquipamientoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento loadPersona_EquipamientoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Persona_Equipamiento[] persona_Equipamientos = listPersona_EquipamientoByQuery(session, condition, orderBy);
		if (persona_Equipamientos != null && persona_Equipamientos.length > 0)
			return persona_Equipamientos[0];
		else
			return null;
	}
	
	public static Persona_Equipamiento loadPersona_EquipamientoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Persona_Equipamiento[] persona_Equipamientos = listPersona_EquipamientoByQuery(session, condition, orderBy, lockMode);
		if (persona_Equipamientos != null && persona_Equipamientos.length > 0)
			return persona_Equipamientos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersona_EquipamientoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePersona_EquipamientoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona_EquipamientoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePersona_EquipamientoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersona_EquipamientoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Equipamiento as Persona_Equipamiento");
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
	
	public static java.util.Iterator iteratePersona_EquipamientoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona_Equipamiento as Persona_Equipamiento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona_Equipamiento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento createPersona_Equipamiento() {
		return new orm.Persona_Equipamiento();
	}
	
	public static boolean save(orm.Persona_Equipamiento persona_Equipamiento) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(persona_Equipamiento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Persona_Equipamiento persona_Equipamiento) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(persona_Equipamiento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona_Equipamiento persona_Equipamiento)throws PersistentException {
		try {
			if(persona_Equipamiento.getId_Persona() != null) {
				persona_Equipamiento.getId_Persona().persona_Equipamiento.remove(persona_Equipamiento);
			}
			
			if(persona_Equipamiento.getId_Equipamiento() != null) {
				persona_Equipamiento.getId_Equipamiento().persona_Equipamiento.remove(persona_Equipamiento);
			}
			
			return delete(persona_Equipamiento);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona_Equipamiento persona_Equipamiento, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(persona_Equipamiento.getId_Persona() != null) {
				persona_Equipamiento.getId_Persona().persona_Equipamiento.remove(persona_Equipamiento);
			}
			
			if(persona_Equipamiento.getId_Equipamiento() != null) {
				persona_Equipamiento.getId_Equipamiento().persona_Equipamiento.remove(persona_Equipamiento);
			}
			
			try {
				session.delete(persona_Equipamiento);
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
	
	public static boolean refresh(orm.Persona_Equipamiento persona_Equipamiento) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(persona_Equipamiento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Persona_Equipamiento persona_Equipamiento) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(persona_Equipamiento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona_Equipamiento loadPersona_EquipamientoByCriteria(Persona_EquipamientoCriteria persona_EquipamientoCriteria) {
		Persona_Equipamiento[] persona_Equipamientos = listPersona_EquipamientoByCriteria(persona_EquipamientoCriteria);
		if(persona_Equipamientos == null || persona_Equipamientos.length == 0) {
			return null;
		}
		return persona_Equipamientos[0];
	}
	
	public static Persona_Equipamiento[] listPersona_EquipamientoByCriteria(Persona_EquipamientoCriteria persona_EquipamientoCriteria) {
		return persona_EquipamientoCriteria.listPersona_Equipamiento();
	}
}
