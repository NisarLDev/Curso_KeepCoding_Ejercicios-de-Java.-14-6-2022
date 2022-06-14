package com.ejemplo.biblioteca;

public class Libro extends Persona {

	private String Título;
	private String ISBN;
	private String Páginas;
	private String Edición;
	private String Editorial;
	
	public String getTítulo() {
		return Título;
	}
	public void setTítulo(String título) {
		Título = título;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPáginas() {
		return Páginas;
	}
	public void setPáginas(String páginas) {
		Páginas = páginas;
	}
	public String getEdición() {
		return Edición;
	}
	public void setEdición(String edición) {
		Edición = edición;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	@Override
	public String toString() {
		return "Libro [Título=" + Título + ", ISBN=" + ISBN + ", Páginas=" + Páginas + ", Edición=" + Edición
				+ ", Editorial=" + Editorial + "]";
	}
	

	
	
}
