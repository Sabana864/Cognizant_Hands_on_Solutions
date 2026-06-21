package Design_Principles.Exercise1;

public class SingleTest {
  public static void main(String[] args)
  {
    Logger l1 = Logger.getInstance();
    Logger l2 = Logger.getInstance();

    l1.log("App Started");
    l2.log("User logged in");

    System.out.println(l1==l2);
  }
}
