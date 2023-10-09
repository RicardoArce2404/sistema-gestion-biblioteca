/**
 * Representación de una revista de una biblioteca
 */
public class Revista {
  private String titulo;
  private String editor;
  private int issn;
  private int stock;

  public Revista(String pTitulo, String pEditor, int pIssn, int pStock) {
    setTitulo(pTitulo);
    setEditor(pEditor);
    setIssn(pIssn);
    setStock(pStock);
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
}
