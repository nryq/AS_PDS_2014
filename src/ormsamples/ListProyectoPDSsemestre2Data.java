/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoPDSsemestre2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Persona...");
		orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery(null, null);
		int length = Math.min(ormPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Rol...");
		orm.Rol[] ormRols = orm.RolDAO.listRolByQuery(null, null);
		length = Math.min(ormRols.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormRols[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona_Rol...");
		orm.Persona_Rol[] ormPersona_Rols = orm.Persona_RolDAO.listPersona_RolByQuery(null, null);
		length = Math.min(ormPersona_Rols.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersona_Rols[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Equipamiento...");
		orm.Equipamiento[] ormEquipamientos = orm.EquipamientoDAO.listEquipamientoByQuery(null, null);
		length = Math.min(ormEquipamientos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEquipamientos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona_Equipamiento...");
		orm.Persona_Equipamiento[] ormPersona_Equipamientos = orm.Persona_EquipamientoDAO.listPersona_EquipamientoByQuery(null, null);
		length = Math.min(ormPersona_Equipamientos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersona_Equipamientos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tipo_equip...");
		orm.Tipo_equip[] ormTipo_equips = orm.Tipo_equipDAO.listTipo_equipByQuery(null, null);
		length = Math.min(ormTipo_equips.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTipo_equips[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Terreno...");
		orm.Terreno[] ormTerrenos = orm.TerrenoDAO.listTerrenoByQuery(null, null);
		length = Math.min(ormTerrenos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTerrenos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona_Terreno...");
		orm.Persona_Terreno[] ormPersona_Terrenos = orm.Persona_TerrenoDAO.listPersona_TerrenoByQuery(null, null);
		length = Math.min(ormPersona_Terrenos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersona_Terrenos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Puntaje...");
		orm.Puntaje[] ormPuntajes = orm.PuntajeDAO.listPuntajeByQuery(null, null);
		length = Math.min(ormPuntajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPuntajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Club...");
		orm.Club[] ormClubs = orm.ClubDAO.listClubByQuery(null, null);
		length = Math.min(ormClubs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormClubs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Club_Persona...");
		orm.Club_Persona[] ormClub_Personas = orm.Club_PersonaDAO.listClub_PersonaByQuery(null, null);
		length = Math.min(ormClub_Personas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormClub_Personas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Partida...");
		orm.Partida[] ormPartidas = orm.PartidaDAO.listPartidaByQuery(null, null);
		length = Math.min(ormPartidas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPartidas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Equipo...");
		orm.Equipo[] ormEquipos = orm.EquipoDAO.listEquipoByQuery(null, null);
		length = Math.min(ormEquipos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEquipos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona_equipo...");
		orm.Persona_equipo[] ormPersona_equipos = orm.Persona_equipoDAO.listPersona_equipoByQuery(null, null);
		length = Math.min(ormPersona_equipos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersona_equipos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Partida_equipo...");
		orm.Partida_equipo[] ormPartida_equipos = orm.Partida_equipoDAO.listPartida_equipoByQuery(null, null);
		length = Math.min(ormPartida_equipos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPartida_equipos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Movimiento...");
		orm.Movimiento[] ormMovimientos = orm.MovimientoDAO.listMovimientoByQuery(null, null);
		length = Math.min(ormMovimientos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMovimientos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona_Entidad...");
		orm.Persona_Entidad[] ormPersona_Entidads = orm.Persona_EntidadDAO.listPersona_EntidadByQuery(null, null);
		length = Math.min(ormPersona_Entidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersona_Entidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Partida_movimiento...");
		orm.Partida_movimiento[] ormPartida_movimientos = orm.Partida_movimientoDAO.listPartida_movimientoByQuery(null, null);
		length = Math.min(ormPartida_movimientos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPartida_movimientos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Persona by Criteria...");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersonaCriteria.id.eq();
		lormPersonaCriteria.setMaxResults(ROW_COUNT);
		orm.Persona[] ormPersonas = lormPersonaCriteria.listPersona();
		int length =ormPersonas== null ? 0 : Math.min(ormPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Rol by Criteria...");
		orm.RolCriteria lormRolCriteria = new orm.RolCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormRolCriteria.id_rol.eq();
		lormRolCriteria.setMaxResults(ROW_COUNT);
		orm.Rol[] ormRols = lormRolCriteria.listRol();
		length =ormRols== null ? 0 : Math.min(ormRols.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormRols[i]);
		}
		System.out.println(length + " Rol record(s) retrieved."); 
		
		System.out.println("Listing Persona_Rol by Criteria...");
		orm.Persona_RolCriteria lormPersona_RolCriteria = new orm.Persona_RolCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersona_RolCriteria.id.eq();
		lormPersona_RolCriteria.setMaxResults(ROW_COUNT);
		orm.Persona_Rol[] ormPersona_Rols = lormPersona_RolCriteria.listPersona_Rol();
		length =ormPersona_Rols== null ? 0 : Math.min(ormPersona_Rols.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersona_Rols[i]);
		}
		System.out.println(length + " Persona_Rol record(s) retrieved."); 
		
		System.out.println("Listing Equipamiento by Criteria...");
		orm.EquipamientoCriteria lormEquipamientoCriteria = new orm.EquipamientoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEquipamientoCriteria.id.eq();
		lormEquipamientoCriteria.setMaxResults(ROW_COUNT);
		orm.Equipamiento[] ormEquipamientos = lormEquipamientoCriteria.listEquipamiento();
		length =ormEquipamientos== null ? 0 : Math.min(ormEquipamientos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEquipamientos[i]);
		}
		System.out.println(length + " Equipamiento record(s) retrieved."); 
		
		System.out.println("Listing Persona_Equipamiento by Criteria...");
		orm.Persona_EquipamientoCriteria lormPersona_EquipamientoCriteria = new orm.Persona_EquipamientoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersona_EquipamientoCriteria.id.eq();
		lormPersona_EquipamientoCriteria.setMaxResults(ROW_COUNT);
		orm.Persona_Equipamiento[] ormPersona_Equipamientos = lormPersona_EquipamientoCriteria.listPersona_Equipamiento();
		length =ormPersona_Equipamientos== null ? 0 : Math.min(ormPersona_Equipamientos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersona_Equipamientos[i]);
		}
		System.out.println(length + " Persona_Equipamiento record(s) retrieved."); 
		
		System.out.println("Listing Tipo_equip by Criteria...");
		orm.Tipo_equipCriteria lormTipo_equipCriteria = new orm.Tipo_equipCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormTipo_equipCriteria.id_tipo.eq();
		lormTipo_equipCriteria.setMaxResults(ROW_COUNT);
		orm.Tipo_equip[] ormTipo_equips = lormTipo_equipCriteria.listTipo_equip();
		length =ormTipo_equips== null ? 0 : Math.min(ormTipo_equips.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormTipo_equips[i]);
		}
		System.out.println(length + " Tipo_equip record(s) retrieved."); 
		
		System.out.println("Listing Terreno by Criteria...");
		orm.TerrenoCriteria lormTerrenoCriteria = new orm.TerrenoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormTerrenoCriteria.id.eq();
		lormTerrenoCriteria.setMaxResults(ROW_COUNT);
		orm.Terreno[] ormTerrenos = lormTerrenoCriteria.listTerreno();
		length =ormTerrenos== null ? 0 : Math.min(ormTerrenos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormTerrenos[i]);
		}
		System.out.println(length + " Terreno record(s) retrieved."); 
		
		System.out.println("Listing Persona_Terreno by Criteria...");
		orm.Persona_TerrenoCriteria lormPersona_TerrenoCriteria = new orm.Persona_TerrenoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersona_TerrenoCriteria.id.eq();
		lormPersona_TerrenoCriteria.setMaxResults(ROW_COUNT);
		orm.Persona_Terreno[] ormPersona_Terrenos = lormPersona_TerrenoCriteria.listPersona_Terreno();
		length =ormPersona_Terrenos== null ? 0 : Math.min(ormPersona_Terrenos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersona_Terrenos[i]);
		}
		System.out.println(length + " Persona_Terreno record(s) retrieved."); 
		
		System.out.println("Listing Puntaje by Criteria...");
		orm.PuntajeCriteria lormPuntajeCriteria = new orm.PuntajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPuntajeCriteria.id.eq();
		lormPuntajeCriteria.setMaxResults(ROW_COUNT);
		orm.Puntaje[] ormPuntajes = lormPuntajeCriteria.listPuntaje();
		length =ormPuntajes== null ? 0 : Math.min(ormPuntajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPuntajes[i]);
		}
		System.out.println(length + " Puntaje record(s) retrieved."); 
		
		System.out.println("Listing Club by Criteria...");
		orm.ClubCriteria lormClubCriteria = new orm.ClubCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormClubCriteria.id.eq();
		lormClubCriteria.setMaxResults(ROW_COUNT);
		orm.Club[] ormClubs = lormClubCriteria.listClub();
		length =ormClubs== null ? 0 : Math.min(ormClubs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormClubs[i]);
		}
		System.out.println(length + " Club record(s) retrieved."); 
		
		System.out.println("Listing Club_Persona by Criteria...");
		orm.Club_PersonaCriteria lormClub_PersonaCriteria = new orm.Club_PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormClub_PersonaCriteria.id.eq();
		lormClub_PersonaCriteria.setMaxResults(ROW_COUNT);
		orm.Club_Persona[] ormClub_Personas = lormClub_PersonaCriteria.listClub_Persona();
		length =ormClub_Personas== null ? 0 : Math.min(ormClub_Personas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormClub_Personas[i]);
		}
		System.out.println(length + " Club_Persona record(s) retrieved."); 
		
		System.out.println("Listing Partida by Criteria...");
		orm.PartidaCriteria lormPartidaCriteria = new orm.PartidaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPartidaCriteria.id.eq();
		lormPartidaCriteria.setMaxResults(ROW_COUNT);
		orm.Partida[] ormPartidas = lormPartidaCriteria.listPartida();
		length =ormPartidas== null ? 0 : Math.min(ormPartidas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPartidas[i]);
		}
		System.out.println(length + " Partida record(s) retrieved."); 
		
		System.out.println("Listing Equipo by Criteria...");
		orm.EquipoCriteria lormEquipoCriteria = new orm.EquipoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEquipoCriteria.id.eq();
		lormEquipoCriteria.setMaxResults(ROW_COUNT);
		orm.Equipo[] ormEquipos = lormEquipoCriteria.listEquipo();
		length =ormEquipos== null ? 0 : Math.min(ormEquipos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEquipos[i]);
		}
		System.out.println(length + " Equipo record(s) retrieved."); 
		
		System.out.println("Listing Persona_equipo by Criteria...");
		orm.Persona_equipoCriteria lormPersona_equipoCriteria = new orm.Persona_equipoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersona_equipoCriteria.id.eq();
		lormPersona_equipoCriteria.setMaxResults(ROW_COUNT);
		orm.Persona_equipo[] ormPersona_equipos = lormPersona_equipoCriteria.listPersona_equipo();
		length =ormPersona_equipos== null ? 0 : Math.min(ormPersona_equipos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersona_equipos[i]);
		}
		System.out.println(length + " Persona_equipo record(s) retrieved."); 
		
		System.out.println("Listing Partida_equipo by Criteria...");
		orm.Partida_equipoCriteria lormPartida_equipoCriteria = new orm.Partida_equipoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPartida_equipoCriteria.id.eq();
		lormPartida_equipoCriteria.setMaxResults(ROW_COUNT);
		orm.Partida_equipo[] ormPartida_equipos = lormPartida_equipoCriteria.listPartida_equipo();
		length =ormPartida_equipos== null ? 0 : Math.min(ormPartida_equipos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPartida_equipos[i]);
		}
		System.out.println(length + " Partida_equipo record(s) retrieved."); 
		
		System.out.println("Listing Movimiento by Criteria...");
		orm.MovimientoCriteria lormMovimientoCriteria = new orm.MovimientoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMovimientoCriteria.id.eq();
		lormMovimientoCriteria.setMaxResults(ROW_COUNT);
		orm.Movimiento[] ormMovimientos = lormMovimientoCriteria.listMovimiento();
		length =ormMovimientos== null ? 0 : Math.min(ormMovimientos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMovimientos[i]);
		}
		System.out.println(length + " Movimiento record(s) retrieved."); 
		
		System.out.println("Listing Persona_Entidad by Criteria...");
		orm.Persona_EntidadCriteria lormPersona_EntidadCriteria = new orm.Persona_EntidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersona_EntidadCriteria.id.eq();
		lormPersona_EntidadCriteria.setMaxResults(ROW_COUNT);
		orm.Persona_Entidad[] ormPersona_Entidads = lormPersona_EntidadCriteria.listPersona_Entidad();
		length =ormPersona_Entidads== null ? 0 : Math.min(ormPersona_Entidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersona_Entidads[i]);
		}
		System.out.println(length + " Persona_Entidad record(s) retrieved."); 
		
		System.out.println("Listing Partida_movimiento by Criteria...");
		orm.Partida_movimientoCriteria lormPartida_movimientoCriteria = new orm.Partida_movimientoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPartida_movimientoCriteria.id.eq();
		lormPartida_movimientoCriteria.setMaxResults(ROW_COUNT);
		orm.Partida_movimiento[] ormPartida_movimientos = lormPartida_movimientoCriteria.listPartida_movimiento();
		length =ormPartida_movimientos== null ? 0 : Math.min(ormPartida_movimientos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPartida_movimientos[i]);
		}
		System.out.println(length + " Partida_movimiento record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoPDSsemestre2Data listProyectoPDSsemestre2Data = new ListProyectoPDSsemestre2Data();
			try {
				listProyectoPDSsemestre2Data.listTestData();
				//listProyectoPDSsemestre2Data.listByCriteria();
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
