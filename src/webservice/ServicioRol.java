package webservice;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import domain.PersonaRolVO;
import domain.PersonaVO;
import orm.Persona_Rol;

public class ServicioRol {
	/*
	public orm.Persona_Rol[] listarRol(String name) throws PersistentException{
		
		orm.Persona_Rol[] ormPersona_Rols = 
		
		return ormPersona_Rols;
		
	}*/
	
	public ArrayList<domain.PersonaRolVO> obtenerPersonaRol(String correo){
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				
				orm.Persona p = orm.PersonaDAO.loadPersonaByQuery("correo = '"+correo+"'", null);
				
				//orm.Persona_Rol[] ormPersona_Rols = orm.Persona_RolDAO.listPersona_RolByQuery(null, null);
				orm.Persona_Rol[] pr = orm.Persona_RolDAO.listPersona_RolByQuery("id_Persona = "+p.getId(), null);
				
				ArrayList<domain.PersonaRolVO> personas = new ArrayList<PersonaRolVO>();
				
				for(int c=0; c<pr.length;c++){
					
					PersonaRolVO var = new PersonaRolVO(
							pr[c].getId_Rol(),
							pr[c].getId_Persona()
							);
					personas.add(var);
					
				}
				
				//PersonaRolVO prol = new PersonaRolVO(ormPersona_Rols.getId_Rol(), ormPersona_Rols.getId_Persona());
				
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

}
