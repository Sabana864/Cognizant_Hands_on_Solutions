package Design_Principles.Exercise1;

public class Logger {
  private static Logger inst;
  private Logger()
  {
    System.out.println("Logger Instance created");
  }
  public static Logger getInstance()
  {
    if(inst == null)
        inst = new Logger();
    return inst;
  }
  public void log(String mes)
  {
    System.out.println("Log message: "+mes);
  }
}
