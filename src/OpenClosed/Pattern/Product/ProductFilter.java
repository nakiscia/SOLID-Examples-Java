package OpenClosed.Pattern.Product;

import OpenClosed.Pattern.Interfaces.Filter;
import OpenClosed.Pattern.Interfaces.Spesification;

import java.util.List;
import java.util.stream.Stream;

// New ProductFilter get the specification from its interface and
// it checks whether it satisfied or not through this interface.
// In this example, we are using Spesification Design Pattern.
public class ProductFilter implements Filter<Product> {

  @Override
  public Stream<Product> filter(List<Product> items, Spesification<Product> spec) {
    return items.stream().filter(product -> spec.isSatisfied(product));
  }
}
