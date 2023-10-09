import java.util.ArrayList;

/**
 * Representación de un catálogo de libros.
 */
public class CatalogoRevistas {
  private String nombre;
  private int totalRevistas;
  private ArrayList<Revista> revistas;

  public CatalogoRevistas(String pNombre) {
    setNombre(pNombre);
  }

  public void agregarRevista(Revista pRevista) {
    revistas.add(pRevista);
    totalRevistas++;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String pNombre) {
    nombre = pNombre;
  }

  public int getTotlRevistas() {
    return totalRevistas;
  }
}
