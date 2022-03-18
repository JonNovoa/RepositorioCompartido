package prueba;

public class Autor {
	private String dni;
	private String nombre;
	private String compania;
	
	
	public Autor(String dni, String nombre, String compania) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.compania = compania;
	}

	public Autor() {
		super();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	

}
