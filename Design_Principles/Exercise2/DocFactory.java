package Design_Principles.Exercise2;

public class DocFactory {
  public static Doc createDoc(String type)
  {
    if(type.equals("WORD"))
    {
      return new WordDoc();
    }
    if(type.equals("PDF"))
    {
      return new Pdf();
    }
    if(type.equals("EXCEL"))
    {
      return new Excel();
    }
    return null;
  }
}
