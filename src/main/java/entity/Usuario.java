package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_pass")
public class Usuario {
	@Column
	private String correo;
	@Column
	private String nombre;
	@Column
	private String claveNueva;
	@Column
	private String claveAntigua;
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private int cedula;

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClaveNueva() {
		return claveNueva;
	}
	public void setClaveNueva(String claveNueva) {
		this.claveNueva = claveNueva;
	}
	public String getClaveAntigua() {
		return claveAntigua;
	}
	public void setClaveAntigua(String claveAntigua) {
		this.claveAntigua = claveAntigua;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public Usuario() {
		super();
	}
	
}
