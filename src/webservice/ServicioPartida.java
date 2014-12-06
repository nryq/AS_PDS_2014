package webservice;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class ServicioPartida {

	PersistentTransaction t;
/*
	public String nuevaPartida(domain.PartidaVO oPartidaVO) {

		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();

			try {
				orm.Partida lormPartida = orm.PartidaDAO.createPartida();
				// Initialize the properties of the persistent object here
				
				lormPartida.setLugar(oPartidaVO.getLugar());
				
				lormPartida.setFecha_hr(oPartidaVO.getFecha());
				lormPartida.setId_equipo_ganador(oPartidaVO.getEq_ganador());
				
				System.out.println("Ingreso Exitoso");
				orm.PartidaDAO.save(lormPartida);
				t.commit();
				return "ingreso existoso";
			} catch (Exception e) {
				t.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "Error persistencia";
		}
	}
	*/
	
	public String agregarEquipoPartida(String nombre_Equipo, String fecha_Partida){
		
		try {
			PersistentTransaction r = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();

			try {
				orm.Equipo  oEquipo = orm.EquipoDAO.loadEquipoByQuery("nombre = '"+nombre_Equipo+"'", null);
				orm.Partida oPartida = orm.PartidaDAO.loadPartidaByQuery("fecha_hr = '"+fecha_Partida+"'", null);
				
				orm.Partida_equipo lormPartida = orm.Partida_equipoDAO.createPartida_equipo();
				// Initialize the properties of the persistent object here
				
				lormPartida.setEquipo(oEquipo);
				lormPartida.setPartida(oPartida);
				
				System.out.println("Ingreso Exitoso");
				orm.Partida_equipoDAO.save(lormPartida);
				r.commit();
				return "ingreso existoso";
			} catch (Exception e) {
				r.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "Error persistencia";
		}
		
	}

}
