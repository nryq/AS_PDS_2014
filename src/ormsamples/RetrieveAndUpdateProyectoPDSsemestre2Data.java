/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoPDSsemestre2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			orm.PersonaDAO.save(lormPersona);
			orm.Rol lormRol = orm.RolDAO.loadRolByQuery(null, null);
			// Update the properties of the persistent object
			orm.RolDAO.save(lormRol);
			orm.Persona_Rol lormPersona_Rol = orm.Persona_RolDAO.loadPersona_RolByQuery(null, null);
			// Update the properties of the persistent object
			orm.Persona_RolDAO.save(lormPersona_Rol);
			orm.Equipamiento lormEquipamiento = orm.EquipamientoDAO.loadEquipamientoByQuery(null, null);
			// Update the properties of the persistent object
			orm.EquipamientoDAO.save(lormEquipamiento);
			orm.Persona_Equipamiento lormPersona_Equipamiento = orm.Persona_EquipamientoDAO.loadPersona_EquipamientoByQuery(null, null);
			// Update the properties of the persistent object
			orm.Persona_EquipamientoDAO.save(lormPersona_Equipamiento);
			orm.Tipo_equip lormTipo_equip = orm.Tipo_equipDAO.loadTipo_equipByQuery(null, null);
			// Update the properties of the persistent object
			orm.Tipo_equipDAO.save(lormTipo_equip);
			orm.Terreno lormTerreno = orm.TerrenoDAO.loadTerrenoByQuery(null, null);
			// Update the properties of the persistent object
			orm.TerrenoDAO.save(lormTerreno);
			orm.Persona_Terreno lormPersona_Terreno = orm.Persona_TerrenoDAO.loadPersona_TerrenoByQuery(null, null);
			// Update the properties of the persistent object
			orm.Persona_TerrenoDAO.save(lormPersona_Terreno);
			orm.Puntaje lormPuntaje = orm.PuntajeDAO.loadPuntajeByQuery(null, null);
			// Update the properties of the persistent object
			orm.PuntajeDAO.save(lormPuntaje);
			orm.Club lormClub = orm.ClubDAO.loadClubByQuery(null, null);
			// Update the properties of the persistent object
			orm.ClubDAO.save(lormClub);
			orm.Club_Persona lormClub_Persona = orm.Club_PersonaDAO.loadClub_PersonaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Club_PersonaDAO.save(lormClub_Persona);
			orm.Partida lormPartida = orm.PartidaDAO.loadPartidaByQuery(null, null);
			// Update the properties of the persistent object
			orm.PartidaDAO.save(lormPartida);
			orm.Equipo lormEquipo = orm.EquipoDAO.loadEquipoByQuery(null, null);
			// Update the properties of the persistent object
			orm.EquipoDAO.save(lormEquipo);
			orm.Persona_equipo lormPersona_equipo = orm.Persona_equipoDAO.loadPersona_equipoByQuery(null, null);
			// Update the properties of the persistent object
			orm.Persona_equipoDAO.save(lormPersona_equipo);
			orm.Partida_equipo lormPartida_equipo = orm.Partida_equipoDAO.loadPartida_equipoByQuery(null, null);
			// Update the properties of the persistent object
			orm.Partida_equipoDAO.save(lormPartida_equipo);
			orm.Movimiento lormMovimiento = orm.MovimientoDAO.loadMovimientoByQuery(null, null);
			// Update the properties of the persistent object
			orm.MovimientoDAO.save(lormMovimiento);
			orm.Persona_Entidad lormPersona_Entidad = orm.Persona_EntidadDAO.loadPersona_EntidadByQuery(null, null);
			// Update the properties of the persistent object
			orm.Persona_EntidadDAO.save(lormPersona_Entidad);
			orm.Partida_movimiento lormPartida_movimiento = orm.Partida_movimientoDAO.loadPartida_movimientoByQuery(null, null);
			// Update the properties of the persistent object
			orm.Partida_movimientoDAO.save(lormPartida_movimiento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Persona by PersonaCriteria");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersonaCriteria.id.eq();
		System.out.println(lormPersonaCriteria.uniquePersona());
		
		System.out.println("Retrieving Rol by RolCriteria");
		orm.RolCriteria lormRolCriteria = new orm.RolCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormRolCriteria.id_rol.eq();
		System.out.println(lormRolCriteria.uniqueRol());
		
		System.out.println("Retrieving Persona_Rol by Persona_RolCriteria");
		orm.Persona_RolCriteria lormPersona_RolCriteria = new orm.Persona_RolCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersona_RolCriteria.id.eq();
		System.out.println(lormPersona_RolCriteria.uniquePersona_Rol());
		
		System.out.println("Retrieving Equipamiento by EquipamientoCriteria");
		orm.EquipamientoCriteria lormEquipamientoCriteria = new orm.EquipamientoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEquipamientoCriteria.id.eq();
		System.out.println(lormEquipamientoCriteria.uniqueEquipamiento());
		
		System.out.println("Retrieving Persona_Equipamiento by Persona_EquipamientoCriteria");
		orm.Persona_EquipamientoCriteria lormPersona_EquipamientoCriteria = new orm.Persona_EquipamientoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersona_EquipamientoCriteria.id.eq();
		System.out.println(lormPersona_EquipamientoCriteria.uniquePersona_Equipamiento());
		
		System.out.println("Retrieving Tipo_equip by Tipo_equipCriteria");
		orm.Tipo_equipCriteria lormTipo_equipCriteria = new orm.Tipo_equipCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormTipo_equipCriteria.id_tipo.eq();
		System.out.println(lormTipo_equipCriteria.uniqueTipo_equip());
		
		System.out.println("Retrieving Terreno by TerrenoCriteria");
		orm.TerrenoCriteria lormTerrenoCriteria = new orm.TerrenoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormTerrenoCriteria.id.eq();
		System.out.println(lormTerrenoCriteria.uniqueTerreno());
		
		System.out.println("Retrieving Persona_Terreno by Persona_TerrenoCriteria");
		orm.Persona_TerrenoCriteria lormPersona_TerrenoCriteria = new orm.Persona_TerrenoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersona_TerrenoCriteria.id.eq();
		System.out.println(lormPersona_TerrenoCriteria.uniquePersona_Terreno());
		
		System.out.println("Retrieving Puntaje by PuntajeCriteria");
		orm.PuntajeCriteria lormPuntajeCriteria = new orm.PuntajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPuntajeCriteria.id.eq();
		System.out.println(lormPuntajeCriteria.uniquePuntaje());
		
		System.out.println("Retrieving Club by ClubCriteria");
		orm.ClubCriteria lormClubCriteria = new orm.ClubCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormClubCriteria.id.eq();
		System.out.println(lormClubCriteria.uniqueClub());
		
		System.out.println("Retrieving Club_Persona by Club_PersonaCriteria");
		orm.Club_PersonaCriteria lormClub_PersonaCriteria = new orm.Club_PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormClub_PersonaCriteria.id.eq();
		System.out.println(lormClub_PersonaCriteria.uniqueClub_Persona());
		
		System.out.println("Retrieving Partida by PartidaCriteria");
		orm.PartidaCriteria lormPartidaCriteria = new orm.PartidaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPartidaCriteria.id.eq();
		System.out.println(lormPartidaCriteria.uniquePartida());
		
		System.out.println("Retrieving Equipo by EquipoCriteria");
		orm.EquipoCriteria lormEquipoCriteria = new orm.EquipoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEquipoCriteria.id.eq();
		System.out.println(lormEquipoCriteria.uniqueEquipo());
		
		System.out.println("Retrieving Persona_equipo by Persona_equipoCriteria");
		orm.Persona_equipoCriteria lormPersona_equipoCriteria = new orm.Persona_equipoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersona_equipoCriteria.id.eq();
		System.out.println(lormPersona_equipoCriteria.uniquePersona_equipo());
		
		System.out.println("Retrieving Partida_equipo by Partida_equipoCriteria");
		orm.Partida_equipoCriteria lormPartida_equipoCriteria = new orm.Partida_equipoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPartida_equipoCriteria.id.eq();
		System.out.println(lormPartida_equipoCriteria.uniquePartida_equipo());
		
		System.out.println("Retrieving Movimiento by MovimientoCriteria");
		orm.MovimientoCriteria lormMovimientoCriteria = new orm.MovimientoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMovimientoCriteria.id.eq();
		System.out.println(lormMovimientoCriteria.uniqueMovimiento());
		
		System.out.println("Retrieving Persona_Entidad by Persona_EntidadCriteria");
		orm.Persona_EntidadCriteria lormPersona_EntidadCriteria = new orm.Persona_EntidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersona_EntidadCriteria.id.eq();
		System.out.println(lormPersona_EntidadCriteria.uniquePersona_Entidad());
		
		System.out.println("Retrieving Partida_movimiento by Partida_movimientoCriteria");
		orm.Partida_movimientoCriteria lormPartida_movimientoCriteria = new orm.Partida_movimientoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPartida_movimientoCriteria.id.eq();
		System.out.println(lormPartida_movimientoCriteria.uniquePartida_movimiento());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoPDSsemestre2Data retrieveAndUpdateProyectoPDSsemestre2Data = new RetrieveAndUpdateProyectoPDSsemestre2Data();
			try {
				retrieveAndUpdateProyectoPDSsemestre2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoPDSsemestre2Data.retrieveByCriteria();
			}
			finally {
				orm.ProyectoPDSsemestre2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
