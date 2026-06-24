package Design_Principles.Exercise2;

public class Main {
  public static void main(String[] args) {
    Doc d1 = DocFactory.createDoc("WORD");
    d1.open();
    Doc d2 = DocFactory.createDoc("PDF");
    d2.open();
    Doc d3 = DocFactory.createDoc("EXCEL");
    d3.open();
  }
}
