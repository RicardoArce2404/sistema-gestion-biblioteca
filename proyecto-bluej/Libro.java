/**
 * Representación de un libro de una biblioteca
 */
public class Libro {
  private String titulo;
  private String autor;
  private int isbn;
  private int stock;

  public Libro(String pTitulo, String pAutor, int pIsbn, int pStock) {
    setTitulo(pTitulo);
    setAutor(pAutor);
    setIsbn(pIsbn);
    setStock(pStock);
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
