package DSA.Exercise7;

public class Main {
  public static void main(String[] args) {
    Product[] prods = 
    {
      new Product(101, "Laptop", "Electronics"),
      new Product(102, "Phone", "Electronics"),
      new Product(103, "Watch", "Accessories")
    };

    Product p1 = Linear.search(prods, 101);
    Product p2 = Binary.search(prods, 103);
    if(p1!=null)
      System.out.println("Linear Search: "+p1.prodName);
    if(p2!=null)
      System.out.println("Binary Search: "+p2.prodName);
  }
}