import java.util.ArrayList;

/**
 * Representación de un catálogo de libros.
 */
public class CatalogoLibros {
  private String nombre;
  private int totalLibros;
  private ArrayList<Libro> libros;

  /**
   * Constructor de la clase CatalogoLibros.
   * @param pNombre Nombre del catálogo.
   */
  public CatalogoLibros(String pNombre) {
    setNombre(pNombre);
  }

  /**
   * Agrega un libro al catálogo.
   * @param pLibro Libro a agregar.
   */
  public void agregarLibro(Libro pLibro) {
    libros.add(pLibro);
    totalLibros++;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String pNombre) {
    nombre = pNombre;
  }

  public int getTotalLibros() {
    return totalLibros;
  }
}
