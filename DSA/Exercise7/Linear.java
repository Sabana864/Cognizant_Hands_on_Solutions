package DSA.Exercise7;

public class Linear {
  public static Product search(Product[] prods,int id)
  {
    for(Product p : prods)
    {
      if(p.prodId == id)
        return p;
    }
    return null;
  }
}
