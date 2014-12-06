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

public class RolDAO {
	public static Rol loadRolByORMID(int id_rol) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadRolByORMID(session, id_rol);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol getRolByORMID(int id_rol) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getRolByORMID(session, id_rol);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol loadRolByORMID(int id_rol, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadRolByORMID(session, id_rol, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol getRolByORMID(int id_rol, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getRolByORMID(session, id_rol, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol loadRolByORMID(PersistentSession session, int id_rol) throws PersistentException {
		try {
			return (Rol) session.load(orm.Rol.class, new Integer(id_rol));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol getRolByORMID(PersistentSession session, int id_rol) throws PersistentException {
		try {
			return (Rol) session.get(orm.Rol.class, new Integer(id_rol));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol loadRolByORMID(PersistentSession session, int id_rol, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Rol) session.load(orm.Rol.class, new Integer(id_rol), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol getRolByORMID(PersistentSession session, int id_rol, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Rol) session.get(orm.Rol.class, new Integer(id_rol), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRol(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryRol(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRol(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryRol(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol[] listRolByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listRolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol[] listRolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listRolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRol(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Rol as Rol");
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
	
	public static List queryRol(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Rol as Rol");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Rol", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol[] listRolByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRol(session, condition, orderBy);
			return (Rol[]) list.toArray(new Rol[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol[] listRolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRol(session, condition, orderBy, lockMode);
			return (Rol[]) list.toArray(new Rol[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol loadRolByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadRolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol loadRolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadRolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol loadRolByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Rol[] rols = listRolByQuery(session, condition, orderBy);
		if (rols != null && rols.length > 0)
			return rols[0];
		else
			return null;
	}
	
	public static Rol loadRolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Rol[] rols = listRolByQuery(session, condition, orderBy, lockMode);
		if (rols != null && rols.length > 0)
			return rols[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRolByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iterateRolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iterateRolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRolByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Rol as Rol");
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
	
	public static java.util.Iterator iterateRolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Rol as Rol");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Rol", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol createRol() {
		return new orm.Rol();
	}
	
	public static boolean save(orm.Rol rol) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(rol);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Rol rol) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(rol);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Rol rol)throws PersistentException {
		try {
			orm.Persona_Rol[] lPersona_Rols = rol.persona_Rol.toArray();
			for(int i = 0; i < lPersona_Rols.length; i++) {
				lPersona_Rols[i].setId_Rol(null);
			}
			return delete(rol);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Rol rol, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Persona_Rol[] lPersona_Rols = rol.persona_Rol.toArray();
			for(int i = 0; i < lPersona_Rols.length; i++) {
				lPersona_Rols[i].setId_Rol(null);
			}
			try {
				session.delete(rol);
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
	
	public static boolean refresh(orm.Rol rol) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(rol);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Rol rol) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(rol);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rol loadRolByCriteria(RolCriteria rolCriteria) {
		Rol[] rols = listRolByCriteria(rolCriteria);
		if(rols == null || rols.length == 0) {
			return null;
		}
		return rols[0];
	}
	
	public static Rol[] listRolByCriteria(RolCriteria rolCriteria) {
		return rolCriteria.listRol();
	}
}
