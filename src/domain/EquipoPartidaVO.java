package domain;

import orm.Equipo;
import orm.Partida;

public class EquipoPartidaVO {
	
	private orm.Partida partida;
	private orm.Equipo equipo;
	
	public EquipoPartidaVO() {
		super();
	}

	public EquipoPartidaVO(Partida partida, Equipo equipo) {
		super();
		this.partida = partida;
		this.equipo = equipo;
	}

	public orm.Partida getPartida() {
		return partida;
	}

	public void setPartida(orm.Partida partida) {
		this.partida = partida;
	}

	public orm.Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(orm.Equipo equipo) {
		this.equipo = equipo;
	}
	
}
