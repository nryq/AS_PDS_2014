package domain;

public class TerrenoVO {
	
	private String nombre;
	private String direccion;
	private int valor;
	private String descripcion;
	private String condiciones;
	
	public TerrenoVO() {
		super();
	}

	public TerrenoVO(String nombre, String direccion, int valor,
			String descripcion, String condiciones) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.valor = valor;
		this.descripcion = descripcion;
		this.condiciones = condiciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}

}
