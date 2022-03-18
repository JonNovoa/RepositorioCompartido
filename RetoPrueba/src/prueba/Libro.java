package prueba;

import java.util.ArrayList;
import java.util.List;

public class Libro {
	private String isbn;
	private float precio;
	private List<Autor> autores;
	
	public Libro() {
		super();
		this.autores = new ArrayList<Autor>();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	
}
