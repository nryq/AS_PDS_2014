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

public class Tipo_equipDAO {
	public static Tipo_equip loadTipo_equipByORMID(int id_tipo) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadTipo_equipByORMID(session, id_tipo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip getTipo_equipByORMID(int id_tipo) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getTipo_equipByORMID(session, id_tipo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip loadTipo_equipByORMID(int id_tipo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadTipo_equipByORMID(session, id_tipo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip getTipo_equipByORMID(int id_tipo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getTipo_equipByORMID(session, id_tipo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip loadTipo_equipByORMID(PersistentSession session, int id_tipo) throws PersistentException {
		try {
			return (Tipo_equip) session.load(orm.Tipo_equip.class, new Integer(id_tipo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip getTipo_equipByORMID(PersistentSession session, int id_tipo) throws PersistentException {
		try {
			return (Tipo_equip) session.get(orm.Tipo_equip.class, new Integer(id_tipo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip loadTipo_equipByORMID(PersistentSession session, int id_tipo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipo_equip) session.load(orm.Tipo_equip.class, new Integer(id_tipo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip getTipo_equipByORMID(PersistentSession session, int id_tipo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipo_equip) session.get(orm.Tipo_equip.class, new Integer(id_tipo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_equip(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryTipo_equip(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_equip(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryTipo_equip(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip[] listTipo_equipByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listTipo_equipByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip[] listTipo_equipByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listTipo_equipByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo_equip(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo_equip as Tipo_equip");
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
	
	public static List queryTipo_equip(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo_equip as Tipo_equip");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipo_equip", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip[] listTipo_equipByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipo_equip(session, condition, orderBy);
			return (Tipo_equip[]) list.toArray(new Tipo_equip[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip[] listTipo_equipByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipo_equip(session, condition, orderBy, lockMode);
			return (Tipo_equip[]) list.toArray(new Tipo_equip[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip loadTipo_equipByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadTipo_equipByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip loadTipo_equipByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadTipo_equipByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip loadTipo_equipByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tipo_equip[] tipo_equips = listTipo_equipByQuery(session, condition, orderBy);
		if (tipo_equips != null && tipo_equips.length > 0)
			return tipo_equips[0];
		else
			return null;
	}
	
	public static Tipo_equip loadTipo_equipByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tipo_equip[] tipo_equips = listTipo_equipByQuery(session, condition, orderBy, lockMode);
		if (tipo_equips != null && tipo_equips.length > 0)
			return tipo_equips[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipo_equipByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iterateTipo_equipByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipo_equipByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iterateTipo_equipByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipo_equipByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo_equip as Tipo_equip");
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
	
	public static java.util.Iterator iterateTipo_equipByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo_equip as Tipo_equip");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipo_equip", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip createTipo_equip() {
		return new orm.Tipo_equip();
	}
	
	public static boolean save(orm.Tipo_equip tipo_equip) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(tipo_equip);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Tipo_equip tipo_equip) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(tipo_equip);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Tipo_equip tipo_equip)throws PersistentException {
		try {
			orm.Equipamiento[] lEquipamientos = tipo_equip.equipamiento.toArray();
			for(int i = 0; i < lEquipamientos.length; i++) {
				lEquipamientos[i].setId_tipo(null);
			}
			return delete(tipo_equip);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Tipo_equip tipo_equip, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Equipamiento[] lEquipamientos = tipo_equip.equipamiento.toArray();
			for(int i = 0; i < lEquipamientos.length; i++) {
				lEquipamientos[i].setId_tipo(null);
			}
			try {
				session.delete(tipo_equip);
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
	
	public static boolean refresh(orm.Tipo_equip tipo_equip) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(tipo_equip);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Tipo_equip tipo_equip) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(tipo_equip);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo_equip loadTipo_equipByCriteria(Tipo_equipCriteria tipo_equipCriteria) {
		Tipo_equip[] tipo_equips = listTipo_equipByCriteria(tipo_equipCriteria);
		if(tipo_equips == null || tipo_equips.length == 0) {
			return null;
		}
		return tipo_equips[0];
	}
	
	public static Tipo_equip[] listTipo_equipByCriteria(Tipo_equipCriteria tipo_equipCriteria) {
		return tipo_equipCriteria.listTipo_equip();
	}
}
