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

public class PersonaDAO {
	public static Persona loadPersonaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersonaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPersonaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersonaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return getPersonaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona) session.load(orm.Persona.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Persona) session.get(orm.Persona.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona) session.load(orm.Persona.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona) session.get(orm.Persona.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPersona(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return queryPersona(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return listPersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
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
	
	public static List queryPersona(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersona(session, condition, orderBy);
			return (Persona[]) list.toArray(new Persona[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersona(session, condition, orderBy, lockMode);
			return (Persona[]) list.toArray(new Persona[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return loadPersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Persona[] personas = listPersonaByQuery(session, condition, orderBy);
		if (personas != null && personas.length > 0)
			return personas[0];
		else
			return null;
	}
	
	public static Persona loadPersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Persona[] personas = listPersonaByQuery(session, condition, orderBy, lockMode);
		if (personas != null && personas.length > 0)
			return personas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession();
			return iteratePersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
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
	
	public static java.util.Iterator iteratePersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona createPersona() {
		return new orm.Persona();
	}
	
	public static boolean save(orm.Persona persona) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().saveObject(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Persona persona) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().deleteObject(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona persona)throws PersistentException {
		try {
			if(persona.getPuntaje() != null) {
				persona.getPuntaje().persona.remove(persona);
			}
			
			orm.Persona_Rol[] lPersona_Rols = persona.persona_Rol.toArray();
			for(int i = 0; i < lPersona_Rols.length; i++) {
				lPersona_Rols[i].setId_Persona(null);
			}
			orm.Persona_Equipamiento[] lPersona_Equipamientos = persona.persona_Equipamiento.toArray();
			for(int i = 0; i < lPersona_Equipamientos.length; i++) {
				lPersona_Equipamientos[i].setId_Persona(null);
			}
			orm.Persona_Terreno[] lPersona_Terrenos = persona.persona_Terreno.toArray();
			for(int i = 0; i < lPersona_Terrenos.length; i++) {
				lPersona_Terrenos[i].setId_Persona(null);
			}
			if(persona.getClub() != null) {
				persona.getClub().setId_jefe(null);
			}
			
			orm.Club_Persona[] lClub_Personas = persona.club_Persona.toArray();
			for(int i = 0; i < lClub_Personas.length; i++) {
				lClub_Personas[i].setId_Persona(null);
			}
			orm.Persona_equipo[] lPersona_equipos = persona.persona_equipo.toArray();
			for(int i = 0; i < lPersona_equipos.length; i++) {
				lPersona_equipos[i].setPersona(null);
			}
			orm.Persona_Entidad[] lPersona_Entidads = persona.persona_Entidad.toArray();
			for(int i = 0; i < lPersona_Entidads.length; i++) {
				lPersona_Entidads[i].setId_persona(null);
			}
			return delete(persona);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona persona, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(persona.getPuntaje() != null) {
				persona.getPuntaje().persona.remove(persona);
			}
			
			orm.Persona_Rol[] lPersona_Rols = persona.persona_Rol.toArray();
			for(int i = 0; i < lPersona_Rols.length; i++) {
				lPersona_Rols[i].setId_Persona(null);
			}
			orm.Persona_Equipamiento[] lPersona_Equipamientos = persona.persona_Equipamiento.toArray();
			for(int i = 0; i < lPersona_Equipamientos.length; i++) {
				lPersona_Equipamientos[i].setId_Persona(null);
			}
			orm.Persona_Terreno[] lPersona_Terrenos = persona.persona_Terreno.toArray();
			for(int i = 0; i < lPersona_Terrenos.length; i++) {
				lPersona_Terrenos[i].setId_Persona(null);
			}
			if(persona.getClub() != null) {
				persona.getClub().setId_jefe(null);
			}
			
			orm.Club_Persona[] lClub_Personas = persona.club_Persona.toArray();
			for(int i = 0; i < lClub_Personas.length; i++) {
				lClub_Personas[i].setId_Persona(null);
			}
			orm.Persona_equipo[] lPersona_equipos = persona.persona_equipo.toArray();
			for(int i = 0; i < lPersona_equipos.length; i++) {
				lPersona_equipos[i].setPersona(null);
			}
			orm.Persona_Entidad[] lPersona_Entidads = persona.persona_Entidad.toArray();
			for(int i = 0; i < lPersona_Entidads.length; i++) {
				lPersona_Entidads[i].setId_persona(null);
			}
			try {
				session.delete(persona);
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
	
	public static boolean refresh(orm.Persona persona) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().refresh(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Persona persona) throws PersistentException {
		try {
			orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().evict(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByCriteria(PersonaCriteria personaCriteria) {
		Persona[] personas = listPersonaByCriteria(personaCriteria);
		if(personas == null || personas.length == 0) {
			return null;
		}
		return personas[0];
	}
	
	public static Persona[] listPersonaByCriteria(PersonaCriteria personaCriteria) {
		return personaCriteria.listPersona();
	}
}
