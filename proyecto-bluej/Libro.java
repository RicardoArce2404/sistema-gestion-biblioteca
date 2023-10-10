/**
 * Representación de un libro de una biblioteca
 */
public class Libro {
  private String titulo;
  private String autor;
  private int isbn;
  private int stock;

  /**
   * Constructor de la clase Libro.
   * @param pTitulo Título del libro.
   * @param pAutor Autor del libro.
   * @param pIsbn ISBN del libro.
   * @param pStockInicial Cantidad de unidades disponibles inicialmente del libro.
   */
  public Libro(String pTitulo, String pAutor, int pIsbn, int pStockInicial) {
    setTitulo(pTitulo);
    setAutor(pAutor);
    setIsbn(pIsbn);
    setStock(pStockInicial);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String pTitulo) {
    titulo = pTitulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String pAutor) {
    autor = pAutor;
  }

  public int getIsbn() {
    return isbn;
  }

  public void setIsbn(int pIsbn) {
    isbn = pIsbn;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int pStock) {
    stock = pStock;
  }
}
