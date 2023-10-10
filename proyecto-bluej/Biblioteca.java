import java.util.ArrayList;

/**
 * Representación de una biblioteca física.
 */
public class Biblioteca {
  private String nombre;
  private String direccion;
  private int telefono;
  private CatalogoLibros catalogoLibros;
  private CatalogoRevistas catalogoRevistas;
  private Bitacora bitacora;
  private ArrayList<Usuario> usuarios;
  private ArrayList<Empleado> empleados;

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

  public String verCatalogoLibros() {
    String info = "";
    for (Libro libro : catalogoLibros.getLibros()) {
      info += "Título: " + libro.getTitulo()
              + ". Autor: " + libro.getAutor()
              + ". Unidades disponibles: " + libro.getStock() + "\n";
    }
    return info;
  }

  public String verCatalogoRevistas() {
    String info = "";
    for (Revista revista : catalogoRevistas.getRevistas()) {
      info += "Título: " + revista.getTitulo()
              + ". Editor : " + revista.getEditor()
              + ". Unidades disponibles: " + revista.getStock() + "\n";
    }
    return info;
  }

  public void prestarLibro(Libro pLibro, Usuario pUsuario) {
    boolean libroEncontrado = false;
    boolean usuarioEncontrado = false;

    for (Libro libro : catalogoLibros.getLibros()) {
      if (libro.equals(pLibro)) {
        libroEncontrado = true;
      }
    }
    if (!libroEncontrado) {
      System.out.println("No se encontró el libro especificado en el catálogo.");
      return;
    }

    for (Usuario usuario : usuarios) {
      if (usuario.equals(pUsuario)) {
        usuarioEncontrado = true;
      }
    }
    if (!usuarioEncontrado) {
      System.out.println("No se encontró el usuario especificado.");
      return;
    }

    for (Libro libro : pUsuario.getLibrosPrestados()) {
      if (libro.equals(pLibro)) {
        System.out.println("El usuario especificado ya posee el libro especificado.");
        return;
      }
    }
    pUsuario.darLibro(pLibro);
    System.out.println("Libro entregado satisfactoriamente.");
  }

  public void quitarLibro(Libro pLibro, Usuario pUsuario) {
    boolean libroEncontrado = false;
    boolean usuarioEncontrado = false;

    for (Libro libro : catalogoLibros.getLibros()) {
      if (libro.equals(pLibro)) {
        libroEncontrado = true;
      }
    }
    if (!libroEncontrado) {
      System.out.println("No se encontró el libro especificado en el catálogo.");
      return;
    }

    for (Usuario usuario : usuarios) {
      if (usuario.equals(pUsuario)) {
        usuarioEncontrado = true;
      }
    }
    if (!usuarioEncontrado) {
      System.out.println("No se encontró el usuario especificado.");
      return;
    }

    for (Libro libro : pUsuario.getLibrosPrestados()) {
      if (libro.equals(pLibro)) {
        pUsuario.quitarLibro(pLibro);
        System.out.println("Libro devuelto satisfactoriamente.");
        return;
      }
    }
    System.out.println("El usuario especificado no posee el libro especificado.");

  }

  public void prestarRevista(Revista pRevista, Usuario pUsuario) {
    boolean revistaEncontrada = false;
    boolean usuarioEncontrado = false;

    for (Revista revista : catalogoRevistas.getRevistas()) {
      if (revista.equals(pRevista)) {
        revistaEncontrada = true;
      }
    }
    if (!revistaEncontrada) {
      System.out.println("No se encontró la revista especificada en el catálogo.");
      return;
    }

    for (Usuario usuario : usuarios) {
      if (usuario.equals(pUsuario)) {
        usuarioEncontrado = true;
      }
    }
    if (!usuarioEncontrado) {
      System.out.println("No se encontró el usuario especificado.");
      return;
    }

    for (Revista revista : pUsuario.getRevistasPrestadas()) {
      if (revista.equals(pRevista)) {
        System.out.println("El usuario especificado ya posee la revista especificada.");
        return;
      }
    }
    pUsuario.darRevista(pRevista);
    System.out.println("Revista entregada satisfactoriamente.");
  }

  public void quitarRevista(Revista pRevista, Usuario pUsuario) {
    boolean revistaEncontrada = false;
    boolean usuarioEncontrado = false;

    for (Revista revista : catalogoRevistas.getRevistas()) {
      if (revista.equals(pRevista)) {
        revistaEncontrada = true;
      }
    }
    if (!revistaEncontrada) {
      System.out.println("No se encontró la revista especificada en el catálogo.");
      return;
    }

    for (Usuario usuario : usuarios) {
      if (usuario.equals(pUsuario)) {
        usuarioEncontrado = true;
      }
    }
    if (!usuarioEncontrado) {
      System.out.println("No se encontró el usuario especificado.");
      return;
    }

    for (Revista revista : pUsuario.getRevistasPrestadas()) {
      if (revista.equals(pRevista)) {
        pUsuario.quitarRevista(pRevista);
        System.out.println("Revista devuelta satisfactoriamente.");
        return;
      }
    }
    System.out.println("El usuario especificado no posee la revista especificada.");

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
