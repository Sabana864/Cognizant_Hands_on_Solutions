package DSA.Exercise7;

public class Binary {
  public static Product search(Product[] prods,int id)
  {
    int l = 0;
    int h = prods.length-1;
    while(l<=h)
    {
      int m = (l+h)/2;
      if(prods[m].prodId == id)
      {
        return prods[m];
      }
      else if(prods[m].prodId<id)
      {
        l = m+1;
      }
      else
      {
        h = m-1;
      }
    }
    return null;
  }
}
