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

public class Partida_movimientoDAO {
	public static Partida_movimiento loadPartida_movimientoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPartida_movimientoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento getPartida_movimientoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPartida_movimientoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento loadPartida_movimientoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPartida_movimientoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento getPartida_movimientoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPartida_movimientoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento loadPartida_movimientoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Partida_movimiento) session.load(orm.Partida_movimiento.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento getPartida_movimientoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Partida_movimiento) session.get(orm.Partida_movimiento.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento loadPartida_movimientoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Partida_movimiento) session.load(orm.Partida_movimiento.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento getPartida_movimientoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Partida_movimiento) session.get(orm.Partida_movimiento.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_movimiento(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPartida_movimiento(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_movimiento(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPartida_movimiento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento[] listPartida_movimientoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPartida_movimientoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento[] listPartida_movimientoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPartida_movimientoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_movimiento(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Partida_movimiento as Partida_movimiento");
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
	
	public static List queryPartida_movimiento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Partida_movimiento as Partida_movimiento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Partida_movimiento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento[] listPartida_movimientoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPartida_movimiento(session, condition, orderBy);
			return (Partida_movimiento[]) list.toArray(new Partida_movimiento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento[] listPartida_movimientoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPartida_movimiento(session, condition, orderBy, lockMode);
			return (Partida_movimiento[]) list.toArray(new Partida_movimiento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento loadPartida_movimientoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPartida_movimientoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento loadPartida_movimientoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPartida_movimientoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento loadPartida_movimientoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Partida_movimiento[] partida_movimientos = listPartida_movimientoByQuery(session, condition, orderBy);
		if (partida_movimientos != null && partida_movimientos.length > 0)
			return partida_movimientos[0];
		else
			return null;
	}
	
	public static Partida_movimiento loadPartida_movimientoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Partida_movimiento[] partida_movimientos = listPartida_movimientoByQuery(session, condition, orderBy, lockMode);
		if (partida_movimientos != null && partida_movimientos.length > 0)
			return partida_movimientos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePartida_movimientoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePartida_movimientoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePartida_movimientoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePartida_movimientoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePartida_movimientoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Partida_movimiento as Partida_movimiento");
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
	
	public static java.util.Iterator iteratePartida_movimientoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Partida_movimiento as Partida_movimiento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Partida_movimiento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento createPartida_movimiento() {
		return new orm.Partida_movimiento();
	}
	
	public static boolean save(orm.Partida_movimiento partida_movimiento) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(partida_movimiento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Partida_movimiento partida_movimiento) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(partida_movimiento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Partida_movimiento partida_movimiento)throws PersistentException {
		try {
			if(partida_movimiento.getPartida() != null) {
				partida_movimiento.getPartida().partida_movimiento.remove(partida_movimiento);
			}
			
			if(partida_movimiento.getMovimiento() != null) {
				partida_movimiento.getMovimiento().partida_movimiento.remove(partida_movimiento);
			}
			
			return delete(partida_movimiento);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Partida_movimiento partida_movimiento, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(partida_movimiento.getPartida() != null) {
				partida_movimiento.getPartida().partida_movimiento.remove(partida_movimiento);
			}
			
			if(partida_movimiento.getMovimiento() != null) {
				partida_movimiento.getMovimiento().partida_movimiento.remove(partida_movimiento);
			}
			
			try {
				session.delete(partida_movimiento);
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
	
	public static boolean refresh(orm.Partida_movimiento partida_movimiento) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(partida_movimiento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Partida_movimiento partida_movimiento) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(partida_movimiento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_movimiento loadPartida_movimientoByCriteria(Partida_movimientoCriteria partida_movimientoCriteria) {
		Partida_movimiento[] partida_movimientos = listPartida_movimientoByCriteria(partida_movimientoCriteria);
		if(partida_movimientos == null || partida_movimientos.length == 0) {
			return null;
		}
		return partida_movimientos[0];
	}
	
	public static Partida_movimiento[] listPartida_movimientoByCriteria(Partida_movimientoCriteria partida_movimientoCriteria) {
		return partida_movimientoCriteria.listPartida_movimiento();
	}
}
