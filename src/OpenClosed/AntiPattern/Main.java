package OpenClosed.AntiPattern;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Product apple = new Product("Apple", GeneralEnumarations.Color.Green, GeneralEnumarations.Size.SMALL);
    Product house = new Product("House", GeneralEnumarations.Color.Black, GeneralEnumarations.Size.HUGE);
    Product pen = new Product("Pen", GeneralEnumarations.Color.Green, GeneralEnumarations.Size.SMALL);

    List<Product> productList = List.of(apple,house,pen);
    ProductFilter pf = new ProductFilter();

    pf.filterByColor(productList, GeneralEnumarations.Color.Green)
        .forEach(product -> System.out.println("-"+product.name+" is green"));
  }
}
