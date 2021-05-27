package pe.com.servlet;

public class Person {
	private String nombre;
	public String apellido;
	public String cui;
	public Person() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCui(){
		return cui;
	}
	public void setCui(String cui){
		this.cui = cui;
	}
}
