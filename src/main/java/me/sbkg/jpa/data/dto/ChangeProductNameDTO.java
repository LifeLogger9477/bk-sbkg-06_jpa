package me.sbkg.jpa.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * author : ms.Lee
 * date   : 2024-01-04
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChangeProductNameDTO {

  private Long number;
  private String name;
}
