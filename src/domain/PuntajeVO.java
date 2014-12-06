package domain;

public class PuntajeVO {
	
	private int bajas;
	private int muertes;
	private int victorias;
	private int derrotas;
	public PuntajeVO(int bajas, int muertes, int victorias, int derrotas) {
		super();
		this.bajas = bajas;
		this.muertes = muertes;
		this.victorias = victorias;
		this.derrotas = derrotas;
	}
	public PuntajeVO() {
		super();
	}
	public int getBajas() {
		return bajas;
	}
	public void setBajas(int bajas) {
		this.bajas = bajas;
	}
	public int getMuertes() {
		return muertes;
	}
	public void setMuertes(int muertes) {
		this.muertes = muertes;
	}
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

}
