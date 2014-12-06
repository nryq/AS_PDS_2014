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

public class PuntajeDAO {
	public static Puntaje loadPuntajeByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPuntajeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje getPuntajeByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPuntajeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje loadPuntajeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPuntajeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje getPuntajeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPuntajeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje loadPuntajeByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Puntaje) session.load(orm.Puntaje.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje getPuntajeByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Puntaje) session.get(orm.Puntaje.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje loadPuntajeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Puntaje) session.load(orm.Puntaje.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje getPuntajeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Puntaje) session.get(orm.Puntaje.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPuntaje(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPuntaje(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPuntaje(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPuntaje(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje[] listPuntajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPuntajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje[] listPuntajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPuntajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPuntaje(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Puntaje as Puntaje");
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
	
	public static List queryPuntaje(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Puntaje as Puntaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Puntaje", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje[] listPuntajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPuntaje(session, condition, orderBy);
			return (Puntaje[]) list.toArray(new Puntaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje[] listPuntajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPuntaje(session, condition, orderBy, lockMode);
			return (Puntaje[]) list.toArray(new Puntaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje loadPuntajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPuntajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje loadPuntajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPuntajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje loadPuntajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Puntaje[] puntajes = listPuntajeByQuery(session, condition, orderBy);
		if (puntajes != null && puntajes.length > 0)
			return puntajes[0];
		else
			return null;
	}
	
	public static Puntaje loadPuntajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Puntaje[] puntajes = listPuntajeByQuery(session, condition, orderBy, lockMode);
		if (puntajes != null && puntajes.length > 0)
			return puntajes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePuntajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePuntajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePuntajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePuntajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePuntajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Puntaje as Puntaje");
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
	
	public static java.util.Iterator iteratePuntajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Puntaje as Puntaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Puntaje", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje createPuntaje() {
		return new orm.Puntaje();
	}
	
	public static boolean save(orm.Puntaje puntaje) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(puntaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Puntaje puntaje) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(puntaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Puntaje puntaje)throws PersistentException {
		try {
			orm.Persona[] lPersonas = puntaje.persona.toArray();
			for(int i = 0; i < lPersonas.length; i++) {
				lPersonas[i].setPuntaje(null);
			}
			return delete(puntaje);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Puntaje puntaje, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Persona[] lPersonas = puntaje.persona.toArray();
			for(int i = 0; i < lPersonas.length; i++) {
				lPersonas[i].setPuntaje(null);
			}
			try {
				session.delete(puntaje);
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
	
	public static boolean refresh(orm.Puntaje puntaje) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(puntaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Puntaje puntaje) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(puntaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Puntaje loadPuntajeByCriteria(PuntajeCriteria puntajeCriteria) {
		Puntaje[] puntajes = listPuntajeByCriteria(puntajeCriteria);
		if(puntajes == null || puntajes.length == 0) {
			return null;
		}
		return puntajes[0];
	}
	
	public static Puntaje[] listPuntajeByCriteria(PuntajeCriteria puntajeCriteria) {
		return puntajeCriteria.listPuntaje();
	}
}
