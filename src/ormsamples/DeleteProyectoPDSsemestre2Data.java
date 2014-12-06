/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoPDSsemestre2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.Rol lormRol = orm.RolDAO.loadRolByQuery(null, null);
			// Delete the persistent object
			orm.RolDAO.delete(lormRol);
			orm.Persona_Rol lormPersona_Rol = orm.Persona_RolDAO.loadPersona_RolByQuery(null, null);
			// Delete the persistent object
			orm.Persona_RolDAO.delete(lormPersona_Rol);
			orm.Equipamiento lormEquipamiento = orm.EquipamientoDAO.loadEquipamientoByQuery(null, null);
			// Delete the persistent object
			orm.EquipamientoDAO.delete(lormEquipamiento);
			orm.Persona_Equipamiento lormPersona_Equipamiento = orm.Persona_EquipamientoDAO.loadPersona_EquipamientoByQuery(null, null);
			// Delete the persistent object
			orm.Persona_EquipamientoDAO.delete(lormPersona_Equipamiento);
			orm.Tipo_equip lormTipo_equip = orm.Tipo_equipDAO.loadTipo_equipByQuery(null, null);
			// Delete the persistent object
			orm.Tipo_equipDAO.delete(lormTipo_equip);
			orm.Terreno lormTerreno = orm.TerrenoDAO.loadTerrenoByQuery(null, null);
			// Delete the persistent object
			orm.TerrenoDAO.delete(lormTerreno);
			orm.Persona_Terreno lormPersona_Terreno = orm.Persona_TerrenoDAO.loadPersona_TerrenoByQuery(null, null);
			// Delete the persistent object
			orm.Persona_TerrenoDAO.delete(lormPersona_Terreno);
			orm.Puntaje lormPuntaje = orm.PuntajeDAO.loadPuntajeByQuery(null, null);
			// Delete the persistent object
			orm.PuntajeDAO.delete(lormPuntaje);
			orm.Club lormClub = orm.ClubDAO.loadClubByQuery(null, null);
			// Delete the persistent object
			orm.ClubDAO.delete(lormClub);
			orm.Club_Persona lormClub_Persona = orm.Club_PersonaDAO.loadClub_PersonaByQuery(null, null);
			// Delete the persistent object
			orm.Club_PersonaDAO.delete(lormClub_Persona);
			orm.Partida lormPartida = orm.PartidaDAO.loadPartidaByQuery(null, null);
			// Delete the persistent object
			orm.PartidaDAO.delete(lormPartida);
			orm.Equipo lormEquipo = orm.EquipoDAO.loadEquipoByQuery(null, null);
			// Delete the persistent object
			orm.EquipoDAO.delete(lormEquipo);
			orm.Persona_equipo lormPersona_equipo = orm.Persona_equipoDAO.loadPersona_equipoByQuery(null, null);
			// Delete the persistent object
			orm.Persona_equipoDAO.delete(lormPersona_equipo);
			orm.Partida_equipo lormPartida_equipo = orm.Partida_equipoDAO.loadPartida_equipoByQuery(null, null);
			// Delete the persistent object
			orm.Partida_equipoDAO.delete(lormPartida_equipo);
			orm.Movimiento lormMovimiento = orm.MovimientoDAO.loadMovimientoByQuery(null, null);
			// Delete the persistent object
			orm.MovimientoDAO.delete(lormMovimiento);
			orm.Persona_Entidad lormPersona_Entidad = orm.Persona_EntidadDAO.loadPersona_EntidadByQuery(null, null);
			// Delete the persistent object
			orm.Persona_EntidadDAO.delete(lormPersona_Entidad);
			orm.Partida_movimiento lormPartida_movimiento = orm.Partida_movimientoDAO.loadPartida_movimientoByQuery(null, null);
			// Delete the persistent object
			orm.Partida_movimientoDAO.delete(lormPartida_movimiento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoPDSsemestre2Data deleteProyectoPDSsemestre2Data = new DeleteProyectoPDSsemestre2Data();
			try {
				deleteProyectoPDSsemestre2Data.deleteTestData();
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
