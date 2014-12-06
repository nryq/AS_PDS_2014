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

public class EquipoDAO {
	public static Equipo loadEquipoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadEquipoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo getEquipoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getEquipoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo loadEquipoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadEquipoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo getEquipoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getEquipoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo loadEquipoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Equipo) session.load(orm.Equipo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo getEquipoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Equipo) session.get(orm.Equipo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo loadEquipoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Equipo) session.load(orm.Equipo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo getEquipoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Equipo) session.get(orm.Equipo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEquipo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryEquipo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEquipo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryEquipo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo[] listEquipoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listEquipoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo[] listEquipoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listEquipoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEquipo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Equipo as Equipo");
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
	
	public static List queryEquipo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Equipo as Equipo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Equipo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo[] listEquipoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEquipo(session, condition, orderBy);
			return (Equipo[]) list.toArray(new Equipo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo[] listEquipoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEquipo(session, condition, orderBy, lockMode);
			return (Equipo[]) list.toArray(new Equipo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo loadEquipoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadEquipoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo loadEquipoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadEquipoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo loadEquipoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Equipo[] equipos = listEquipoByQuery(session, condition, orderBy);
		if (equipos != null && equipos.length > 0)
			return equipos[0];
		else
			return null;
	}
	
	public static Equipo loadEquipoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Equipo[] equipos = listEquipoByQuery(session, condition, orderBy, lockMode);
		if (equipos != null && equipos.length > 0)
			return equipos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEquipoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iterateEquipoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEquipoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iterateEquipoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEquipoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Equipo as Equipo");
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
	
	public static java.util.Iterator iterateEquipoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Equipo as Equipo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Equipo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo createEquipo() {
		return new orm.Equipo();
	}
	
	public static boolean save(orm.Equipo equipo) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(equipo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Equipo equipo) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(equipo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Equipo equipo)throws PersistentException {
		try {
			if(equipo.getClub() != null) {
				equipo.getClub().equipo.remove(equipo);
			}
			
			orm.Partida[] lPartidas = equipo.partida.toArray();
			for(int i = 0; i < lPartidas.length; i++) {
				lPartidas[i].setId_equipo_ganador(null);
			}
			orm.Persona_equipo[] lPersona_equipos = equipo.persona_equipo.toArray();
			for(int i = 0; i < lPersona_equipos.length; i++) {
				lPersona_equipos[i].setEquipo(null);
			}
			orm.Partida_equipo[] lPartida_equipos = equipo.partida_equipo.toArray();
			for(int i = 0; i < lPartida_equipos.length; i++) {
				lPartida_equipos[i].setEquipo(null);
			}
			return delete(equipo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Equipo equipo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(equipo.getClub() != null) {
				equipo.getClub().equipo.remove(equipo);
			}
			
			orm.Partida[] lPartidas = equipo.partida.toArray();
			for(int i = 0; i < lPartidas.length; i++) {
				lPartidas[i].setId_equipo_ganador(null);
			}
			orm.Persona_equipo[] lPersona_equipos = equipo.persona_equipo.toArray();
			for(int i = 0; i < lPersona_equipos.length; i++) {
				lPersona_equipos[i].setEquipo(null);
			}
			orm.Partida_equipo[] lPartida_equipos = equipo.partida_equipo.toArray();
			for(int i = 0; i < lPartida_equipos.length; i++) {
				lPartida_equipos[i].setEquipo(null);
			}
			try {
				session.delete(equipo);
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
	
	public static boolean refresh(orm.Equipo equipo) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(equipo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Equipo equipo) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(equipo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipo loadEquipoByCriteria(EquipoCriteria equipoCriteria) {
		Equipo[] equipos = listEquipoByCriteria(equipoCriteria);
		if(equipos == null || equipos.length == 0) {
			return null;
		}
		return equipos[0];
	}
	
	public static Equipo[] listEquipoByCriteria(EquipoCriteria equipoCriteria) {
		return equipoCriteria.listEquipo();
	}
}
