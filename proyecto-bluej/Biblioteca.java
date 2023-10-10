/**
 * Representación de una biblioteca física.
 */
public class Biblioteca {
  private String nombre;
  private String direccion;
  private int telefono;
  private CatalogoLibros catalogoLibros;
  private CatalogoRevistas catalogoRevistas;

  /**
   * Constructor de la clase Biblioteca.
   * @param pNombre Nombre de la biblioteca.
   * @param pDireccion Dirección de la biblioteca.
   * @param pTelefono Número de teléfono de la biblioteca.
   */
  public Biblioteca(String pNombre, String pDireccion, int pTelefono) {
    setNombre(pNombre);
    setDireccion(pDireccion);
    setTelefono(pTelefono);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String pNombre) {
    nombre = pNombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String pDireccion) {
    direccion = pDireccion;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int pTelefono) {
    telefono = pTelefono;
  }

  public CatalogoLibros geCatalogoLibros() {
    return catalogoLibros;
  }

  public CatalogoRevistas geCatalogoRevistas() {
      return catalogoRevistas;
  }
}
