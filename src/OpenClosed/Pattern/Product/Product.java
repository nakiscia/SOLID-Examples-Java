package OpenClosed.Pattern.Product;

import OpenClosed.Pattern.Enums.GeneralEnumaration;

public class Product {
  public String name;
  public GeneralEnumaration.Color color;
  public GeneralEnumaration.Size size;

  public Product(String name, GeneralEnumaration.Color color, GeneralEnumaration.Size size) {
    this.name = name;
    this.color = color;
    this.size = size;
  }

}
