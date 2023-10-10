/**
 * Representación de una revista de una biblioteca
 */
public class Revista {
  private String titulo;
  private String editor;
  private int issn;
  private int stock;

  /**
   * Constructor de la clase Revista.
   * @param pTitulo Título de la revista.
   * @param pEditor Autor de la revista.
   * @param pIssn ISSN de la revista.
   * @param pStockInicial Cantidad de unidades disponibles inicialmente de la revista.
   */
  public Revista(String pTitulo, String pEditor, int pIssn, int pStockInicial) {
    setTitulo(pTitulo);
    setEditor(pEditor);
    setIssn(pIssn);
    setStock(pStockInicial);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String pTitulo) {
    titulo = pTitulo;
  }

  public String getEditor() {
    return editor;
  }

  public void setEditor(String pEditor) {
    editor = pEditor;
  }

  public int getIssn() {
    return issn;
  }

  public void setIssn(int pIssn) {
    issn = pIssn;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int pStock) {
    stock = pStock;
  }

  public String toString() {
    String n = "\n";
    String info = "";
    info += "Título: " + titulo + n;
    info += "Editor: " + editor + n;
    info += "ISSN: " + issn + n;
    info += "Unidades disponibles: " + stock + n;
    return info;
  }
}
