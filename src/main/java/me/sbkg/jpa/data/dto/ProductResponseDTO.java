package me.sbkg.jpa.data.dto;

/**
 * author : ms.Lee
 * date   : 2024-01-04
 */
public class ProductResponseDTO {

  private Long number;
  private String name;
  private int price;
  private int stock;

  public ProductResponseDTO() {

  }

  public ProductResponseDTO(Long number, String name, int price, int stock) {

    this.number = number;
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public Long getNumber() {

    return number;
  }

  public void setNumber(Long number) {

    this.number = number;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public int getPrice() {

    return price;
  }

  public void setPrice(int price) {

    this.price = price;
  }

  public int getStock() {

    return stock;
  }

  public void setStock(int stock) {

    this.stock = stock;
  }

  public static ProductResponseDTOBuilder builder() {

    return new ProductResponseDTOBuilder();
  }

  public static class ProductResponseDTOBuilder {

    private Long number;
    private String name;
    private int price;
    private int stock;

    public ProductResponseDTOBuilder() {

    }

    public ProductResponseDTOBuilder number(Long number) {

      this.number = number;
      return this;
    }

    public ProductResponseDTOBuilder name(String name) {

      this.name = name;
      return this;
    }

    public ProductResponseDTOBuilder price(int price) {

      this.price = price;
      return this;
    }

    public ProductResponseDTOBuilder stock(int stock) {

      this.stock = stock;
      return this;
    }

    public ProductResponseDTO build() {

      return new ProductResponseDTO( number, name, price, stock );
    }

    public String toString() {

      return "ProductResponseDTO.ProductResponseDTOBuilder(" +
          "number=" + this.number +
          ", name=" + this.name +
          ", price=" + this.price +
          ", stock=" + this.stock + ")";
    }
  }
}
