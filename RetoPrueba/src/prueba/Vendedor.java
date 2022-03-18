package prueba;

import java.time.LocalDate;

public class Vendedor {




	private String dni;
	private LocalDate fContraracion;
	private int edad;
	
	
	@Override
	public String toString() {
		return "Vendedor [dni=" + dni + ", fContraracion=" + fContraracion + ", edad=" + edad + "]";
	}


	public Vendedor(String dni, LocalDate fContraracion, int edad) {
		super();
		this.dni = dni;
		this.fContraracion = fContraracion;
		this.edad = edad;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public LocalDate getfContraracion() {
		return fContraracion;
	}


	public void setfContraracion(LocalDate fContraracion) {
		this.fContraracion = fContraracion;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
