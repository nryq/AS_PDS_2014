package domain;

public class PersonaVO {
	
	private String nombre;
	private String correo;
	private String clave;
	private String descripcion;
	
	public PersonaVO() {
		super();
	}

	

	public PersonaVO(String nombre, String correo, String clave,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.clave = clave;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
