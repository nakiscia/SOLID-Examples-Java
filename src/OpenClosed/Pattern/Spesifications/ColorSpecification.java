package OpenClosed.Pattern.Spesifications;

import OpenClosed.Pattern.Enums.GeneralEnumaration;
import OpenClosed.Pattern.Product.Product;
import OpenClosed.Pattern.Interfaces.Spesification;

// For adding new spesification we don't need to add methods to Filter class..
// Instead of modification, we extend the spesifications
public class ColorSpecification implements Spesification<Product> {
  GeneralEnumaration.Color color;
  public ColorSpecification(GeneralEnumaration.Color color) {
    this.color = color;
  }

  @Override
  public boolean isSatisfied(Product item) {
    return item.color == this.color;
  }
}
