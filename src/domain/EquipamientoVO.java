package domain;

import orm.Tipo_equip;

public class EquipamientoVO {
	
	private orm.Tipo_equip id_tipo;
	private String nombre;
	private String material;
	
	public EquipamientoVO(Tipo_equip id_tipo, String nombre, String material) {
		super();
		this.id_tipo = id_tipo;
		this.nombre = nombre;
		this.material = material;
	}
	public EquipamientoVO() {
		super();
	}
	public orm.Tipo_equip getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(orm.Tipo_equip id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

}
