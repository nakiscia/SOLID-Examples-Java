package OpenClosed.AntiPattern;

import java.util.List;
import java.util.stream.Stream;

// The point of the OCP is that a class should open for extension but close for modification..
public class ProductFilter {
  // We implement the filter by color..
  public Stream<Product> filterByColor(List<Product> productList, GeneralEnumarations.Color color){
      return productList.stream().filter(p->p.color==color);
  }
  // Then we asked to implement filter by size so once again we are adding new method and directly modifying the
  // class and by this way we are obviously violating OCP.
  public Stream<Product> filterBySize(List<Product> products,GeneralEnumarations.Size size){
      return products.stream().filter(product -> product.size==size);
  }

  public Stream<Product> filterBySizeAndColor(List<Product> products,
                                              GeneralEnumarations.Color color,
                                              GeneralEnumarations.Size size){
          return products.stream().filter(product -> product.size == size && product.color == color);
  }

  // If product specification increase, filter method may increase..
  // This lead to another modifications.

}
