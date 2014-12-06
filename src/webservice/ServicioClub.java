package webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import domain.ClubVO;
import domain.PersonaVO;

public class ServicioClub {
	/*
	public String crearClub(domain.ClubVO oClubVO, String id_jefe) {

		try {
			
			PersistentTransaction t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();

			try {
				
				orm.Persona jefe = orm.PersonaDAO.loadPersonaByQuery("id_jefe = "+id_jefe, null);
				
				orm.Club lormClub = orm.ClubDAO.createClub();
				
				
				// Initialize the properties of the persistent object here
				lormClub.setId_jefe(jefe);
				lormClub.setNombre(oClubVO.getNombre());
				lormClub.setLocalidad(oClubVO.getLocalidad());
				lormClub.setDescripcion(oClubVO.getDescripcion());

				System.out.println("Ingreso Exitoso");
				orm.ClubDAO.save(lormClub);
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

	/*
	public String borrarClub(int id){
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Club lormPersona = orm.ClubDAO.loadClubByQuery("id="+id, null);
				// Delete the persistent object
				orm.ClubDAO.delete(lormPersona);
				t.commit();
				return "borrado";
			} catch (Exception e) {
				t.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "Error persistencia";
		}
		
	}*/
	
	
	public String agregarPersonaClub(String correoPersona, String nombreClub){
		
		try {
			PersistentTransaction r = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();

			try {
				
				orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(
						"correo = '"+correoPersona+"'", null);
				
				orm.Club lormClub = orm.ClubDAO.loadClubByQuery("nombre = '"+nombreClub+"'", null);
				
				/*
				 * buscar obj pers por correo
				 * buscar obj club por nombre
				 * 
				 * 
				 */
				orm.Club_Persona lormClubPersona = orm.Club_PersonaDAO.createClub_Persona();
				// Initialize the properties of the persistent object here
				
				lormClubPersona.setId_club(lormClub);
				lormClubPersona.setId_Persona(lormPersona);
	

				System.out.println("Ingreso Exitoso");
				orm.Club_PersonaDAO.save(lormClubPersona);
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

	/*
	public static List<domain.ClubVO> listarClub() {
		// TODO: BUSCAR CLIENTES
		List<domain.ClubVO> clientesIngresados = new ArrayList<domain.ClubVO>();
		
		try {
			orm.Club[] clientes = orm.ClubDAO.listClubByQuery(null,null);

			for (int i = 0; i < clientes.length; i++) {
				
				ClubVO client = new ClubVO(
						clientes[i].getId_jefe(),
						clientes[i].getNombre(),
						clientes[i].getLocalidad(),
						clientes[i].getDescripcion()
						);
				
				
				clientesIngresados.add(client);

			}

			return clientesIngresados;

		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}*/

}
