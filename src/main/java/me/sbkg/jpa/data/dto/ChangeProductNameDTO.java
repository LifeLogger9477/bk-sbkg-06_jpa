package me.sbkg.jpa.data.dto;

/**
 * author : ms.Lee
 * date   : 2024-01-04
 */
public class ChangeProductNameDTO {

  private Long number;
  private String name;

  public ChangeProductNameDTO() {

  }

  public ChangeProductNameDTO(Long number, String name) {

    this.number = number;
    this.name = name;
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
}
