package domain;

import orm.Club;
import orm.Persona;

public class ClubPersonaVO {
	
	private orm.Club id_club;
	private orm.Persona id_Persona;
	
	public ClubPersonaVO() {
		super();
	}

	public ClubPersonaVO(Club id_club, Persona id_Persona) {
		super();
		this.id_club = id_club;
		this.id_Persona = id_Persona;
	}

	public orm.Club getId_club() {
		return id_club;
	}

	public void setId_club(orm.Club id_club) {
		this.id_club = id_club;
	}

	public orm.Persona getId_Persona() {
		return id_Persona;
	}

	public void setId_Persona(orm.Persona id_Persona) {
		this.id_Persona = id_Persona;
	}
	
}
