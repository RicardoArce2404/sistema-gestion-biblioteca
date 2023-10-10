import java.util.ArrayList;

/**
 * Representación de un usuario de una biblioteca.
 */
public class Usuario {
  private String nombre;
  private String direccion;
  private String email;
  private int telefono;
  private int identificacion;
  private ArrayList<Libro> librosPrestados;
  private ArrayList<Revista> revistasPrestadas;

  public Usuario(String pNombre, String pDireccion, String pEmail,
                 int pTelefono, int pIdentificacion) {
    setNombre(pNombre);
    setDireccion(pDireccion);
    setEmail(pEmail);
    setTelefono(pTelefono);
    setIdentificacion(pIdentificacion);
  }

  public void darLibro(Libro pLibro) {
    librosPrestados.add(pLibro);
  }

  public void quitarLibro(Libro pLibro) {
    librosPrestados.remove(pLibro);
  }

  public void darRevista(Revista pRevista) {
    revistasPrestadas.add(pRevista);
  }

  public void quitarRevista(Revista pRevista) {
    revistasPrestadas.remove(pRevista);
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

  public ArrayList<Libro> getLibrosPrestados() {
    return librosPrestados;
  }

  public ArrayList<Revista> getRevistasPrestadas() {
    return revistasPrestadas;
  }


  public void setIdentificacion(int pIdentificacion) {
    identificacion = pIdentificacion;
  }

  public String toString() {
    String n = "\n";
    String info = "";
    info += "Nombre: " + nombre + n;
    info += "Dirección: " + direccion + n;
    info += "Identificación: " + identificacion + n;
    info += "Número telefónico: " + telefono + n;
    info += "Correo electrónico: " + email + n;
    return info;
  }
}
