package com.ejemplo.biblioteca;

public class Libro extends Persona {

	private String T�tulo;
	private String ISBN;
	private String P�ginas;
	private String Edici�n;
	private String Editorial;
	
	public String getT�tulo() {
		return T�tulo;
	}
	public void setT�tulo(String t�tulo) {
		T�tulo = t�tulo;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getP�ginas() {
		return P�ginas;
	}
	public void setP�ginas(String p�ginas) {
		P�ginas = p�ginas;
	}
	public String getEdici�n() {
		return Edici�n;
	}
	public void setEdici�n(String edici�n) {
		Edici�n = edici�n;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	@Override
	public String toString() {
		return "Libro [T�tulo=" + T�tulo + ", ISBN=" + ISBN + ", P�ginas=" + P�ginas + ", Edici�n=" + Edici�n
				+ ", Editorial=" + Editorial + "]";
	}
	

	
	
}
