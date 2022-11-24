package org.erkamber.services.interfaces;

import org.erkamber.dtos.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findProductByCategory(String productCategory);

    ProductDto findProductByCode(String code);

    void addNewProduct(ProductDto newProductDto);

    void deleteProductByID(int productID);

    void deleteProductByCode(String code);

    void updateProduct(ProductDto productDto);

    ProductDto findProductByID(int searchedProductID);

    List<ProductDto> findAllProducts();
}