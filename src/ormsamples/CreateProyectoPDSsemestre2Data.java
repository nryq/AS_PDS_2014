/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoPDSsemestre2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona_Entidad, persona_equipo, club_Persona, club, persona_Terreno, persona_Equipamiento, persona_Rol, correo, nombre
			orm.PersonaDAO.save(lormPersona);
			orm.Rol lormRol = orm.RolDAO.createRol();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona_Rol, desc_rol
			orm.RolDAO.save(lormRol);
			orm.Persona_Rol lormPersona_Rol = orm.Persona_RolDAO.createPersona_Rol();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_Rol, id_Persona
			orm.Persona_RolDAO.save(lormPersona_Rol);
			orm.Equipamiento lormEquipamiento = orm.EquipamientoDAO.createEquipamiento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona_Equipamiento, nombre
			orm.EquipamientoDAO.save(lormEquipamiento);
			orm.Persona_Equipamiento lormPersona_Equipamiento = orm.Persona_EquipamientoDAO.createPersona_Equipamiento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_Equipamiento, id_Persona
			orm.Persona_EquipamientoDAO.save(lormPersona_Equipamiento);
			orm.Tipo_equip lormTipo_equip = orm.Tipo_equipDAO.createTipo_equip();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : desc_tipo
			orm.Tipo_equipDAO.save(lormTipo_equip);
			orm.Terreno lormTerreno = orm.TerrenoDAO.createTerreno();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona_Terreno, valor, direccion, nombre
			orm.TerrenoDAO.save(lormTerreno);
			orm.Persona_Terreno lormPersona_Terreno = orm.Persona_TerrenoDAO.createPersona_Terreno();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_Terreno, id_Persona
			orm.Persona_TerrenoDAO.save(lormPersona_Terreno);
			orm.Puntaje lormPuntaje = orm.PuntajeDAO.createPuntaje();
			// Initialize the properties of the persistent object here
			orm.PuntajeDAO.save(lormPuntaje);
			orm.Club lormClub = orm.ClubDAO.createClub();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipo, club_Persona, localidad, id_jefe, nombre
			orm.ClubDAO.save(lormClub);
			orm.Club_Persona lormClub_Persona = orm.Club_PersonaDAO.createClub_Persona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_Persona, id_club
			orm.Club_PersonaDAO.save(lormClub_Persona);
			orm.Partida lormPartida = orm.PartidaDAO.createPartida();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partida_movimiento, partida_equipo, fecha_hr, lugar
			orm.PartidaDAO.save(lormPartida);
			orm.Equipo lormEquipo = orm.EquipoDAO.createEquipo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partida_equipo, persona_equipo, club, nombre
			orm.EquipoDAO.save(lormEquipo);
			orm.Persona_equipo lormPersona_equipo = orm.Persona_equipoDAO.createPersona_equipo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipo, persona
			orm.Persona_equipoDAO.save(lormPersona_equipo);
			orm.Partida_equipo lormPartida_equipo = orm.Partida_equipoDAO.createPartida_equipo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipo, partida
			orm.Partida_equipoDAO.save(lormPartida_equipo);
			orm.Movimiento lormMovimiento = orm.MovimientoDAO.createMovimiento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partida_movimiento, persona_Entidad, destino, nombre
			orm.MovimientoDAO.save(lormMovimiento);
			orm.Persona_Entidad lormPersona_Entidad = orm.Persona_EntidadDAO.createPersona_Entidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_movimiento, id_persona
			orm.Persona_EntidadDAO.save(lormPersona_Entidad);
			orm.Partida_movimiento lormPartida_movimiento = orm.Partida_movimientoDAO.createPartida_movimiento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : movimiento, partida
			orm.Partida_movimientoDAO.save(lormPartida_movimiento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoPDSsemestre2Data createProyectoPDSsemestre2Data = new CreateProyectoPDSsemestre2Data();
			try {
				createProyectoPDSsemestre2Data.createTestData();
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
