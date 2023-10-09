import java.util.ArrayList;

/**
 * Representación de un catálogo de libros.
 */
public class CatalogoLibros {
  private String nombre;
  private int totalLibros;
  private ArrayList<Libro> libros;

  public CatalogoLibros(String pNombre) {
    setNombre(pNombre);
  }

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
