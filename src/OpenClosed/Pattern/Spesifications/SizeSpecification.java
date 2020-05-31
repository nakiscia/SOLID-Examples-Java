package OpenClosed.Pattern.Spesifications;

import OpenClosed.Pattern.Enums.GeneralEnumaration;
import OpenClosed.Pattern.Product.Product;
import OpenClosed.Pattern.Interfaces.Spesification;

// For adding new spesification we don't need to add methods to Filter class..
// Instead of modification, we extend the spesifications
public class SizeSpecification implements Spesification<Product> {

  GeneralEnumaration.Size size;

  public SizeSpecification(GeneralEnumaration.Size size) {
    this.size = size;
  }

  @Override
  public boolean isSatisfied(Product item) {
    return item.size == this.size;
  }
}
