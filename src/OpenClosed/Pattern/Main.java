package OpenClosed.Pattern;


import OpenClosed.Pattern.Enums.GeneralEnumaration;
import OpenClosed.Pattern.Product.Product;
import OpenClosed.Pattern.Product.ProductFilter;
import OpenClosed.Pattern.Spesifications.AndSpesification;
import OpenClosed.Pattern.Spesifications.ColorSpecification;
import OpenClosed.Pattern.Spesifications.SizeSpecification;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Product apple = new Product("Apple", GeneralEnumaration.Color.Green, GeneralEnumaration.Size.SMALL);
    Product house = new Product("House", GeneralEnumaration.Color.Black, GeneralEnumaration.Size.HUGE);
    Product pen = new Product("Pen", GeneralEnumaration.Color.Green, GeneralEnumaration.Size.SMALL);

    List<Product> productList = List.of(apple,house,pen);
    ProductFilter productFilter = new ProductFilter();
    productFilter.filter(productList,new ColorSpecification(GeneralEnumaration.Color.Green))
        .forEach(product -> System.out.println(product.name + " is green"));

    productFilter.filter(productList,new AndSpesification(List.of(
        new ColorSpecification(GeneralEnumaration.Color.Black),
        new SizeSpecification(GeneralEnumaration.Size.HUGE)))).forEach(product ->
        System.out.println(product.name + " is black and huge"));

  }
}
