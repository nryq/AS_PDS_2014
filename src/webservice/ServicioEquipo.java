package webservice;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class ServicioEquipo {

	PersistentTransaction t;
/*
	public String crearEquipo(domain.EquipoVO oEquipoVO) {
/*
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().beginTransaction();

			try {
				orm.Equipo lormEquipo = orm.EquipoDAO.createEquipo();
				// Initialize the properties of the persistent object here
				lormEquipo.setNombre(oEquipoVO.getNombre());
				lormEquipo.setClub(oEquipoVO.getId_club());
				
				System.out.println("Ingreso Exitoso");
				orm.EquipoDAO.save(lormEquipo);
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
		return "asd";
	}*/

}
