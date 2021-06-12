package com.learncommons.learncommonsmsproduct.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learncommons.learncommonsmscommons.dto.DTOProduct;
import com.learncommons.learncommonsmscommons.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final List<Product> PRODUCTS_ON_DATABASE = Arrays.asList(
    		new Product(1, "Nike", "training shoes", 50.0),
    		new Product(2, "Adidas", "Juventus t-shit", 80.0),
    		new Product(3, "Barilla", "pasta", 4.0)
    );

    
    
    @GetMapping("/{idProduct}")
    public ResponseEntity<DTOProduct> getProductByIdProduct( @PathVariable int idProduct ){
    	Product product = PRODUCTS_ON_DATABASE.stream()
    			.filter( p -> p.getIdProduct()==idProduct ).findFirst()
    			.orElseThrow( () -> new RuntimeException("id product '"+idProduct+"' not found") );
        return ResponseEntity.ok( product.toDTOProduct() );
    }

}
