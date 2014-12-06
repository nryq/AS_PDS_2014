package domain;

import orm.Equipo;

public class PartidaVO {
	
	private String lugar;
	private String fecha;
	private orm.Equipo eq_ganador;
	
	public PartidaVO() {
		super();
	}
	public PartidaVO(String lugar, String fecha, Equipo eq_ganador) {
		super();
		this.lugar = lugar;
		this.fecha = fecha;
		this.eq_ganador = eq_ganador;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public orm.Equipo getEq_ganador() {
		return eq_ganador;
	}
	public void setEq_ganador(orm.Equipo eq_ganador) {
		this.eq_ganador = eq_ganador;
	}

}
