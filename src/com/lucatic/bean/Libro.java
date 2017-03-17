package com.lucatic.bean;
/**
 * A class used to manage books.
 */
public class Libro extends Publicacion{
	private int idLibro;
	private int isbn;
	private String nombre;
	private String autor;
	private String sinopsis;
	private boolean descatalogado;
	private Edicion edicion;
	private Stock stock;
	private Valoracion valoracion;
	private Categoria categoria;
	
	/**
	 * Constructs a Libro object with null values.
	 */

	public Libro(){
		super();
	}
	
	/**
     * Constructs a Libro object with given values.
     * @param idLibro        ID automatically generated and unique for every book.
     * @param ISBN            The unique numeric commercial book identifier.
     * @param nombre        Name of the book.
     * @param autor            Author of the book.
     * @param sinopsis        Brief description of the book.
     * @param descatalogado   Shows if the book is discontinued.
     * @param categoria        The ID of a particular category.
     * @param idPublicacion    The ID of a particular publication.
     * @param valoracion        The ID of a particular valuation.
     */

	public Libro(int idLibro, int isbn, String nombre, String autor, String sinopsis, boolean descatalogado,
			Edicion edicion, Stock stock, Valoracion valoracion, Categoria categoria, int idPublicacion) {
		super(idPublicacion);
		this.idLibro = idLibro;
		this.isbn = isbn;
		this.nombre = nombre;
		this.autor = autor;
		this.sinopsis = sinopsis;
		this.descatalogado = descatalogado;
		this.edicion = edicion;
		this.stock = stock;
		this.valoracion = valoracion;
		this.categoria = categoria;
	}


	public int getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getSinopsis() {
		return sinopsis;
	}


	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}


	public boolean isDescatalogado() {
		return descatalogado;
	}


	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}


	public Edicion getEdicion() {
		return edicion;
	}


	public void setEdicion(Edicion edicion) {
		this.edicion = edicion;
	}


	public Stock getStock() {
		return stock;
	}


	public void setStock(Stock stock) {
		this.stock = stock;
	}


	public Valoracion getValoracion() {
		return valoracion;
	}


	public void setValoracion(Valoracion valoracion) {
		this.valoracion = valoracion;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return super.toString() + "Libro [idLibro=" + idLibro + ", isbn=" + isbn + ", nombre=" + nombre + ", autor=" + autor
				+ ", sinopsis=" + sinopsis + ", descatalogado=" + descatalogado + ", edicion=" + edicion + ", stock="
				+ stock + ", valoracion=" + valoracion + ", categoria=" + categoria + "]";
	}
	
	
	
}
