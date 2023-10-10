import java.util.ArrayList;

/**
 * Representación de un catálogo de libros.
 */
public class CatalogoRevistas {
  private String nombre;
  private int totalRevistas;
  private ArrayList<Revista> revistas;

  /**
   * Constructor de la clase CatalogoRevistas.
   * @param pNombre Nombre del catálogo.
   */
  public CatalogoRevistas(String pNombre) {
    setNombre(pNombre);
  }

  /**
   * Agrega una revista al catálogo.
   * @param pNombre Revista a agregar.
   */
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

  public String toString() {
    String n = "\n";
    String info = "";
    info += "Nombre: " + nombre + n;
    info += "Total de revistas: " + totalRevistas + n;
    info += "Revistas:" + n;
    for (Revista revista : revistas) {
      info += "- " + revista.getTitulo() + n;
    }
    return info;
  }
}
