/**
 * Representación de un usuario de una biblioteca.
 */
public class Usuario {
  private String nombre;
  private String direccion;
  private String email;
  private int telefono;
  private int identificacion;

  public Usuario(String pNombre, String pDireccion, String pEmail,
                 int pTelefono, int pIdentificacion) {
    setNombre(pNombre);
    setDireccion(pDireccion);
    setEmail(pEmail);
    setTelefono(pTelefono);
    setIdentificacion(pIdentificacion);
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String pEmail) {
    email = pEmail;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int pTelefono) {
    telefono = pTelefono;
  }

  public int getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion(int pIdentificacion) {
    identificacion = pIdentificacion;
  }
}
