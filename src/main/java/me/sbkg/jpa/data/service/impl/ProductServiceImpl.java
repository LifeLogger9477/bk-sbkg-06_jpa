package me.sbkg.jpa.data.service.impl;

import me.sbkg.jpa.data.dao.ProductDAO;
import me.sbkg.jpa.data.dto.ProductDTO;
import me.sbkg.jpa.data.dto.ProductResponseDTO;
import me.sbkg.jpa.data.entity.Product;
import me.sbkg.jpa.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * author : ms.Lee
 * date   : 2024-01-04
 */
@Service
public class ProductServiceImpl implements ProductService {

  private final ProductDAO productDAO;

  @Autowired
  public ProductServiceImpl(ProductDAO productDAO) {

    this.productDAO = productDAO;
  }

  @Override
  public ProductResponseDTO getProduct(Long number) {

    Product product = productDAO.selectProduct( number );

    ProductResponseDTO productResponseDTO = new ProductResponseDTO();
    productResponseDTO.setNumber( product.getNumber() );
    productResponseDTO.setName( product.getName() );
    productResponseDTO.setPrice( product.getPrice() );
    productResponseDTO.setStock( product.getStock() );

    return productResponseDTO;
  }

  @Override
  public ProductResponseDTO saveProduct(ProductDTO prodcutDTO) {

    Product product = new Product();
    product.setName( prodcutDTO.getName() );
    product.setPrice( prodcutDTO.getPrice() );
    product.setStock( prodcutDTO.getStock() );
    product.setCreatedAt( LocalDateTime.now() );
    product.setUpdatedAt( LocalDateTime.now() );

    Product savedProduct = productDAO.insertProduct( product );

    ProductResponseDTO productResponseDTO = new ProductResponseDTO();
    productResponseDTO.setNumber( savedProduct.getNumber() );
    productResponseDTO.setName( savedProduct.getName() );
    productResponseDTO.setPrice( savedProduct.getPrice() );
    productResponseDTO.setStock( savedProduct.getStock() );

    return productResponseDTO;
  }

  @Override
  public ProductResponseDTO changeProductName(Long number, String name) {

    Product changeProduct = productDAO.updateProductName( number, name );

    ProductResponseDTO productResponseDTO = new ProductResponseDTO();
    productResponseDTO.setNumber( changeProduct.getNumber() );
    productResponseDTO.setName( changeProduct.getName() );
    productResponseDTO.setPrice( changeProduct.getPrice() );
    productResponseDTO.setStock( changeProduct.getStock() );

    return productResponseDTO;
  }

  @Override
  public void deleteProduct(Long number) {

    productDAO.deleteProduct( number );
  }
}
