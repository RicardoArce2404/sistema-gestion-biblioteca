/**
 * Representación de una biblioteca física.
 */
public class Biblioteca {
  private String nombre;
  private String direccion;
  private int telefono;
  private Catalogo catalogoLibros;
  private Catalogo catalogoRevistas;

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
}
