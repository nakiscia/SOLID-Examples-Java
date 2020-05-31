package OpenClosed.Pattern.Spesifications;

import OpenClosed.Pattern.Product.Product;
import OpenClosed.Pattern.Interfaces.Spesification;

import java.util.List;

// For adding new spesification we don't need to add methods to Filter class..
// Instead of modification, we extend the spesifications
public class AndSpesification implements Spesification<Product> {

  List<Spesification<Product>> spesifications;

  public AndSpesification(List<Spesification<Product>> spesifications) {
    this.spesifications = spesifications;
  }

  @Override
  public boolean isSatisfied(Product item) {
    for (Spesification<Product> t:
         spesifications) {
        if (!t.isSatisfied(item))
          return false;
    }
    return true;
  }
}
