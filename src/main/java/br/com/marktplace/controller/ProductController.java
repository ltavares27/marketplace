package br.com.marktplace.controller;

import br.com.marktplace.domain.dto.ProductDto;
import br.com.marktplace.service.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImp productServiceImp;

    @Autowired
    public ProductController(ProductServiceImp productServiceImp) {
        this.productServiceImp = productServiceImp;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody ProductDto product) {
        return ResponseEntity.ok(productServiceImp.save(product));
    }

}
