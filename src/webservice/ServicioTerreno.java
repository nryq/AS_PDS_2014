package webservice;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.Terreno;

public class ServicioTerreno {


	PersistentTransaction t;
	
	public String crearAnuncioTerreno(domain.TerrenoVO oTerrenoVO) {
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Terreno lormTerreno = orm.TerrenoDAO.createTerreno();
				// Initialize the properties of the persistent object here
				lormTerreno.setNombre(oTerrenoVO.getNombre());
				lormTerreno.setDireccion(oTerrenoVO.getDescripcion());
				lormTerreno.setValor(oTerrenoVO.getValor());
				lormTerreno.setDescripcion(oTerrenoVO.getDescripcion());
				lormTerreno.setCondiciones(oTerrenoVO.getCondiciones());
				
				System.out.println("Ingreso Exitoso");
				orm.TerrenoDAO.save(lormTerreno);
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
	
	public String unirTerrenoPersona(String correo, String nombre_terreno){
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				
				orm.Persona persona = orm.PersonaDAO.loadPersonaByQuery("correo = '"+correo+"'", null);
				orm.Terreno terreno = orm.TerrenoDAO.loadTerrenoByQuery("nombre = '"+nombre_terreno+"'", null);
				
				orm.Persona_Terreno lormPerTer = orm.Persona_TerrenoDAO.createPersona_Terreno();
				
				lormPerTer.setId_Persona(persona);
				lormPerTer.setId_Terreno(terreno);
				
				System.out.println("Ingreso Exitoso");
				orm.Persona_TerrenoDAO.save(lormPerTer);
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
	
	public String borrarTerreno(int id){
		
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

	public orm.Terreno[] BuscarTerreno(){
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Terreno[] ormPersonas = orm.TerrenoDAO.listTerrenoByQuery( null, null);
				
				t.commit();
				return ormPersonas;
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
