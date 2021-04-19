package it.prova.model;

public class Libro {

	private String titolo;
	private String genere;
	private Integer pagine;
	
	public Libro(String titolo, String genere, Integer pagine) {
		this.titolo = titolo;
		this.genere = genere;
		this.pagine = pagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Integer getPagine() {
		return pagine;
	}

	public void setPagine(Integer pagine) {
		this.pagine = pagine;
	}
	
}
