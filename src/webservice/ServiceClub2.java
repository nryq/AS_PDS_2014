package webservice;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import domain.ClubVO;

public class ServiceClub2 {
	/*
	public ArrayList<domain.ClubVO> BuscarClub(String n){
		
		PersistentTransaction t;
		
		try {
			t = orm.ProyectoPDSsemestre2PersistentManager.instance()
					.getSession().beginTransaction();
			
			try {
				orm.Club[] oc = orm.ClubDAO.listClubByQuery("nombre = '"+n+"'", null);
				
				ArrayList<domain.ClubVO> clubes = new ArrayList<ClubVO>();
				
				for(int c=0; c<oc.length;c++){
					
					clubes.add(new ClubVO(
							oc[c].getId_jefe(),
							oc[c].getNombre(),
							oc[c].getLocalidad(),
							oc[c].getDescripcion()
							));
					
				}
				return clubes;
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

}
