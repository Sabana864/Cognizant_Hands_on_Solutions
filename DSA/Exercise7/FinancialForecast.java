package DSA.Exercise7;

public class FinancialForecast {
  public static double forecast(double c,double g,int y)
  {
    if(y == 0)
      return c;
    return forecast(c*(1+g), g, y-1);
  }
  public static void main(String[] args)
  {
    double curr = 10000;
    double grow = 0.10;
    int yrs = 3;
    double future = forecast(curr,grow,yrs);
    System.out.println("Future Value: "+future);
  }
}
