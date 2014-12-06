package webservice;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import domain.ClubPersonaVO;
import domain.PersonaVO;


public class ServicioPersona {
	
	
	public String nuevaPersona(domain.PersonaVO oPersonaVO) {
		
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Persona lormPersona = orm.PersonaDAO.createPersona();
				// Initialize the properties of the persistent object here
				lormPersona.setNombre(oPersonaVO.getNombre());
				lormPersona.setCorreo((oPersonaVO.getCorreo()));
				lormPersona.setClave((oPersonaVO.getClave()));
				lormPersona.setDescripcion((oPersonaVO.getDescripcion()));
				System.out.println("Ingreso Exitoso");
				orm.PersonaDAO.save(lormPersona);
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
	
	public String borrarPersona(int id){
		
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery("id="+id, null);
				// Delete the persistent object
				orm.PersonaDAO.delete(lormPersona);
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
		
	}
	
	public String modificarPersona(String correo, domain.PersonaVO oPersonaVO){
		
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery("correo = '"+correo+"'", null);
				// Update the properties of the persistent object
				
				if(oPersonaVO.getNombre()!=null){
					lormPersona.setNombre(oPersonaVO.getNombre());
				}
				if(oPersonaVO.getNombre()!=null){
					lormPersona.setClave(oPersonaVO.getClave());
				}
				if(oPersonaVO.getNombre()!=null){
					lormPersona.setDescripcion((oPersonaVO.getDescripcion()));
				}
				
				orm.PersonaDAO.save(lormPersona);
				t.commit();
				return "Modificado";
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
	public orm.Persona[] listarPersona() throws PersistentException{
		
		try{
			try{
				orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery(null, null);
				return ormPersonas;
			}catch(Exception e1){
				
				return null;
			}
		}catch(Exception e){
			return null;
		}
	}*/
	
	public ArrayList<domain.PersonaVO> BuscarPersona(String correo, String clave){
		
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery( "correo = '"+correo+"' and "
						+ "clave = '"+clave+"'", null);
				
				ArrayList<domain.PersonaVO> personas = new ArrayList<PersonaVO>();
				
				for(int c=0; c<ormPersonas.length;c++){
					
					personas.add(new PersonaVO(
							ormPersonas[c].getNombre(), 
							ormPersonas[c].getCorreo(), 
							ormPersonas[c].getClave(),
							ormPersonas[c].getDescripcion()
							));
					
				}
				
				t.commit();
				return personas;
			} catch (Exception e) {
				t.rollback();
				return null;
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
	}
	/*
	public ArrayList<domain.ClubPersonaVO> filtrarClubesPersona(String correo){
		
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery("correo = '"+correo+"'", null);

				orm.Club_Persona[] ormClubPersonas = orm.Club_PersonaDAO.listClub_PersonaByQuery(
						"id_persona = " + lormPersona.getId(),null);
				
				ArrayList<domain.ClubPersonaVO> clubPer = new ArrayList<ClubPersonaVO>();
				
				for(int c=0; c<ormClubPersonas.length;c++){
					
					clubPer.add(new ClubPersonaVO(
							ormClubPersonas[c].getId_club(),
							ormClubPersonas[c].getId_Persona()
							));
					
				}
				
				t.commit();
				return clubPer;
			} catch (Exception e) {
				t.rollback();
				return null;
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
	}*/
	
	
	
	/*
	public String agregarPersonaEquipo(String correo, String team){
		
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				
				orm.Persona persona = orm.PersonaDAO.loadPersonaByQuery("correo = '"+correo+"'", null);
				orm.Equipo equipo = orm.EquipoDAO.loadEquipoByQuery("nombre = '"+team+"'", null);
				
				
				orm.Persona_equipo lormPerTeam = orm.Persona_equipoDAO.createPersona_equipo();
				
				lormPerTeam.setEquipo(equipo);
				lormPerTeam.setPersona(persona);
				
				orm.Persona_equipoDAO.save(lormPerTeam);
				t.commit();
				return "exito";
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
	
	public String asignarRol(int[] id_roles, String correo){
		
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				
				orm.Persona per = orm.PersonaDAO.loadPersonaByQuery("correo = '"+correo+"'", null);
				orm.Persona_Rol lormPerTeam = orm.Persona_RolDAO.createPersona_Rol();
				
				if(id_roles.length>0){
					for	(int c=0; c<id_roles.length;c++){
						orm.Rol rol = orm.RolDAO.loadRolByQuery("id ="+id_roles[c], null);
						
						lormPerTeam.setId_Rol(rol);
						lormPerTeam.setId_Persona(per);
						
						orm.Persona_RolDAO.save(lormPerTeam);
					}
				}else{
					String condRol = "id_Rol = ";
					String condPer = "id_Persona = ";
					for	(int c=0; c<id_roles.length;c++){
						orm.Persona_Rol rol = orm.Persona_RolDAO.loadPersona_RolByQuery(condRol+id_roles[c]+" and "+
																	condPer+per.getId(), null);
						
						orm.Persona_RolDAO.delete(rol);
					}
				}
				
				t.commit();
				return "exito";
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
	
}
