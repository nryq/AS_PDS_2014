package webservice;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm.Equipamiento;
import orm.Tipo_equip;

public class ServicioEquipamiento {
	
	
	PersistentTransaction t;

	public String nuevoEquipamiento(domain.EquipamientoVO oEquipVO) {

		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();

			try {
				orm.Equipamiento lormEquip = orm.EquipamientoDAO.createEquipamiento();
				// Initialize the properties of the persistent object here
				
				lormEquip.setId_tipo(oEquipVO.getId_tipo());
				lormEquip.setMaterial(oEquipVO.getMaterial());
				lormEquip.setNombre(oEquipVO.getNombre());
				
				System.out.println("Ingreso Exitoso");
				orm.EquipamientoDAO.save(lormEquip);
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
	
	public String unirEquipamientoPersona(String correoPersona, String nombreRep){
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();

			try {
				
				orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(
						"correo = '"+correoPersona+"'", null);
				
				orm.Equipamiento lormEquip = orm.EquipamientoDAO.loadEquipamientoByQuery("nombre = '"+nombreRep+"'", null);
				
				orm.Persona_Equipamiento lormPer_equip = orm.Persona_EquipamientoDAO.createPersona_Equipamiento();
				
				lormPer_equip.setId_Equipamiento(lormEquip);
				lormPer_equip.setId_Persona(lormPersona);

				System.out.println("Ingreso Exitoso");
				orm.Persona_EquipamientoDAO.save(lormPer_equip);
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
	
	public Tipo_equip getTipo_equip (int id){
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();

			try {
				
				orm.Tipo_equip lormPersona = orm.Tipo_equipDAO.loadTipo_equipByQuery(
						"id = "+id, null);
				
				t.commit();
				return lormPersona;
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
