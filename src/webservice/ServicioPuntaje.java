package webservice;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class ServicioPuntaje {
	
	PersistentTransaction t;

	public String nuevoPuntaje(domain.PuntajeVO oPuntaje) {

		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();

			try {
				orm.Puntaje lormPuntaje = orm.PuntajeDAO.createPuntaje();
				// Initialize the properties of the persistent object here
				
				lormPuntaje.setBajas(oPuntaje.getBajas());
				lormPuntaje.setDerrotas(oPuntaje.getDerrotas());
				lormPuntaje.setMuertes(oPuntaje.getMuertes());
				lormPuntaje.setVictorias(oPuntaje.getVictorias());
				
				System.out.println("Ingreso Exitoso");
				orm.PuntajeDAO.save(lormPuntaje);
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
	
	public String modificarPuntaje(domain.PuntajeVO oPuntaje, int id){
		PersistentTransaction t;
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance().getSession().beginTransaction();
			
			try{
				
				orm.Puntaje lormPuntaje = orm.PuntajeDAO.loadPuntajeByQuery("id = "+id, null);
				
				lormPuntaje.setBajas(oPuntaje.getBajas()+lormPuntaje.getBajas());
				lormPuntaje.setMuertes(oPuntaje.getMuertes()+lormPuntaje.getMuertes());
				lormPuntaje.setVictorias(oPuntaje.getVictorias()+lormPuntaje.getVictorias());
				lormPuntaje.setDerrotas(oPuntaje.getDerrotas()+lormPuntaje.getDerrotas());
				lormPuntaje.setPartidas(lormPuntaje.getPartidas()+1);
				
				// Update the properties of the persistent object
				orm.PuntajeDAO.save(lormPuntaje);
				
				t.commit();
				
				return "Ingreso Exitoso";
			}catch(Exception e){
				t.rollback();
				return "Problemas";
			}
		}catch(Exception e){
			return "Problemas";
		}
		
	}
	

}
